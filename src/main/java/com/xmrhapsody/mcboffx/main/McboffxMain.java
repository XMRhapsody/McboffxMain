package com.xmrhapsody.mcboffx.main;

import com.xmrhapsody.mcboffx.main.bungeecord.BungeePlugin;
import com.xmrhapsody.mcboffx.main.spigot.SpigotPlugin;

import java.util.logging.Logger;

/**
 * 通用加载器，用于检测运行环境并启动相应的插件
 */
public class McboffxMain {
    private static Logger logger;
    private static boolean isSpigot = false;
    private static boolean isBungee = false;

    // 在运行时被调用来确定平台
    public static void initialize(Logger providedLogger, String platform) {
        logger = providedLogger;
        
        if ("spigot".equalsIgnoreCase(platform)) {
            isSpigot = true;
            logger.info("检测到 Spigot 环境，将初始化 Spigot 插件...");
        } else if ("bungeecord".equalsIgnoreCase(platform)) {
            isBungee = true;
            logger.info("检测到 BungeeCord 环境，将初始化 BungeeCord 插件...");
        } else {
            logger.severe("无法确定运行平台! 插件将无法正常工作.");
        }
    }

    public static boolean isSpigot() {
        return isSpigot;
    }

    public static boolean isBungee() {
        return isBungee;
    }

    public static Logger getLogger() {
        return logger;
    }
} 