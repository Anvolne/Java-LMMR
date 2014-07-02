package com.TheGamer.LMMR.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        //Create config object from given config file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try {
            //Load config file
            configuration.load();
            //Read config properties
            configValue = configuration.get("ForgeCraft", "configValue", true, "This is a config value").getBoolean(true);
        }
        catch (Exception e){
            //Log exception
        }
        finally {
            //Save config file
            configuration.save();
        }

        System.out.println("Configuration Test:" + configValue);
    }
}
