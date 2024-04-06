package net.ayo.ispmod.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class SniperModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart snipe;
	private final ModelPart head;

	public SniperModel(ModelPart root) {

		this.snipe = root.getChild("snipe");
		this.head = snipe.getChild("bone2").getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition snipe = partdefinition.addOrReplaceChild("snipe", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = snipe.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -2.5F, 12.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.0F, 2.5F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(24, 7).addBox(-3.0F, 3.0F, -6.0F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(24, 21).addBox(-5.0F, -3.0F, -6.0F, 2.0F, 6.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(3.0F, -3.0F, -6.0F, 2.0F, 6.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-2.0F, -2.0F, 7.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 52).addBox(-4.0F, -4.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 50).addBox(-4.0F, 3.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(48, 13).addBox(3.0F, 3.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(48, 0).addBox(3.0F, -4.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(44, 43).addBox(2.0F, -3.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(30, 41).addBox(-3.0F, -3.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(40, 28).addBox(2.0F, 2.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(16, 39).addBox(-3.0F, 2.0F, -6.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(35, 3).addBox(-3.0F, -4.0F, 5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 0).addBox(-3.0F, 3.0F, 5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 21).addBox(3.0F, -3.0F, 5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 21).addBox(-4.0F, -3.0F, 5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 41).addBox(-3.0F, -3.0F, 5.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -11.0F, -2.5F));

		PartDefinition bone3 = snipe.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(39, 56).addBox(-2.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -7.0F, 2.5F));

		PartDefinition bone4 = snipe.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(54, 26).addBox(-3.0F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -7.0F, 2.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		snipe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return snipe;
	}
}