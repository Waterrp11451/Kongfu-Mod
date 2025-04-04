package net.waterrp11451.kongfumod.entity;

import com.mojang.logging.LogUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.slf4j.Logger;
//The flying sword
public class FlyingSwordEntity extends Entity {

    private static final Logger LOGGER = LogUtils.getLogger();

    private static final EntityDataAccessor<Integer> COUNTER = SynchedEntityData.defineId(FlyingSwordEntity.class, EntityDataSerializers.INT);
    @Override
    public void tick() {

        if(this.level().isClientSide){
            Integer i = this.entityData.get(COUNTER);
            LOGGER.info(i.toString());
        }
        if(!this.level().isClientSide){
            LOGGER.info(this.entityData.get(COUNTER).toString());
            this.entityData.set(COUNTER,this.entityData.get(COUNTER)+1);
        }
        super.tick();
    }

    public FlyingSwordEntity(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void defineSynchedData() {
        this.entityData.define(COUNTER, 0);

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound) {
        this.entityData.set(COUNTER,pCompound.getInt("counter"));
    }
    @Override
    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putInt("counter",this.entityData.get(COUNTER));
    }

}