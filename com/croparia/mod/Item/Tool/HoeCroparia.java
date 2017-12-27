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
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HoeCroparia extends Item {
	private final float speed;
	protected Item.ToolMaterial theToolMaterial;

	public HoeCroparia(Item.ToolMaterial material) {
		this.theToolMaterial = material;
		this.field_77777_bU = 1;
		this.func_77656_e(material.func_77997_a());
		this.func_77637_a(CreativeTabs.field_78040_i);
		this.speed = material.func_78000_c() + 1.0F;
	}

	/**
	 * Called when a Block is right-clicked with this Item
	 */
	@SuppressWarnings("incomplete-switch")
	public EnumActionResult func_180614_a(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack itemstack = player.func_184586_b(hand);

		if (!player.func_175151_a(pos.func_177972_a(facing), facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
			if (hook != 0)
				return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

			IBlockState iblockstate = worldIn.func_180495_p(pos);
			Block block = iblockstate.func_177230_c();

			if (facing != EnumFacing.DOWN) 
			{
				if (worldIn.func_175697_a(pos, 3) && worldIn.func_175623_d(pos.func_177984_a())) 
				{
					if (block == Blocks.field_150349_c || block == Blocks.field_185774_da) 
					{
						this.setBlock(itemstack, player, worldIn, pos, Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177974_f(), Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177968_d(), Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177968_d().func_177974_f(), Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177968_d().func_177976_e(), Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177978_c(), Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177978_c().func_177974_f(), Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177978_c().func_177976_e(), Blocks.field_150458_ak.func_176223_P());
						this.setBlock(itemstack, player, worldIn, pos.func_177976_e(), Blocks.field_150458_ak.func_176223_P());
						return EnumActionResult.SUCCESS;
					}

					if (block == Blocks.field_150346_d) {
						switch ((BlockDirt.DirtType) iblockstate.func_177229_b(BlockDirt.field_176386_a)) 
						{
						case DIRT:
							this.setBlock(itemstack, player, worldIn, pos, Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177974_f(), Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177968_d(), Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177968_d().func_177974_f(), Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177968_d().func_177976_e(), Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177978_c(), Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177978_c().func_177974_f(), Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177978_c().func_177976_e(), Blocks.field_150458_ak.func_176223_P());
							this.setBlock(itemstack, player, worldIn, pos.func_177976_e(), Blocks.field_150458_ak.func_176223_P());
							return EnumActionResult.SUCCESS;
						case COARSE_DIRT:
							this.setBlock(itemstack, player, worldIn, pos, Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177974_f(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177968_d(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177968_d().func_177974_f(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177968_d().func_177976_e(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177978_c(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177978_c().func_177974_f(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177978_c().func_177976_e(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
							this.setBlock(itemstack, player, worldIn, pos.func_177976_e(), Blocks.field_150346_d.func_176223_P().func_177226_a(BlockDirt.field_176386_a, BlockDirt.DirtType.DIRT));
									
							return EnumActionResult.SUCCESS;
						}
					}
				}
			}

			return EnumActionResult.PASS;
		}
	}

	/**
	 * Current implementations of this method in child classes do not use the
	 * entry argument beside ev. They just raise the damage on the stack.
	 */
	public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.func_77972_a(1, attacker);
		return true;
	}

	protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
		worldIn.func_184133_a(player, pos, SoundEvents.field_187693_cj, SoundCategory.BLOCKS, 1.0F, 1.0F);

		if (!worldIn.field_72995_K) {
			worldIn.func_180501_a(pos, state, 11);
			stack.func_77972_a(1, player);
		}
	}

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	@SideOnly(Side.CLIENT)
	public boolean func_77662_d() {
		return true;
	}

	/**
	 * Returns the name of the material this tool is made from as it is declared
	 * in EnumToolMaterial (meaning diamond would return "EMERALD")
	 */
	public String getMaterialName() {
		return this.theToolMaterial.toString();
	}

	public Multimap<String, AttributeModifier> func_111205_h(EntityEquipmentSlot equipmentSlot) {
		Multimap<String, AttributeModifier> multimap = super.func_111205_h(equipmentSlot);

		if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
			multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(),
					new AttributeModifier(field_111210_e, "Weapon modifier", 0.0D, 0));
			multimap.put(SharedMonsterAttributes.field_188790_f.func_111108_a(),
					new AttributeModifier(field_185050_h, "Weapon modifier", (double) (this.speed - 4.0F), 0));
		}

		return multimap;
	}
}
