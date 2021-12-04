package org.louis.mycommands;

import org.bukkit.plugin.java.JavaPlugin;
import org.louis.mycommands.commands.GamemodeCommand;
import org.louis.mycommands.tabcomplete.GamemodeComplete;

public final class MyCommands extends JavaPlugin {

    @Override
    public void onEnable() {


    this.getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("command").setTabCompleter(new GamemodeComplete());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
