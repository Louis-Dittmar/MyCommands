package org.louis.mycommands;

import org.bukkit.plugin.java.JavaPlugin;
import org.louis.mycommands.commands.GamemodeCommand;
import org.louis.mycommands.tabcomplete.GamemodeTabcomplete;

public final class MyCommands extends JavaPlugin {

    @Override
    public void onEnable() {


    this.getCommand("gm").setExecutor(new GamemodeCommand());
    getCommand("gm").setTabCompleter(new GamemodeTabcomplete());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
