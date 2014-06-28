package com.TheGamer.LMMR;

import com.TheGamer.LMMR.proxy.IProxy;
import com.TheGamer.LMMR.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LMMR {

    @Mod.Instance(Reference.MOD_ID)
    public static LMMR instance;

    @SidedProxy(clientSide = "com.TheGamer.LMMR.proxy.ClientProxy", serverSide = "com.TheGamer.LMMR.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}