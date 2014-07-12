package com.TheGamer.lmmr.init;

import com.TheGamer.lmmr.item.ItemGreenLeaf;
import com.TheGamer.lmmr.item.ItemLMMR;
import com.TheGamer.lmmr.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMMR greenLeaf = new ItemGreenLeaf();

    public static void init() {
        GameRegistry.registerItem(greenLeaf, "greenLeaf");
    }
}
