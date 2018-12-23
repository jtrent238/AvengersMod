package com.jtrent238.avengers;

import org.apache.logging.log4j.Level;

import com.jtrent238.avengers.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {

	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_DEBUG = "debug";
	
	// This values below you can access elsewhere in your mod:

	public static boolean debugMode;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        //cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        debugMode = cfg.getBoolean("debugMode", CATEGORY_DEBUG, debugMode, "Debug Logging");
    }
}
