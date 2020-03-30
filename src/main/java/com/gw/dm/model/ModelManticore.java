package com.gw.dm.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelManticore extends ModelBase {
	
	//fields
	ModelRenderer bodySpines;
	ModelRenderer bodyBase;
	ModelRenderer bodyLow1;
	ModelRenderer bodyTop1;
	ModelRenderer tailSpines;
	ModelRenderer mouth;
	ModelRenderer neck;
	ModelRenderer earLeft;
	ModelRenderer head;
	ModelRenderer earRight;
	ModelRenderer bodyTop2;
	ModelRenderer tailHelper;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer RFShoulder;
	ModelRenderer RFLegTop;
	ModelRenderer RFPaw;
	ModelRenderer RFLegLow;
	ModelRenderer tail3;
	ModelRenderer RBShoulder;
	ModelRenderer RBLegTop;
	ModelRenderer RBLegLow;
	ModelRenderer RBPaw;
	ModelRenderer LFShoulder;
	ModelRenderer LFLegTop;
	ModelRenderer LFLegLow;
	ModelRenderer LFPaw;
	ModelRenderer LBShoulder;
	ModelRenderer LBLegTop;
	ModelRenderer LBLegLow;
	ModelRenderer LBPaw;
	ModelRenderer tail4;
	
	public ModelManticore() {
		textureWidth = 64;
		textureHeight = 32;
		
		bodySpines = new ModelRenderer(this, 40, 0);
		bodySpines.addBox(-0.5F, -3F, 0F, 1, 2, 11);
		bodySpines.setRotationPoint(0F, 11F, -3F);
		bodySpines.setTextureSize(64, 32);
		bodySpines.mirror = true;
		setRotation(bodySpines, 0F, 0F, 0F);
		
		bodyBase = new ModelRenderer(this, 0, 0);
		bodyBase.addBox(-4F, -1F, 0F, 8, 2, 18);
		bodyBase.setRotationPoint(0F, 15F, -6F);
		bodyBase.setTextureSize(64, 32);
		bodyBase.mirror = true;
		setRotation(bodyBase, 0F, 0F, 0F);
		
		bodyLow1 = new ModelRenderer(this, 6, 4);
		bodyLow1.addBox(-3F, -1F, 0F, 6, 2, 14);
		bodyLow1.setRotationPoint(0F, 17F, -5F);
		bodyLow1.setTextureSize(64, 32);
		bodyLow1.mirror = true;
		setRotation(bodyLow1, 0F, 0F, 0F);
		
		bodyTop1 = new ModelRenderer(this, 5, 3);
		bodyTop1.addBox(-3F, -1F, 0F, 6, 2, 15);
		bodyTop1.setRotationPoint(0F, 13F, -5F);
		bodyTop1.setTextureSize(64, 32);
		bodyTop1.mirror = true;
		setRotation(bodyTop1, 0F, 0F, 0F);
		
		tailSpines = new ModelRenderer(this, 28, 23);
		tailSpines.addBox(-2F, 13.8F, 8F, 4, 0, 5);
		tailSpines.setRotationPoint(0F, 14F, 11F);
		tailSpines.setTextureSize(64, 32);
		tailSpines.mirror = true;
		setRotation(tailSpines, 2.844887F, 0F, 0F);
		
		mouth = new ModelRenderer(this, 20, 28);
		mouth.addBox(-2F, -1F, -10F, 4, 3, 1);
		mouth.setRotationPoint(0F, 13.7F, -4F);
		mouth.setTextureSize(64, 32);
		mouth.mirror = true;
		setRotation(mouth, 0F, 0F, 0F);
		
		neck = new ModelRenderer(this, 18, 13);
		neck.addBox(-1.5F, -1.5F, -5F, 3, 3, 5);
		neck.setRotationPoint(0F, 13.7F, -4F);
		neck.setTextureSize(64, 32);
		neck.mirror = true;
		setRotation(neck, 0F, 0F, 0F);
		
		earLeft = new ModelRenderer(this, 20, 22);
		earLeft.addBox(2F, -3.5F, -6F, 1, 3, 3);
		earLeft.setRotationPoint(0F, 13.7F, -4F);
		earLeft.setTextureSize(64, 32);
		earLeft.mirror = true;
		setRotation(earLeft, 0F, 0F, 0F);
		
		head = new ModelRenderer(this, 0, 22);
		head.addBox(-2.5F, -3F, -9F, 5, 5, 5);
		head.setRotationPoint(0F, 13.7F, -4F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		
		earRight = new ModelRenderer(this, 20, 22);
		earRight.addBox(-3F, -3.5F, -6F, 1, 3, 3);
		earRight.setRotationPoint(0F, 13.7F, -4F);
		earRight.setTextureSize(64, 32);
		earRight.mirror = true;
		setRotation(earRight, 0F, 0F, 0F);
		
		bodyTop2 = new ModelRenderer(this, 10, 6);
		bodyTop2.addBox(-2F, -1F, 0F, 4, 2, 12);
		bodyTop2.setRotationPoint(0F, 11F, -4F);
		bodyTop2.setTextureSize(64, 32);
		bodyTop2.mirror = true;
		setRotation(bodyTop2, 0F, 0F, 0F);
		
		tailHelper = new ModelRenderer(this, 16, 12);
		tailHelper.addBox(-2F, 0F, 0F, 4, 2, 6);
		tailHelper.setRotationPoint(0F, 10F, 8F);
		tailHelper.setTextureSize(64, 32);
		tailHelper.mirror = true;
		setRotation(tailHelper, -0.7853982F, 0F, 0F);
		
		tail1 = new ModelRenderer(this, 46, 23);
		tail1.addBox(-1.5F, -1.5F, 0F, 3, 3, 6);
		tail1.setRotationPoint(0F, 14F, 11F);
		tail1.setTextureSize(64, 32);
		tail1.mirror = true;
		setRotation(tail1, 0.3141593F, 0F, 0F);
		
		tail2 = new ModelRenderer(this, 40, 20);
		tail2.addBox(-1F, 4F, 1F, 2, 2, 10);
		tail2.setRotationPoint(0F, 14F, 11F);
		tail2.setTextureSize(64, 32);
		tail2.mirror = true;
		setRotation(tail2, 1.518436F, 0F, 0F);
		
		RFShoulder = new ModelRenderer(this, 0, 0);
		RFShoulder.addBox(-3F, -1F, -1F, 3, 2, 3);
		RFShoulder.setRotationPoint(-3F, 16F, -3F);
		RFShoulder.setTextureSize(64, 32);
		RFShoulder.mirror = true;
		setRotation(RFShoulder, 0F, 0F, 0F);
		
		RFLegTop = new ModelRenderer(this, 0, 0);
		RFLegTop.addBox(-2.5F, -1F, 0F, 2, 2, 5);
		RFLegTop.setRotationPoint(-3F, 16F, -3F);
		RFLegTop.setTextureSize(64, 32);
		RFLegTop.mirror = true;
		setRotation(RFLegTop, -0.6283185F, 0F, 0F);
		
		RFPaw = new ModelRenderer(this, 0, 0);
		RFPaw.addBox(-3F, -8F, -1F, 3, 2, 4);
		RFPaw.setRotationPoint(-3F, 16F, -3F);
		RFPaw.setTextureSize(64, 32);
		RFPaw.mirror = true;
		setRotation(RFPaw, -3.141593F, 0F, 0F);
		
		RFLegLow = new ModelRenderer(this, 0, 0);
		RFLegLow.addBox(-2.5F, -5F, 0.9F, 2, 2, 5);
		RFLegLow.setRotationPoint(-3F, 16F, -3F);
		RFLegLow.setTextureSize(64, 32);
		RFLegLow.mirror = true;
		setRotation(RFLegLow, -2.199115F, 0F, 0F);
		
		tail3 = new ModelRenderer(this, 46, 20);
		tail3.addBox(-0.5F, 10F, 1F, 1, 1, 10);
		tail3.setRotationPoint(0F, 14F, 11F);
		tail3.setTextureSize(64, 32);
		tail3.mirror = true;
		setRotation(tail3, 2.530727F, 0F, 0F);
		
		RBShoulder = new ModelRenderer(this, 0, 0);
		RBShoulder.addBox(-1F, -1F, -1F, 3, 4, 4);
		RBShoulder.setRotationPoint(-5F, 14F, 5F);
		RBShoulder.setTextureSize(64, 32);
		RBShoulder.mirror = true;
		setRotation(RBShoulder, 0F, 0F, 0F);
		
		RBLegTop = new ModelRenderer(this, 0, 0);
		RBLegTop.addBox(-0.5F, -1F, 2F, 2, 2, 6);
		RBLegTop.setRotationPoint(-5F, 14F, 5F);
		RBLegTop.setTextureSize(64, 32);
		RBLegTop.mirror = true;
		setRotation(RBLegTop, -0.5235988F, 0F, 0F);
		
		RBLegLow = new ModelRenderer(this, 0, 0);
		RBLegLow.addBox(-0.5F, -8F, 0.8F, 2, 2, 5);
		RBLegLow.setRotationPoint(-5F, 14F, 5F);
		RBLegLow.setTextureSize(64, 32);
		RBLegLow.mirror = true;
		setRotation(RBLegLow, -2.129302F, 0F, 0F);
		
		RBPaw = new ModelRenderer(this, 0, 0);
		RBPaw.addBox(-1F, -10F, -4F, 3, 2, 4);
		RBPaw.setRotationPoint(-5F, 14F, 5F);
		RBPaw.setTextureSize(64, 32);
		RBPaw.mirror = true;
		setRotation(RBPaw, -3.141593F, 0F, 0F);
		
		LFShoulder = new ModelRenderer(this, 0, 0);
		LFShoulder.addBox(0F, -1F, -1F, 3, 2, 3);
		LFShoulder.setRotationPoint(3F, 16F, -3F);
		LFShoulder.setTextureSize(64, 32);
		LFShoulder.mirror = true;
		setRotation(LFShoulder, 0F, 0F, 0F);
		
		LFLegTop = new ModelRenderer(this, 0, 0);
		LFLegTop.addBox(0.5F, -1F, 0F, 2, 2, 5);
		LFLegTop.setRotationPoint(3F, 16F, -3F);
		LFLegTop.setTextureSize(64, 32);
		LFLegTop.mirror = true;
		setRotation(LFLegTop, -0.6283185F, 0F, 0F);
		
		LFLegLow = new ModelRenderer(this, 0, 0);
		LFLegLow.addBox(0.5F, -5F, 0.9F, 2, 2, 5);
		LFLegLow.setRotationPoint(3F, 16F, -3F);
		LFLegLow.setTextureSize(64, 32);
		LFLegLow.mirror = true;
		setRotation(LFLegLow, -2.199115F, 0F, 0F);
		
		LFPaw = new ModelRenderer(this, 0, 0);
		LFPaw.addBox(0F, -8F, -1F, 3, 2, 4);
		LFPaw.setRotationPoint(3F, 16F, -3F);
		LFPaw.setTextureSize(64, 32);
		LFPaw.mirror = true;
		setRotation(LFPaw, -3.141593F, 0F, 0F);
		
		LBShoulder = new ModelRenderer(this, 0, 0);
		LBShoulder.addBox(0F, -1F, -1F, 3, 4, 4);
		LBShoulder.setRotationPoint(3F, 14F, 5F);
		LBShoulder.setTextureSize(64, 32);
		LBShoulder.mirror = true;
		setRotation(LBShoulder, 0F, 0F, 0F);
		
		LBLegTop = new ModelRenderer(this, 0, 0);
		LBLegTop.addBox(0.5F, -1F, 2F, 2, 2, 6);
		LBLegTop.setRotationPoint(3F, 14F, 5F);
		LBLegTop.setTextureSize(64, 32);
		LBLegTop.mirror = true;
		setRotation(LBLegTop, -0.5235988F, 0F, 0F);
		
		LBLegLow = new ModelRenderer(this, 0, 0);
		LBLegLow.addBox(0.5F, -8F, 0.8F, 2, 2, 5);
		LBLegLow.setRotationPoint(3F, 14F, 5F);
		LBLegLow.setTextureSize(64, 32);
		LBLegLow.mirror = true;
		setRotation(LBLegLow, -2.129302F, 0F, 0F);
		
		LBPaw = new ModelRenderer(this, 0, 0);
		LBPaw.addBox(0F, -10F, -4F, 3, 2, 4);
		LBPaw.setRotationPoint(3F, 14F, 5F);
		LBPaw.setTextureSize(64, 32);
		LBPaw.mirror = true;
		setRotation(LBPaw, -3.141593F, 0F, 0F);
		
		tail4 = new ModelRenderer(this, 46, 20);
		tail4.addBox(-1F, 9.5F, 11F, 2, 2, 2);
		tail4.setRotationPoint(0F, 14F, 11F);
		tail4.setTextureSize(64, 32);
		tail4.mirror = true;
		setRotation(tail4, 2.530727F, 0F, 0F);
	}
	
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		bodySpines.render(f5);
		bodyBase.render(f5);
		bodyLow1.render(f5);
		bodyTop1.render(f5);
		tailSpines.render(f5);
		mouth.render(f5);
		neck.render(f5);
		earLeft.render(f5);
		head.render(f5);
		earRight.render(f5);
		bodyTop2.render(f5);
		tailHelper.render(f5);
		tail1.render(f5);
		tail2.render(f5);
		RFShoulder.render(f5);
		RFLegTop.render(f5);
		RFPaw.render(f5);
		RFLegLow.render(f5);
		tail3.render(f5);
		RBShoulder.render(f5);
		RBLegTop.render(f5);
		RBLegLow.render(f5);
		RBPaw.render(f5);
		LFShoulder.render(f5);
		LFLegTop.render(f5);
		LFLegLow.render(f5);
		LFPaw.render(f5);
		LBShoulder.render(f5);
		LBLegTop.render(f5);
		LBLegLow.render(f5);
		LBPaw.render(f5);
		tail4.render(f5);
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
		
		this.head.rotateAngleX = f4 / 57.29578F;
		this.head.rotateAngleY = f3 / 57.29578F;
		this.mouth.rotateAngleX = f4 / 57.29578F;
		this.mouth.rotateAngleY = f3 / 57.29578F;
		this.earLeft.rotateAngleX = f4 / 57.29578F;
		this.earLeft.rotateAngleY = f3 / 57.29578F;
		this.earRight.rotateAngleX = f4 / 57.29578F;
		this.earRight.rotateAngleY = f3 / 57.29578F;
		this.neck.rotateAngleX = f4 / 57.29578F;
		this.neck.rotateAngleY = f3 / 57.29578F;
		
		this.LBLegTop.rotateAngleX = -0.5235988F + MathHelper.cos(f * 0.5662F) * 1.4F * f1 * 0.5F;
		this.LBLegLow.rotateAngleX = -2.129302F + MathHelper.cos(f * 0.5662F) * 1.4F * f1 * 0.5F;
		this.LBPaw.rotateAngleX = -3.141593F + MathHelper.cos(f * 0.5662F) * 1.4F * f1 * 0.5F;
		this.RFLegTop.rotateAngleX = -0.6283185F + MathHelper.cos(f * 0.5662F) * 1.4F * f1 * 0.5F;
		this.RFLegLow.rotateAngleX = -2.199115F + MathHelper.cos(f * 0.5662F) * 1.4F * f1 * 0.5F;
		this.RFPaw.rotateAngleX = -3.141593F + MathHelper.cos(f * 0.5662F) * 1.4F * f1 * 0.5F;
		
		this.RBLegTop.rotateAngleX = -0.5235988F + MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1 * 0.5F;
		this.RBLegLow.rotateAngleX = -2.129302F + MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1 * 0.5F;
		this.RBPaw.rotateAngleX = -3.141593F + MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1 * 0.5F;
		this.LFLegTop.rotateAngleX = -0.6283185F + MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1 * 0.5F;
		this.LFLegLow.rotateAngleX = -2.199115F + MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1 * 0.5F;
		this.LFPaw.rotateAngleX = -3.141593F + MathHelper.cos(f * 0.5662F + (float) Math.PI) * 1.4F * f1 * 0.5F;
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
}
