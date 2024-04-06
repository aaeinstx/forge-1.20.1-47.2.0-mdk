package net.ayo.ispmod.entity.custom;
import net.ayo.ispmod.entity.ModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
public class IronEaterEntity extends Animal {
    private GoalSelector goalSelector;

    public IronEaterEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
            super(pEntityType, pLevel);
        }

        public final AnimationState idleAnimationState = new AnimationState();
        private int idleAnimationTimeout = 0;

    @Override
        public void tick() {
            super.tick();

            if(this.level().isClientSide()) {
                setupAnimationStates();
            }
        }

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {

    }

    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {

    }

    private void setupAnimationStates() {
            if(this.idleAnimationTimeout <= 0) {
                this.idleAnimationTimeout = this.random.nextInt(40) + 80;
                this.idleAnimationState.start(this.tickCount);
            } else {
                --this.idleAnimationTimeout;
            }
        }

        @Override
        protected void updateWalkAnimation(float pPartialTick) {
            float f;
            if(this.getPose() == Pose.STANDING) {
                f = Math.min(pPartialTick * 6F, 1f);
            } else {
                f = 0f;
            }

            this.walkAnimation.update(f, 0.2f);
        }

        @Override
        protected void registerGoals() {
            this.goalSelector.addGoal(0, new FloatGoal(this));

            this.goalSelector.addGoal(1, new BreedGoal(this, 1.15D));
            this.goalSelector.addGoal(2, new TemptGoal(this, 1.2D, Ingredient.of(Items.COOKED_BEEF), false));

            this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.1D));

            this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.1D));
            this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 3f));
            this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));

        }

        public static AttributeSupplier.Builder createAttributes() {
            return Animal.createLivingAttributes()
                    .add(Attributes.MAX_HEALTH, 20D)
                    .add(Attributes.FOLLOW_RANGE, 24D)
                    .add(Attributes.MOVEMENT_SPEED, 0.25D)
                    .add(Attributes.ARMOR_TOUGHNESS, 0.1f)
                    .add(Attributes.ATTACK_KNOCKBACK, 0.5f)
                    .add(Attributes.ATTACK_DAMAGE, 2f);
        }

        public IronEaterEntity getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
            return ModEntities.IRON_EATER.get().create(pLevel);
        }

        @Override
        public boolean isFood(ItemStack pStack) {
            return pStack.is(Items.IRON_INGOT);
        }

        @Nullable
        @Override
        protected SoundEvent getAmbientSound() {
            return SoundEvents.COW_AMBIENT;
        }

        @Nullable
        @Override
        protected SoundEvent getHurtSound(DamageSource pDamageSource) {
            return SoundEvents.IRON_GOLEM_HURT;
        }
}
