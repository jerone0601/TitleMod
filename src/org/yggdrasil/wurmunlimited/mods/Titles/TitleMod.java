package org.yggdrasil.wurmunlimited.mods.Titles;

import org.gotti.wurmunlimited.modloader.interfaces.*;
import org.yggdrasil.wurmunlimited.mods.Titles.Mastercraft;
import sun.security.pkcs11.wrapper.Constants;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TitleMod implements WurmServerMod, Configurable, PreInitable, Initable, ServerStartedListener, ItemTemplatesCreatedListener {
    private static final Logger logger = Logger.getLogger("org.yggdrasil.wurmunlimited.mods.Titles.TitleMod");

    public static void logException(String msg, Throwable e) {
        if (logger != null)
            logger.log(Level.SEVERE, msg, e);
    }

    public static void logWarning(String msg) {
        if (logger != null)
            logger.log(Level.WARNING, msg);
    }

    public static void logInfo(String msg) {
        if (logger != null)
            logger.log(Level.INFO, msg);
    }

    @Override
    public void configure(Properties properties) {
        {

        }
    }

    @Override
    public void init() {
    }

    public void preInit() {
        logger.info("Pre-Initializing.");
        try {
            Mastercraft.addNewTitles();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onItemTemplatesCreated() {
    }

    @Override
    public void onServerStarted() {

    }
}