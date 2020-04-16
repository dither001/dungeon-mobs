package com.gw.dm.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelHookHorror extends ModelBase {

	ModelRenderer LeftLegLow;
	ModelRenderer LeftFoot;
	ModelRenderer RightLegLow;
	ModelRenderer RightLegTop;
	ModelRenderer LeftLegTop;
	ModelRenderer RightBackToe;
	ModelRenderer BodyTop;
	ModelRenderer BodyLow;
	ModelRenderer BackRight;
	ModelRenderer BackLeft;
	ModelRenderer Spine;
	ModelRenderer Chest;
	ModelRenderer RightFoot;
	ModelRenderer RightToes;
	ModelRenderer Neck;
	ModelRenderer Crest;
	ModelRenderer BeakLow;
	ModelRenderer BeakTop;
	ModelRenderer Head;
	ModelRenderer LeftShoulder;
	ModelRenderer RightShoulder;
	ModelRenderer LeftArmHigh;
	ModelRenderer LeftArmMid;
	ModelRenderer RightArmHigh;
	ModelRenderer LeftClawHigh;
	ModelRenderer LeftToes;
	ModelRenderer LeftBackToe;
	ModelRenderer LeftClawMid;
	ModelRenderer RightClawHigh;
	ModelRenderer RightArmMid;
	ModelRenderer LeftClawLow;
	ModelRenderer RightClawMid;
	ModelRenderer RightClawLow;

	public ModelHookHorror() {
		textureWidth = 64;
		textureHeight = 32;

		LeftLegLow = new ModelRenderer(this, 0, 0);
		LeftLegLow.addBox(-1.5F, 4.2F, -5.7F, 3, 9, 3);
		LeftLegLow.setRotationPoint(-4F, 9.5F, -0.4F);
		LeftLegLow.setTextureSize(64, 32);
		LeftLegLow.mirror = true;
		setRotation(LeftLegLow, 0.3490659F, 0F, 0F);

		LeftFoot = new ModelRenderer(this, 0, 0);
		LeftFoot.addBox(-2F, 12.5F, -4F, 4, 2, 6);
		LeftFoot.setRotationPoint(4F, 9.5F, -0.4F);
		LeftFoot.setTextureSize(64, 32);
		LeftFoot.mirror = true;
		setRotation(LeftFoot, 0F, 0F, 0F);

		RightLegLow = new ModelRenderer(this, 0, 0);
		RightLegLow.addBox(-1.5F, 0F, -1.5F, 3, 8, 3);
		RightLegLow.setRotationPoint(4F, 15F, -3F);
		RightLegLow.setTextureSize(64, 32);
		RightLegLow.mirror = true;
		setRotation(RightLegLow, 0.3490659F, 0F, 0F);

		RightLegTop = new ModelRenderer(this, 0, 0);
		RightLegTop.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
		RightLegTop.setRotationPoint(-4F, 9.5F, -0.4F);
		RightLegTop.setTextureSize(64, 32);
		RightLegTop.mirror = true;
		setRotation(RightLegTop, -0.3839724F, 0F, 0F);

		LeftLegTop = new ModelRenderer(this, 0, 0);
		LeftLegTop.addBox(-1.5F, 0F, -1.5F, 3, 7, 3);
		LeftLegTop.setRotationPoint(4F, 9.5F, -0.4F);
		LeftLegTop.setTextureSize(64, 32);
		LeftLegTop.mirror = true;
		setRotation(LeftLegTop, -0.3839724F, 0F, 0F);

		RightBackToe = new ModelRenderer(this, 0, 29);
		RightBackToe.addBox(-0.5F, 13F, 1F, 1, 1, 2);
		RightBackToe.setRotationPoint(-4F, 9.5F, -0.4F);
		RightBackToe.setTextureSize(64, 32);
		RightBackToe.mirror = true;
		setRotation(RightBackToe, 0F, 0F, 0F);

		BodyTop = new ModelRenderer(this, 0, 0);
		BodyTop.addBox(-6F, 0F, 0F, 12, 12, 4);
		BodyTop.setRotationPoint(0F, -7F, -8F);
		BodyTop.setTextureSize(64, 32);
		BodyTop.mirror = true;
		setRotation(BodyTop, 0.418879F, 0F, 0F);

		BodyLow = new ModelRenderer(this, 0, 0);
		BodyLow.addBox(-6F, 0F, 0F, 12, 10, 4);
		BodyLow.setRotationPoint(0F, 1F, -4F);
		BodyLow.setTextureSize(64, 32);
		BodyLow.mirror = true;
		setRotation(BodyLow, 0.2094395F, 0F, 0F);

		BackRight = new ModelRenderer(this, 0, 0);
		BackRight.addBox(-4F, 0F, 0F, 8, 14, 2);
		BackRight.setRotationPoint(-4F, -7F, -4F);
		BackRight.setTextureSize(64, 32);
		BackRight.mirror = true;
		setRotation(BackRight, 0.3490659F, -0.1745329F, 0F);

		BackLeft = new ModelRenderer(this, 0, 0);
		BackLeft.addBox(-4F, 0F, 0F, 8, 14, 2);
		BackLeft.setRotationPoint(4F, -7F, -4F);
		BackLeft.setTextureSize(64, 32);
		BackLeft.mirror = true;
		setRotation(BackLeft, 0.3490659F, 0.1745329F, 0F);

		Spine = new ModelRenderer(this, 0, 0);
		Spine.addBox(-1F, 0F, 0F, 2, 13, 1);
		Spine.setRotationPoint(0F, -4F, -2F);
		Spine.setTextureSize(64, 32);
		Spine.mirror = true;
		setRotation(Spine, 0.2443461F, 0F, 0F);

		Chest = new ModelRenderer(this, 44, 19);
		Chest.addBox(-4F, 0F, 0F, 8, 11, 2);
		Chest.setRotationPoint(0F, -4F, -8F);
		Chest.setTextureSize(64, 32);
		Chest.mirror = true;
		setRotation(Chest, 0.4886922F, 0F, 0F);

		RightFoot = new ModelRenderer(this, 0, 0);
		RightFoot.addBox(-2F, 12.5F, -4F, 4, 2, 6);
		RightFoot.setRotationPoint(-4F, 9.5F, -0.4F);
		RightFoot.setTextureSize(64, 32);
		RightFoot.mirror = true;
		setRotation(RightFoot, 0F, 0F, 0F);

		RightToes = new ModelRenderer(this, 0, 29);
		RightToes.addBox(-1.5F, 13F, -5F, 3, 1, 2);
		RightToes.setRotationPoint(-4F, 9.5F, -0.4F);
		RightToes.setTextureSize(64, 32);
		RightToes.mirror = true;
		setRotation(RightToes, 0F, 0F, 0F);

		Neck = new ModelRenderer(this, 0, 0);
		Neck.addBox(-2F, 0F, -2F, 4, 4, 5);
		Neck.setRotationPoint(0F, -8F, -8F);
		Neck.setTextureSize(64, 32);
		Neck.mirror = true;
		setRotation(Neck, 0F, 0F, 0F);

		Crest = new ModelRenderer(this, 38, 0);
		Crest.addBox(-0.5F, -5F, -7F, 1, 2, 6);
		Crest.setRotationPoint(0F, -6F, -9F);
		Crest.setTextureSize(64, 32);
		Crest.mirror = true;
		setRotation(Crest, 0F, 0F, 0F);

		BeakLow = new ModelRenderer(this, 4, 21);
		BeakLow.addBox(-2F, -2F, -12F, 4, 2, 5);
		BeakLow.setRotationPoint(0F, -6F, -9F);
		BeakLow.setTextureSize(64, 32);
		BeakLow.mirror = true;
		setRotation(BeakLow, 0.4363323F, 0F, 0F);

		BeakTop = new ModelRenderer(this, 0, 23);
		BeakTop.addBox(-2F, 0F, -12F, 4, 2, 5);
		BeakTop.setRotationPoint(0F, -6F, -9F);
		BeakTop.setTextureSize(64, 32);
		BeakTop.mirror = true;
		setRotation(BeakTop, 0F, 0F, 0F);

		Head = new ModelRenderer(this, 38, 0);
		Head.addBox(-3F, -3F, -7F, 6, 6, 7);
		Head.setRotationPoint(0F, -6F, -9F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);

		LeftShoulder = new ModelRenderer(this, 0, 0);
		LeftShoulder.addBox(-6F, 0F, 0F, 6, 5, 5);
		LeftShoulder.setRotationPoint(9F, -6F, -8F);
		LeftShoulder.setTextureSize(64, 32);
		LeftShoulder.mirror = true;
		setRotation(LeftShoulder, 0.3490659F, 0F, 0F);

		RightShoulder = new ModelRenderer(this, 0, 0);
		RightShoulder.addBox(0F, 0F, 0F, 6, 5, 5);
		RightShoulder.setRotationPoint(-9F, -6F, -8F);
		RightShoulder.setTextureSize(64, 32);
		RightShoulder.mirror = true;
		setRotation(RightShoulder, 0.3490659F, 0F, 0F);

		LeftArmHigh = new ModelRenderer(this, 0, 0);
		LeftArmHigh.addBox(-2F, -2F, -9F, 4, 4, 9);
		LeftArmHigh.setRotationPoint(6.5F, -4F, -6F);
		LeftArmHigh.setTextureSize(64, 32);
		LeftArmHigh.mirror = true;
		setRotation(LeftArmHigh, 0.3490659F, 0F, 0F);

		LeftArmMid = new ModelRenderer(this, 0, 21);
		LeftArmMid.addBox(-1.5F, -1.5F, -17F, 3, 3, 8);
		LeftArmMid.setRotationPoint(6.5F, -4F, -6F);
		LeftArmMid.setTextureSize(64, 32);
		LeftArmMid.mirror = true;
		setRotation(LeftArmMid, 0.3490659F, 0F, 0F);

		RightArmHigh = new ModelRenderer(this, 0, 0);
		RightArmHigh.addBox(-2F, -2F, -9F, 4, 4, 9);
		RightArmHigh.setRotationPoint(-6.5F, -4F, -6F);
		RightArmHigh.setTextureSize(64, 32);
		RightArmHigh.mirror = true;
		setRotation(RightArmHigh, 0.3490659F, 0F, 0F);

		LeftClawHigh = new ModelRenderer(this, 0, 21);
		LeftClawHigh.addBox(-1F, 10F, -17F, 2, 2, 6);
		LeftClawHigh.setRotationPoint(6.5F, -4F, -6F);
		LeftClawHigh.setTextureSize(64, 32);
		LeftClawHigh.mirror = true;
		setRotation(LeftClawHigh, -0.4363323F, 0F, 0F);

		LeftToes = new ModelRenderer(this, 0, 29);
		LeftToes.addBox(-1.5F, 13F, -5F, 3, 1, 2);
		LeftToes.setRotationPoint(4F, 9.5F, -0.4F);
		LeftToes.setTextureSize(64, 32);
		LeftToes.mirror = true;
		setRotation(LeftToes, 0F, 0F, 0F);

		LeftBackToe = new ModelRenderer(this, 0, 29);
		LeftBackToe.addBox(-0.5F, 13F, 1F, 1, 1, 2);
		LeftBackToe.setRotationPoint(4F, 9.5F, -0.4F);
		LeftBackToe.setTextureSize(64, 32);
		LeftBackToe.mirror = true;
		setRotation(LeftBackToe, 0F, 0F, 0F);

		LeftClawMid = new ModelRenderer(this, 0, 21);
		LeftClawMid.addBox(-1F, -11.7F, -23F, 2, 2, 7);
		LeftClawMid.setRotationPoint(6.5F, -4F, -6F);
		LeftClawMid.setTextureSize(64, 32);
		LeftClawMid.mirror = true;
		setRotation(LeftClawMid, 0.7330383F, 0F, 0F);

		RightClawHigh = new ModelRenderer(this, 0, 21);
		RightClawHigh.addBox(-1F, 10F, -17F, 2, 2, 6);
		RightClawHigh.setRotationPoint(-6.5F, -4F, -6F);
		RightClawHigh.setTextureSize(64, 32);
		RightClawHigh.mirror = true;
		setRotation(RightClawHigh, -0.4363323F, 0F, 0F);

		RightArmMid = new ModelRenderer(this, 0, 21);
		RightArmMid.addBox(-1.5F, -1.5F, -17F, 3, 3, 8);
		RightArmMid.setRotationPoint(-6.5F, -4F, -6F);
		RightArmMid.setTextureSize(64, 32);
		RightArmMid.mirror = true;
		setRotation(RightArmMid, 0.3490659F, 0F, 0F);

		LeftClawLow = new ModelRenderer(this, 0, 21);
		LeftClawLow.addBox(-1F, 23.3F, -7F, 2, 2, 7);
		LeftClawLow.setRotationPoint(6.5F, -4F, -6F);
		LeftClawLow.setTextureSize(64, 32);
		LeftClawLow.mirror = true;
		setRotation(LeftClawLow, -1.047198F, 0F, 0F);

		RightClawMid = new ModelRenderer(this, 0, 21);
		RightClawMid.addBox(-1F, -11.7F, -23F, 2, 2, 7);
		RightClawMid.setRotationPoint(-6.5F, -4F, -6F);
		RightClawMid.setTextureSize(64, 32);
		RightClawMid.mirror = true;
		setRotation(RightClawMid, 0.7330383F, 0F, 0F);

		RightClawLow = new ModelRenderer(this, 0, 21);
		RightClawLow.addBox(-1F, 23.3F, -7F, 2, 2, 7);
		RightClawLow.setRotationPoint(-6.5F, -4F, -6F);
		RightClawLow.setTextureSize(64, 32);
		RightClawLow.mirror = true;
		setRotation(RightClawLow, -1.047198F, 0F, 0F);
	}


	@Override
	public void render(Entity entity, float f, float f1, float f2,
	                   float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		LeftLegLow.render(f5);
		LeftFoot.render(f5);
		RightLegLow.render(f5);
		RightLegTop.render(f5);
		LeftLegTop.render(f5);
		RightBackToe.render(f5);
		BodyTop.render(f5);
		BodyLow.render(f5);
		BackRight.render(f5);
		BackLeft.render(f5);
		Spine.render(f5);
		Chest.render(f5);
		RightFoot.render(f5);
		RightToes.render(f5);
		Neck.render(f5);
		Crest.render(f5);
		BeakLow.render(f5);
		BeakTop.render(f5);
		Head.render(f5);
		LeftShoulder.render(f5);
		RightShoulder.render(f5);
		LeftArmHigh.render(f5);
		LeftArmMid.render(f5);
		RightArmHigh.render(f5);
		LeftClawHigh.render(f5);
		LeftToes.render(f5);
		LeftBackToe.render(f5);
		LeftClawMid.render(f5);
		RightClawHigh.render(f5);
		RightArmMid.render(f5);
		LeftClawLow.render(f5);
		RightClawMid.render(f5);
		RightClawLow.render(f5);
	}


	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}


	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent) {
		this.Head.rotateAngleY = f3 / 57.29578F;
		this.Head.rotateAngleX = f4 / 57.29578F;
		this.Crest.rotateAngleY = f3 / 57.29578F;
		this.Crest.rotateAngleX = f4 / 57.29578F;
		this.BeakTop.rotateAngleY = f3 / 57.29578F;
		this.BeakTop.rotateAngleX = f4 / 57.29578F;
		this.BeakLow.rotateAngleY = f3 / 57.29578F;
		this.BeakLow.rotateAngleX = 0.4363323F + (f4 / 57.29578F);

		this.LeftLegLow.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.LeftLegTop.rotateAngleX = -0.3839724F + MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.LeftFoot.rotateAngleX = MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.LeftBackToe.rotateAngleX = MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.LeftToes.rotateAngleX = MathHelper.cos(f * 0.5662F) * 1.4F * f1;

		this.RightLegLow.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.RightLegTop.rotateAngleX = -0.3839724F + MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.RightFoot.rotateAngleX = MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.RightBackToe.rotateAngleX = MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.RightToes.rotateAngleX = MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;

		this.RightArmHigh.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.RightArmMid.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.RightClawHigh.rotateAngleX = -0.4363323F - MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.RightClawMid.rotateAngleX = 0.7330383F - MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.RightClawLow.rotateAngleX = -1.047198F - MathHelper.cos(f * 0.5662F) * 1.4F * f1;
		this.RightShoulder.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F) * 1.4F * f1;

		this.LeftArmHigh.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.LeftArmMid.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.LeftClawHigh.rotateAngleX = -0.4363323F - MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.LeftClawMid.rotateAngleX = 0.7330383F - MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.LeftClawLow.rotateAngleX = -1.047198F - MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
		this.LeftShoulder.rotateAngleX = 0.3490659F - MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1;
	}

}
