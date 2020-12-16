package com.dgoose.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;


public class SmileBlock extends Block {

    public SmileBlock() {
        super(Block.Properties.create(Material.CAKE)
            .hardnessAndResistance(5.0f, 6.0f)
            .sound(SoundType.SNOW)
            .harvestLevel(5)
            .harvestTool(ToolType.SHOVEL));
    }
}
