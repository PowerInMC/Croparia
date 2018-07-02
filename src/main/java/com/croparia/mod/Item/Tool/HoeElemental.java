package com.croparia.mod.Item.Tool;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HoeElemental extends Item {
	private final float speed;
	protected Item.ToolMaterial theToolMaterial;

	public HoeElemental(Item.ToolMaterial material) {
		this.theToolMaterial = material;
		this.maxStackSize = 1;
		this.setMaxDamage(material.getMaxUses());
		this.setCreativeTab(CreativeTabs.TOOLS);
		this.speed = material.getAttackDamage() + 1.0F;
	}

	/**
	 * Called when a Block is right-clicked with this Item
	 */
	public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) 
	{
		ItemStack itemstack = stack.getHeldItem(pos);
		
		if(stack.isSneaking() == true)
		{
			if (!stack.canPlayerEdit(worldIn.offset(hand), hand, itemstack)) 
			{
				return EnumActionResult.FAIL;
			} 
			else 
			{
				int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
				if (hook != 0)
					return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

				IBlockState iblockstate = playerIn.getBlockState(worldIn);
				Block block = iblockstate.getBlock();

				if (hand != EnumFacing.DOWN && playerIn.isAirBlock(worldIn.up())) 
				{
						if (block == Blocks.GRASS || block == Blocks.GRASS_PATH || block == Blocks.DIRT) 
						{
							this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.WATER.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north().east(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).east(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).east(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).east(1), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.north().west(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).west(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).west(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).west(1), Blocks.FARMLAND.getDefaultState());
							
							this.setBlock(itemstack, stack, playerIn, worldIn.north().east(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).east(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).east(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).east(2), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.north().west(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).west(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).west(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).west(2), Blocks.FARMLAND.getDefaultState());
							
							this.setBlock(itemstack, stack, playerIn, worldIn.north().east(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).east(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).east(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).east(3), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.north().west(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).west(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).west(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).west(3), Blocks.FARMLAND.getDefaultState());
							
							this.setBlock(itemstack, stack, playerIn, worldIn.north().east(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).east(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).east(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).east(4), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.north().west(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2).west(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3).west(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4).west(4), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.north(), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.north(4), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south().east(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).east(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).east(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).east(2), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south().west(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).west(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).west(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).west(2), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south().east(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).east(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).east(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).east(3), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south().west(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).west(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).west(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).west(3), Blocks.FARMLAND.getDefaultState());
							
							this.setBlock(itemstack, stack, playerIn, worldIn.south().east(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).east(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).east(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).east(4), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south().west(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).west(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).west(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).west(4), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south().east(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).east(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).east(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).east(1), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south().west(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2).west(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3).west(1), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4).west(1), Blocks.FARMLAND.getDefaultState());

							this.setBlock(itemstack, stack, playerIn, worldIn.south(), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.south(4), Blocks.FARMLAND.getDefaultState());
							
							this.setBlock(itemstack, stack, playerIn, worldIn.east(), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.east(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.east(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.east(4), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.west(), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.west(2), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.west(3), Blocks.FARMLAND.getDefaultState());
							this.setBlock(itemstack, stack, playerIn, worldIn.west(4), Blocks.FARMLAND.getDefaultState());
							return EnumActionResult.SUCCESS;
						}
					
				}
			}

		}
		
		if (!stack.canPlayerEdit(worldIn.offset(hand), hand, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, stack, playerIn, worldIn);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = playerIn.getBlockState(worldIn);
            Block block = iblockstate.getBlock();

            if (hand != EnumFacing.DOWN && playerIn.isAirBlock(worldIn.up()))
            {
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.FARMLAND.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, stack, playerIn, worldIn, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                        case PODZOL:
                        	break;
         
                    }
                }
            }

        }
		return EnumActionResult.PASS;	
	}


	/**
	 * Current implementations of this method in child classes do not use the
	 * entry argument beside ev. They just raise the damage on the stack.
	 */
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(1, attacker);
		return true;
	}

	protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
		worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

		if (!worldIn.isRemote) {
			worldIn.setBlockState(pos, state, 11);
			stack.damageItem(1, player);
		}
	}

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	/**
	 * Returns the name of the material this tool is made from as it is declared
	 * in EnumToolMaterial (meaning diamond would return "EMERALD")
	 */
	public String getMaterialName() {
		return this.theToolMaterial.toString();
	}

	public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
		Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

		if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
			multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
					new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", 0.0D, 0));
			multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
					new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double) (this.speed - 4.0F), 0));
		}

		return multimap;
	}
}