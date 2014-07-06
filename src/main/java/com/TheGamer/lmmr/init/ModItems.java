package com.TheGamer.lmmr.init;

import com.TheGamer.lmmr.item.ItemGreenLeaf;
import com.TheGamer.lmmr.item.ItemLMMR;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemLMMR greenLeaf = new ItemGreenLeaf();

    public static void init() {
        GameRegistry.registerItem(greenLeaf, "greenLeaf");
    }
}
