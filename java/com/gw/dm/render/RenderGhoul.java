package com.gw.dm.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import com.gw.dm.DungeonMobs;
import com.gw.dm.entity.EntityGhoul;
import com.gw.dm.model.ModelGhoul;

public class RenderGhoul extends RenderLiving {
	private static final ResourceLocation ghoulTextures 
			= new ResourceLocation(DungeonMobs.MODID, "textures/entity/ghoul.png");
	protected ModelGhoul model;
	
	public RenderGhoul(RenderManager renderManager, ModelGhoul modelG, float f)	{
		super(renderManager, modelG, f);
		mainModel = model = modelG;
	}
	/*
	public void renderGhoul(EntityGhoul entity, double par2, double par4, double par6, 
			float par8, float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}
	
	public void doRenderLiving(EntityLiving par1, double par2, double par4, double par6, 
			float par8, float par9) {
		renderGhoul((EntityGhoul)par1, par2, par4, par6, par8, par9);
	}
	
	public void doRender(Entity par1, double par2, double par4, 
			double par6, float par8, float par9) {
		renderGhoul((EntityGhoul)par1, par2, par4, par6, par8, par9);
	}
	*/
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return ghoulTextures;
    }
}