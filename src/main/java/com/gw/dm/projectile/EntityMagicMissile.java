package com.gw.dm.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class EntityMagicMissile extends EntityArrow {
	private int potionLevel = 2;
	private int age = 0;


	public EntityMagicMissile(World worldIn) {
		super(worldIn);
	}


	public EntityMagicMissile(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}


	public EntityMagicMissile(World worldIn, EntityLivingBase entity, int level) {
		super(worldIn, entity);
		potionLevel = level;
	}

	@Override
	public void onUpdate() {
		if (age++ > 100) {
			setDead();
		}
		super.onUpdate();
	}


	@Override
	protected void onHit(RayTraceResult var1) {
		if (!world.isRemote) {
			if (var1.entityHit != null && (var1.entityHit instanceof EntityLivingBase)) {
				EntityLivingBase foo = (EntityLivingBase) var1.entityHit;
				if(foo.isEntityUndead()) {
					foo.addPotionEffect(new PotionEffect(Potion
						.getPotionFromResourceLocation("instant_health"), 1, potionLevel));
				} else {
					foo.addPotionEffect(new PotionEffect(Potion
						.getPotionFromResourceLocation("instant_damage"), 1, potionLevel));
				}
			}
		}
		setDead();
	}


	@Override
	protected ItemStack getArrowStack() {
		return null;
	}


	@Override
	public boolean isInWater() {
		return false;
	}


	@Override
	public boolean isGlowing() {
		return true;
	}


	@Override
	public boolean isSilent() {
		return true;
	}


	@Override
	public boolean isInLava() {
		return false;
	}


	@SideOnly(Side.CLIENT)
	@Override
	public int getBrightnessForRender() {
		return 0xf000f0;
	}


	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		compound.setInteger("livecounter", age);
		super.writeEntityToNBT(compound);
	}


	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		age = compound.getInteger("livecounter");
		super.readEntityFromNBT(compound);
	}
}