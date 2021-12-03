package org.louis.mycommands;

import org.bukkit.plugin.java.JavaPlugin;
import org.louis.mycommands.commands.GamemodeCommand;

public final class MyCommands extends JavaPlugin {

    @Override
    public void onEnable() {


    this.getCommand("gamemode").setExecutor(new GamemodeCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
