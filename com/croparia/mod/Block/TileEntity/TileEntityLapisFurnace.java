package com.croparia.mod.Block.TileEntity;




import com.croparia.mod.Block.Furnaces.BlockLapisFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class TileEntityLapisFurnace extends TileEntityLockable implements ITickable, ISidedInventory 
{
	private static final int[] SLOTS_TOP = { 0 };
	private static final int[] SLOTS_BOTTOM = { 2, 1 };
	private static final int[] SLOTS_SIDES = { 1 };
	private NonNullList<ItemStack> furnaceItemStacks;
	private int furnaceBurnTime;
	private int currentItemBurnTime;
	private int cookTime;
	private int totalCookTime;
	private String furnaceCustomName;
	IItemHandler handlerTop;
	IItemHandler handlerBottom;
	IItemHandler handlerSide;

	public TileEntityLapisFurnace() {
		this.furnaceItemStacks = NonNullList.withSize(3, ItemStack.EMPTY);

		this.handlerTop = new SidedInvWrapper(this, EnumFacing.UP);
		this.handlerBottom = new SidedInvWrapper(this, EnumFacing.DOWN);
		this.handlerSide = new SidedInvWrapper(this, EnumFacing.WEST);
	}

	public int getSizeInventory()
	{
		return this.furnaceItemStacks.size();
	}

	public boolean isEmpty() 
	{
		for (ItemStack itemstack : this.furnaceItemStacks) 
		{
			if (!(itemstack.isEmpty())) {
				return false;
			}
		}

		return true;
	}

	public ItemStack getStackInSlot(int index) 
	{
		return ((ItemStack) this.furnaceItemStacks.get(index));
	}

	public ItemStack decrStackSize(int index, int count) 
	{
		
		return ItemStackHelper.getAndSplit(this.furnaceItemStacks, index, count);
		
	}

	public ItemStack removeStackFromSlot(int index) 
	{
		
		return ItemStackHelper.getAndRemove(this.furnaceItemStacks, index);
		
	}

	public void setInventorySlotContents(int index, ItemStack stack) 
	{
		ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(index);
		boolean flag = (!(stack.isEmpty())) && (stack.isItemEqual(itemstack))
				&& (ItemStack.areItemStackTagsEqual(stack, itemstack));
		this.furnaceItemStacks.set(index, stack);

		if (stack.getCount() > getInventoryStackLimit()) 
		{
			stack.setCount(getInventoryStackLimit());
		}

		if ((index != 0) || (flag))
			return;
		this.totalCookTime = getCookTime(stack);
		this.cookTime = 0;
		markDirty();
	}

	public String getName() 
	{
		return ((hasCustomName()) ? this.furnaceCustomName : "container.lapis_furnace");
	}

	public boolean hasCustomName() 
	{
		return ((this.furnaceCustomName != null) && (!(this.furnaceCustomName.isEmpty())));
	}

	public void setCustomInventoryName(String p_145951_1_)
	{
		this.furnaceCustomName = p_145951_1_;
	}

	public static void registerFixesFurnace(DataFixer fixer)
	{
		fixer.registerWalker(FixTypes.BLOCK_ENTITY,
				new ItemStackDataLists(TileEntityFurnace.class, new String[] { "Items" }));
	}

	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		this.furnaceItemStacks = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, this.furnaceItemStacks);
		this.furnaceBurnTime = compound.getInteger("BurnTime");
		this.cookTime = compound.getInteger("CookTime");
		this.totalCookTime = compound.getInteger("CookTimeTotal");
		this.currentItemBurnTime = getItemBurnTime((ItemStack) this.furnaceItemStacks.get(1));

		if (!(compound.hasKey("CustomName", 8)))
			return;
		this.furnaceCustomName = compound.getString("CustomName");
	}

	public NBTTagCompound writeToNBT(NBTTagCompound compound) 
	{
		super.writeToNBT(compound);
		compound.setInteger("BurnTime", (short) this.furnaceBurnTime);
		compound.setInteger("CookTime", (short) this.cookTime);
		compound.setInteger("CookTimeTotal", (short) this.totalCookTime);
		ItemStackHelper.saveAllItems(compound, this.furnaceItemStacks);

		if (hasCustomName())
		{
			compound.setString("CustomName", this.furnaceCustomName);
		}

		return compound;
	}

	public int getInventoryStackLimit()
	{
		return 64;
	}

	public boolean isBurning() 
	{
		return (this.furnaceBurnTime > 0);
	}

	@SideOnly(Side.CLIENT)
	public static boolean isBurning(IInventory inventory) 
	{
		return (inventory.getField(0) > 0);
	}

	public void update() {
		boolean flag = isBurning();
		boolean flag1 = false;

		if (isBurning()) {
			this.furnaceBurnTime -= 1;
		}

		if (!(this.world.isRemote)) 
		{
			ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(1);

			if ((isBurning())
					|| ((!(itemstack.isEmpty())) && (!(((ItemStack) this.furnaceItemStacks.get(0)).isEmpty()))))
			{
				if ((!(isBurning())) && (canSmelt())) 
				{
					this.furnaceBurnTime = getItemBurnTime(itemstack);
					this.currentItemBurnTime = this.furnaceBurnTime;

					if (isBurning()) 
					{
						flag1 = true;

						if (!(itemstack.isEmpty())) 
						{
							Item item = itemstack.getItem();
							itemstack.shrink(1);

							if (itemstack.isEmpty()) 
							{
								ItemStack item1 = item.getContainerItem(itemstack);
								this.furnaceItemStacks.set(1, item1);
							}
						}
					}
				}

				if ((isBurning()) && (canSmelt())) 
				{
					this.cookTime += 1;

					if (this.cookTime == this.totalCookTime) 
					{
						this.cookTime = 0;
						this.totalCookTime = getCookTime((ItemStack) this.furnaceItemStacks.get(0));
						smeltItem();
						flag1 = true;
					}
				} 
				else 
				{				
					this.cookTime = 0;
				}
			} 
			else if ((!(isBurning())) && (this.cookTime > 0))
			{
				this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
			}

			if (flag != isBurning())
			{
				flag1 = true;
				BlockLapisFurnace.setState(isBurning(), this.world, this.pos);
			}
		}

		if (!(flag1))
			return;
		markDirty();
	}

	public int getCookTime(ItemStack stack) 
	{
		return 200 - 22*6;
	}

	private boolean canSmelt() 
	{
		if (((ItemStack) this.furnaceItemStacks.get(0)).isEmpty()) 
		{
			return false;
		}

		ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult((ItemStack) this.furnaceItemStacks.get(0));

		if (itemstack.isEmpty()) 
		{
			return false;
		}

		ItemStack itemstack1 = (ItemStack) this.furnaceItemStacks.get(2);
		if (itemstack1.isEmpty())
			return true;
		if (!(itemstack1.isItemEqual(itemstack)))
			return false;
		int result = itemstack1.getCount() + itemstack.getCount();
		return ((result <= getInventoryStackLimit()) && (result <= itemstack1.getMaxStackSize()));
	}

	public void smeltItem() 
	{
		if (!(canSmelt()))
			return;
		ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(0);
		ItemStack itemstack1 = FurnaceRecipes.instance().getSmeltingResult(itemstack);
		ItemStack itemstack2 = (ItemStack) this.furnaceItemStacks.get(2);

		if (itemstack2.isEmpty()) 
		{
			this.furnaceItemStacks.set(2, itemstack1.copy());
		} 
		else if (itemstack2.getItem() == itemstack1.getItem())
		{
			itemstack2.grow(itemstack1.getCount());
		}

		if ((itemstack.getItem() == Item.getItemFromBlock(Blocks.SPONGE)) && (itemstack.getMetadata() == 1)
				&& (!(((ItemStack) this.furnaceItemStacks.get(1)).isEmpty()))
				&& (((ItemStack) this.furnaceItemStacks.get(1)).getItem() == Items.BUCKET)) {
			this.furnaceItemStacks.set(1, new ItemStack(Items.WATER_BUCKET));
		}

		itemstack.shrink(1);
	}

	public static int getItemBurnTime(ItemStack stack) 
	{
		if (stack.isEmpty())
		{
			return 0;
		}

		Item item = stack.getItem();

		if ((item instanceof ItemBlock) && (Block.getBlockFromItem(item) != Blocks.AIR))
		{
			Block block = Block.getBlockFromItem(item);

			if (block == Blocks.WOODEN_SLAB) 
			{
				return 150;
			}

			if (block.getDefaultState().getMaterial() == Material.WOOD) 
			{
				return 300;
			}

			if (block == Blocks.COAL_BLOCK) 
			{
				return 16000;
			}
		}

		if ((item instanceof ItemTool) && ("WOOD".equals(((ItemTool) item).getToolMaterialName())))
			return 200;
		if ((item instanceof ItemSword) && ("WOOD".equals(((ItemSword) item).getToolMaterialName())))
			return 200;
		if ((item instanceof ItemHoe) && ("WOOD".equals(((ItemHoe) item).getMaterialName())))
			return 200;
		if (item == Items.STICK)
			return 100;
		if (item == Items.COAL)
			return 1600;
		if (item == Items.LAVA_BUCKET)
			return 20000;
		if (item == Item.getItemFromBlock(Blocks.SAPLING))
			return 100;
		if (item == Items.BLAZE_ROD)
			return 2400;
		return GameRegistry.getFuelValue(stack);
	}

	public static boolean isItemFuel(ItemStack stack)
	{
		return (getItemBurnTime(stack) > 0);
	}

	public boolean isUsableByPlayer(EntityPlayer player) 
	{
		return (this.world.getTileEntity(this.pos) == this);
	}

	public void openInventory(EntityPlayer player)
	{
	}

	public void closeInventory(EntityPlayer player) 
	{
	}

	public boolean isItemValidForSlot(int index, ItemStack stack)
	{
		if (index == 2) {
			return false;
		}
		if (index != 1) {
			return true;
		}

		ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(1);
		return ((isItemFuel(stack)) || ((SlotFurnaceFuel.isBucket(stack)) && (itemstack.getItem() != Items.BUCKET)));
	}

	public int[] getSlotsForFace(EnumFacing side)
	{
		return ((side == EnumFacing.UP) ? SLOTS_TOP : (side == EnumFacing.DOWN) ? SLOTS_BOTTOM : SLOTS_SIDES);
	}

	public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction)
	{
		return isItemValidForSlot(index, itemStackIn);
	}

	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
	{
		if ((direction == EnumFacing.DOWN) && (index == 1)) {
			Item item = stack.getItem();

			if ((item != Items.WATER_BUCKET) && (item != Items.BUCKET)) 
			{
				return false;
			}
		}

		return true;
	}

	public String getGuiID() 
	{
		return "minecraft:furnace";
	}

	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
	{
		return new ContainerFurnace(playerInventory, this);
	}

	public int getField(int id)
	{
		switch (id) {
		case 0:
			return this.furnaceBurnTime;
		case 1:
			return this.currentItemBurnTime;
		case 2:
			return this.cookTime;
		case 3:
			return this.totalCookTime;
		}
		return 0;
	}

	public void setField(int id, int value)
	{
		switch (id) {
		case 0:
			this.furnaceBurnTime = value;
			break;
		case 1:
			this.currentItemBurnTime = value;
			break;
		case 2:
			this.cookTime = value;
			break;
		case 3:
			this.totalCookTime = value;
		}
	}

	public int getFieldCount()
	{
		return 4;
	}

	public void clear()
	{
		this.furnaceItemStacks.clear();
	}

}
