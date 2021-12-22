package org.louis.mycommands.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class TimeCommand implements CommandExecutor {


    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //Console Execute
        if (!(sender instanceof Player)) {

        }
        assert sender instanceof Player;
        Player player = (Player) sender;
        SetTime(Integer.parseInt(args[1]), player.getWorld());
        return false;
    }


    private void SetTime(int time, @NotNull World world) {
        long days = Math.round(world.getTime() / 20000);
        long calc = (days * 20000) + time;

        for (long i = (days * 20000); i < calc; i++) {
            world.setTime(calc);
        }


    }
}
