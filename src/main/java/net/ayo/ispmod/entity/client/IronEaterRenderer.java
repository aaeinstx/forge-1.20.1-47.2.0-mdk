package net.ayo.ispmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.entity.custom.IronEaterEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class IronEaterRenderer extends MobRenderer<IronEaterEntity, IronEaterModel<IronEaterEntity>> {
    public IronEaterRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new IronEaterModel<>(pContext.bakeLayer(ModModelLayers.IRON_EATER_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(IronEaterEntity pEntity) {
        return new ResourceLocation(IspMod.MODID, "textures/entity/rhino.png");
    }

    @Override
    public void render(IronEaterEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
