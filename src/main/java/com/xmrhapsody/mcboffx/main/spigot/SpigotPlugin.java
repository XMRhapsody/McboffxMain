package com.xmrhapsody.mcboffx.main.spigot;

import com.xmrhapsody.mcboffx.main.McboffxMain;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Spigot插件实现
 */
public class SpigotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // 初始化通用插件并标记为Spigot环境
        McboffxMain.initialize(getLogger(), "spigot");
        
        // Spigot特定的启动代码
        getLogger().info("McboffxMain Spigot插件已启动!");
        
        // 注册指令和事件监听器
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        getLogger().info("McboffxMain Spigot插件已关闭!");
    }
    
    private void registerCommands() {
        // 在这里注册Spigot命令
        getLogger().info("正在注册Spigot命令...");
    }
    
    private void registerListeners() {
        // 在这里注册Spigot事件监听器
        getLogger().info("正在注册Spigot事件监听器...");
    }
} 