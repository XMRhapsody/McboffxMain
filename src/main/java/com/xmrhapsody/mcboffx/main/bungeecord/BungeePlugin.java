package com.xmrhapsody.mcboffx.main.bungeecord;

import com.xmrhapsody.mcboffx.main.McboffxMain;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * BungeeCord插件实现
 */
public class BungeePlugin extends Plugin {

    @Override
    public void onEnable() {
        // 初始化通用插件并标记为BungeeCord环境
        McboffxMain.initialize(getLogger(), "bungeecord");
        
        // BungeeCord特定的启动代码
        getLogger().info("McboffxMain BungeeCord插件已启动!");
        
        // 注册指令和事件监听器
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        getLogger().info("McboffxMain BungeeCord插件已关闭!");
    }
    
    private void registerCommands() {
        // 在这里注册BungeeCord命令
        getLogger().info("正在注册BungeeCord命令...");
    }
    
    private void registerListeners() {
        // 在这里注册BungeeCord事件监听器
        getLogger().info("正在注册BungeeCord事件监听器...");
    }
} 