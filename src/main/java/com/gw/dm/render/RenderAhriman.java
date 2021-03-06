package com.gw.dm.render;

import com.gw.dm.DungeonMobs;
import com.gw.dm.model.ModelAhriman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderAhriman extends RenderLiving {
	private static final ResourceLocation ahrimanTextures
			= new ResourceLocation(DungeonMobs.MODID + ":textures/entity/ahriman.png");
	protected ModelAhriman model;

	public RenderAhriman(RenderManager renderManager, ModelAhriman modelA, float f) {
		super(renderManager, modelA, f);
		model = (ModelAhriman) mainModel;
	}

	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return ahrimanTextures;
	}
}
