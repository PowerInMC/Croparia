package com.croparia.mod.Block.TileEntity;




import com.croparia.mod.Block.Furnaces.BlockDiamondFurnace;

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

public class TileEntityDiamondFurnace extends TileEntityLockable implements ITickable, ISidedInventory 
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

	public TileEntityDiamondFurnace() {
		this.furnaceItemStacks = NonNullList.func_191197_a(3, ItemStack.field_190927_a);

		this.handlerTop = new SidedInvWrapper(this, EnumFacing.UP);
		this.handlerBottom = new SidedInvWrapper(this, EnumFacing.DOWN);
		this.handlerSide = new SidedInvWrapper(this, EnumFacing.WEST);
	}

	public int func_70302_i_()
	{
		return this.furnaceItemStacks.size();
	}

	public boolean func_191420_l() 
	{
		for (ItemStack itemstack : this.furnaceItemStacks) 
		{
			if (!(itemstack.func_190926_b())) {
				return false;
			}
		}

		return true;
	}

	public ItemStack func_70301_a(int index) 
	{
		return ((ItemStack) this.furnaceItemStacks.get(index));
	}

	public ItemStack func_70298_a(int index, int count) 
	{
		
		return ItemStackHelper.func_188382_a(this.furnaceItemStacks, index, count);
		
	}

	public ItemStack func_70304_b(int index) 
	{
		
		return ItemStackHelper.func_188383_a(this.furnaceItemStacks, index);
		
	}

	public void func_70299_a(int index, ItemStack stack) 
	{
		ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(index);
		boolean flag = (!(stack.func_190926_b())) && (stack.func_77969_a(itemstack))
				&& (ItemStack.func_77970_a(stack, itemstack));
		this.furnaceItemStacks.set(index, stack);

		if (stack.func_190916_E() > func_70297_j_()) 
		{
			stack.func_190920_e(func_70297_j_());
		}

		if ((index != 0) || (flag))
			return;
		this.totalCookTime = getCookTime(stack);
		this.cookTime = 0;
		func_70296_d();
	}

	public String func_70005_c_() 
	{
		return ((func_145818_k_()) ? this.furnaceCustomName : "container.diamond_furnace");
	}

	public boolean func_145818_k_() 
	{
		return ((this.furnaceCustomName != null) && (!(this.furnaceCustomName.isEmpty())));
	}

	public void setCustomInventoryName(String p_145951_1_)
	{
		this.furnaceCustomName = p_145951_1_;
	}

	public static void registerFixesFurnace(DataFixer fixer)
	{
		fixer.func_188258_a(FixTypes.BLOCK_ENTITY,
				new ItemStackDataLists(TileEntityFurnace.class, new String[] { "Items" }));
	}

	public void func_145839_a(NBTTagCompound compound) 
	{
		super.func_145839_a(compound);
		this.furnaceItemStacks = NonNullList.func_191197_a(func_70302_i_(), ItemStack.field_190927_a);
		ItemStackHelper.func_191283_b(compound, this.furnaceItemStacks);
		this.furnaceBurnTime = compound.func_74762_e("BurnTime");
		this.cookTime = compound.func_74762_e("CookTime");
		this.totalCookTime = compound.func_74762_e("CookTimeTotal");
		this.currentItemBurnTime = getItemBurnTime((ItemStack) this.furnaceItemStacks.get(1));

		if (!(compound.func_150297_b("CustomName", 8)))
			return;
		this.furnaceCustomName = compound.func_74779_i("CustomName");
	}

	public NBTTagCompound func_189515_b(NBTTagCompound compound) 
	{
		super.func_189515_b(compound);
		compound.func_74768_a("BurnTime", (short) this.furnaceBurnTime);
		compound.func_74768_a("CookTime", (short) this.cookTime);
		compound.func_74768_a("CookTimeTotal", (short) this.totalCookTime);
		ItemStackHelper.func_191282_a(compound, this.furnaceItemStacks);

		if (func_145818_k_())
		{
			compound.func_74778_a("CustomName", this.furnaceCustomName);
		}

		return compound;
	}

	public int func_70297_j_()
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
		return (inventory.func_174887_a_(0) > 0);
	}

	public void func_73660_a() {
		boolean flag = isBurning();
		boolean flag1 = false;

		if (isBurning()) {
			this.furnaceBurnTime -= 1;
		}

		if (!(this.field_145850_b.field_72995_K)) 
		{
			ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(1);

			if ((isBurning())
					|| ((!(itemstack.func_190926_b())) && (!(((ItemStack) this.furnaceItemStacks.get(0)).func_190926_b()))))
			{
				if ((!(isBurning())) && (canSmelt())) 
				{
					this.furnaceBurnTime = getItemBurnTime(itemstack);
					this.currentItemBurnTime = this.furnaceBurnTime;

					if (isBurning()) 
					{
						flag1 = true;

						if (!(itemstack.func_190926_b())) 
						{
							Item item = itemstack.func_77973_b();
							itemstack.func_190918_g(1);

							if (itemstack.func_190926_b()) 
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
				this.cookTime = MathHelper.func_76125_a(this.cookTime - 2, 0, this.totalCookTime);
			}

			if (flag != isBurning())
			{
				flag1 = true;
				BlockDiamondFurnace.setState(isBurning(), this.field_145850_b, this.field_174879_c);
			}
		}

		if (!(flag1))
			return;
		func_70296_d();
	}

	public int getCookTime(ItemStack stack) 
	{
		return 200 - 22*7;
	}

	private boolean canSmelt() 
	{
		if (((ItemStack) this.furnaceItemStacks.get(0)).func_190926_b()) 
		{
			return false;
		}

		ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a((ItemStack) this.furnaceItemStacks.get(0));

		if (itemstack.func_190926_b()) 
		{
			return false;
		}

		ItemStack itemstack1 = (ItemStack) this.furnaceItemStacks.get(2);
		if (itemstack1.func_190926_b())
			return true;
		if (!(itemstack1.func_77969_a(itemstack)))
			return false;
		int result = itemstack1.func_190916_E() + itemstack.func_190916_E();
		return ((result <= func_70297_j_()) && (result <= itemstack1.func_77976_d()));
	}

	public void smeltItem() 
	{
		if (!(canSmelt()))
			return;
		ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(0);
		ItemStack itemstack1 = FurnaceRecipes.func_77602_a().func_151395_a(itemstack);
		ItemStack itemstack2 = (ItemStack) this.furnaceItemStacks.get(2);

		if (itemstack2.func_190926_b()) 
		{
			this.furnaceItemStacks.set(2, itemstack1.func_77946_l());
		} 
		else if (itemstack2.func_77973_b() == itemstack1.func_77973_b())
		{
			itemstack2.func_190917_f(itemstack1.func_190916_E());
		}

		if ((itemstack.func_77973_b() == Item.func_150898_a(Blocks.field_150360_v)) && (itemstack.func_77960_j() == 1)
				&& (!(((ItemStack) this.furnaceItemStacks.get(1)).func_190926_b()))
				&& (((ItemStack) this.furnaceItemStacks.get(1)).func_77973_b() == Items.field_151133_ar)) {
			this.furnaceItemStacks.set(1, new ItemStack(Items.field_151131_as));
		}

		itemstack.func_190918_g(1);
	}

	public static int getItemBurnTime(ItemStack stack) 
	{
		if (stack.func_190926_b())
		{
			return 0;
		}

		Item item = stack.func_77973_b();

		if ((item instanceof ItemBlock) && (Block.func_149634_a(item) != Blocks.field_150350_a))
		{
			Block block = Block.func_149634_a(item);

			if (block == Blocks.field_150376_bx) 
			{
				return 150;
			}

			if (block.func_176223_P().func_185904_a() == Material.field_151575_d) 
			{
				return 300;
			}

			if (block == Blocks.field_150402_ci) 
			{
				return 16000;
			}
		}

		if ((item instanceof ItemTool) && ("WOOD".equals(((ItemTool) item).func_77861_e())))
			return 200;
		if ((item instanceof ItemSword) && ("WOOD".equals(((ItemSword) item).func_150932_j())))
			return 200;
		if ((item instanceof ItemHoe) && ("WOOD".equals(((ItemHoe) item).func_77842_f())))
			return 200;
		if (item == Items.field_151055_y)
			return 100;
		if (item == Items.field_151044_h)
			return 1600;
		if (item == Items.field_151129_at)
			return 20000;
		if (item == Item.func_150898_a(Blocks.field_150345_g))
			return 100;
		if (item == Items.field_151072_bj)
			return 2400;
		return GameRegistry.getFuelValue(stack);
	}

	public static boolean isItemFuel(ItemStack stack)
	{
		return (getItemBurnTime(stack) > 0);
	}

	public boolean func_70300_a(EntityPlayer player) 
	{
		return (this.field_145850_b.func_175625_s(this.field_174879_c) == this);
	}

	public void func_174889_b(EntityPlayer player)
	{
	}

	public void func_174886_c(EntityPlayer player) 
	{
	}

	public boolean func_94041_b(int index, ItemStack stack)
	{
		if (index == 2) {
			return false;
		}
		if (index != 1) {
			return true;
		}

		ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(1);
		return ((isItemFuel(stack)) || ((SlotFurnaceFuel.func_178173_c_(stack)) && (itemstack.func_77973_b() != Items.field_151133_ar)));
	}

	public int[] func_180463_a(EnumFacing side)
	{
		return ((side == EnumFacing.UP) ? SLOTS_TOP : (side == EnumFacing.DOWN) ? SLOTS_BOTTOM : SLOTS_SIDES);
	}

	public boolean func_180462_a(int index, ItemStack itemStackIn, EnumFacing direction)
	{
		return func_94041_b(index, itemStackIn);
	}

	public boolean func_180461_b(int index, ItemStack stack, EnumFacing direction)
	{
		if ((direction == EnumFacing.DOWN) && (index == 1)) {
			Item item = stack.func_77973_b();

			if ((item != Items.field_151131_as) && (item != Items.field_151133_ar)) 
			{
				return false;
			}
		}

		return true;
	}

	public String func_174875_k() 
	{
		return "minecraft:furnace";
	}

	public Container func_174876_a(InventoryPlayer playerInventory, EntityPlayer playerIn)
	{
		return new ContainerFurnace(playerInventory, this);
	}

	public int func_174887_a_(int id)
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

	public void func_174885_b(int id, int value)
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

	public int func_174890_g()
	{
		return 4;
	}

	public void func_174888_l()
	{
		this.furnaceItemStacks.clear();
	}

}
