package org.louis.mycommands;

import org.bukkit.plugin.java.JavaPlugin;
import org.louis.mycommands.commands.GamemodeCommand;
import org.louis.mycommands.commands.TimeCommand;
import org.louis.mycommands.tabcomplete.GamemodeTabcomplete;

import java.util.Objects;

public final class MyCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("gm")).setExecutor(new GamemodeCommand());
        Objects.requireNonNull(getCommand("gm")).setTabCompleter(new GamemodeTabcomplete());

        Objects.requireNonNull(this.getCommand("time")).setExecutor(new TimeCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
