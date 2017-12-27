package com.croparia.mod.GUI;

import org.lwjgl.opengl.GL11;

import com.croparia.mod.Block.DayGiver.TileEntityDayGiver;

import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.Minecraft;

import java.util.Random;

@SuppressWarnings("unchecked")
public class GuiDayGiver {

	public static Object instance;

	public static int GUIID = 1;

	public GuiDayGiver() {
	}

	public void load(FMLInitializationEvent event) {
	}

	public void registerRenderers() {
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public static IInventory day;

	public static IInventory inherited;

	public static class GuiContainerMod extends Container {

		World world = null;
		EntityPlayer entity = null;
		int i, j, k;

		public GuiContainerMod(World world, int i, int j, int k, EntityPlayer player) {

			this.world = world;
			this.entity = player;
			this.i = i;
			this.j = j;
			this.k = k;

			TileEntity ent = world.func_175625_s(new BlockPos(i, j, k));
			if (ent != null && (ent instanceof TileEntityDayGiver))
				inherited = (IInventory) ent;
			else
				inherited = new InventoryBasic("", true, 9);

			day = new InventoryBasic("day", true, 1);
			this.func_75146_a(new Slot(day, 0, 83, 31) {
				public void func_75218_e() {
					super.func_75218_e();
					if (func_75216_d()) {
						EntityPlayer entity = Minecraft.func_71410_x().field_71439_g;
						int i = (int) entity.field_70165_t;
						int j = (int) entity.field_70163_u;
						int k = (int) entity.field_70161_v;
						MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
						World world = server.field_71305_c[0];

					}
				}
			});
			bindPlayerInventory(player.field_71071_by);

		}

		@Override
		public boolean func_75145_c(EntityPlayer player) {
			return true;
		}

		protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
			int i;
			int j;

			for (i = 0; i < 3; ++i) {
				for (j = 0; j < 9; ++j) {
					this.func_75146_a(new Slot(inventoryPlayer, j + (i + 1) * 9, 3 + 8 + j * 18, 0 + 84 + i * 18));
				}
			}

			for (i = 0; i < 9; ++i) {
				this.func_75146_a(new Slot(inventoryPlayer, i, 3 + 8 + i * 18, 0 + 142));
			}
		}

		@Override
		public ItemStack func_82846_b(EntityPlayer playerIn, int index) {
			ItemStack itemstack = null;
			Slot slot = (Slot) this.field_75151_b.get(index);

			if (slot != null && slot.func_75216_d()) {
				ItemStack itemstack1 = slot.func_75211_c();
				itemstack = itemstack1.func_77946_l();

				if (index < 9) {
					if (!this.func_75135_a(itemstack1, 9, (45 - 9), true)) {// fixes
																				// shiftclick
																				// error
						return null;
					}
				} else if (!this.func_75135_a(itemstack1, 0, 9, false)) {
					return null;
				}

				if (itemstack1.func_190916_E() == 0) {
					slot.func_75215_d((ItemStack) null);
				} else {
					slot.func_75218_e();
				}

				if (itemstack1.func_190916_E() == itemstack.func_190916_E()) {
					return null;
				}

				slot.func_190901_a(playerIn, itemstack1);
			}

			return itemstack;
		}

		public void func_75134_a(EntityPlayer playerIn) {
			super.func_75134_a(playerIn);

		}
	}

	public static class GuiWindow extends GuiContainer {

		int i = 0;
		int j = 0;
		int k = 0;
		EntityPlayer entity = null;

		public GuiWindow(World world, int i, int j, int k, EntityPlayer entity) {
			super(new GuiContainerMod(world, i, j, k, entity));
			this.i = i;
			this.j = j;
			this.k = k;
			this.entity = entity;
			this.field_146999_f = 182;
			this.field_147000_g = 166;
		}

		private static final ResourceLocation texture = new ResourceLocation("gui.png");

		@Override
		protected void func_146976_a(float par1, int par2, int par3) {
			int posX = (this.field_146294_l) / 2;
			int posY = (this.field_146295_m) / 2;
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.func_146276_q_();

			this.field_146297_k.field_71446_o.func_110577_a(texture);
			int k = (this.field_146294_l - this.field_146999_f) / 2;
			int l = (this.field_146295_m - this.field_147000_g) / 2;
			this.func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);

			field_73735_i = 100.0F;

		}

		@Override
		protected void func_73864_a(int par1, int par2, int par3) throws java.io.IOException {
			super.func_73864_a(par1, par2, par3);

		}

		@Override
		public void func_73876_c() {
			super.func_73876_c();
			int posX = (this.field_146294_l) / 2;
			int posY = (this.field_146295_m) / 2;

		}

		@Override
		protected void func_73869_a(char par1, int par2) throws java.io.IOException {

			super.func_73869_a(par1, par2);

		}

		@Override
		protected void func_146979_b(int par1, int par2) {
			int posX = (this.field_146294_l) / 2;
			int posY = (this.field_146295_m) / 2;

		}

		@Override
		public void func_146281_b() {
			super.func_146281_b();
			Keyboard.enableRepeatEvents(false);
		}

		@Override
		public void func_73866_w_() {
			super.func_73866_w_();
			this.field_147003_i = (this.field_146294_l - 182) / 2;
			this.field_147009_r = (this.field_146295_m - 166) / 2;
			Keyboard.enableRepeatEvents(true);
			this.field_146292_n.clear();
			int posX = (this.field_146294_l) / 2;
			int posY = (this.field_146295_m) / 2;

		}

		@Override
		protected void func_146284_a(GuiButton button) {
			MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
			World world = server.field_71305_c[0];

		}

		@Override
		public boolean func_73868_f() {
			return false;
		}

	}

}
