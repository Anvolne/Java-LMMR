package com.TheGamer.lmmr.init;

import com.TheGamer.lmmr.block.BlockLMMR;
import com.TheGamer.lmmr.block.BlockLeaf;
import com.TheGamer.lmmr.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMMR leafblock = new BlockLeaf();

    public static void init(){
        GameRegistry.registerBlock(leafblock, "leafblock");
    }

}
