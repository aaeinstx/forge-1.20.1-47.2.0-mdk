package net.ayo.ispmod.entity;

import net.ayo.ispmod.IspMod;
import net.ayo.ispmod.entity.custom.IronEaterEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, IspMod.MODID);

    public static final RegistryObject<EntityType<IronEaterEntity>> IRON_EATER =
            ENTITY_TYPES.register("ironeater", () -> EntityType.Builder.of(IronEaterEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("ironeater"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
