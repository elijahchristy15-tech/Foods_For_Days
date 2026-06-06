package net.eli.tutorialmod.block.custom;

import net.eli.tutorialmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class Stove extends Block {
    public Stove(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof ItemEntity itemEntity) {
            if (itemEntity.getItem().getItem() == Items.CAKE) {
                itemEntity.setItem(new ItemStack(ModItems.SLICED_CAKE.get(), itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.SOUL_SAND) {
                itemEntity.setItem(new ItemStack(ModItems.SOUL.get(), itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.GOLDEN_APPLE) {
                itemEntity.setItem(new ItemStack(ModItems.ENERGY_DRINK.get(), itemEntity.getItem().getCount()));
            }
                super.stepOn(pLevel, pPos, pState, pEntity);
        }
        pLevel.addParticle(
                ParticleTypes.CAMPFIRE_COSY_SMOKE,
                pPos.getX() + 0.5,
                pPos.getY() + 1.0,
                pPos.getZ() + 0.5,
                0, 0.05, 0
        );
    }
}

