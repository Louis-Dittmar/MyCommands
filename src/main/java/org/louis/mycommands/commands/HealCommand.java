package org.louis.mycommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
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
    public boolean onCommand( CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {


            // /heal Louis_Play 20 hunger
            if(args.length == 0) {
                sender.sendMessage("zu Kurz"); // TODO Chat Message
                return false;
            }
            Player target = Bukkit.getPlayer(args[1]);
            if(target == null) {
                sender.sendMessage("Nicht Online"); // TODO Chat Message
                return false;
            }
            switch(args.length) {
                case 1:
                    target.setHealth(20);
                    target.setFoodLevel(20);
                    sender.sendMessage("Wurde Geheilt"); //TODO Chat Message
                    target.sendMessage("Du wurdest von"); //TODO Chat Message
                    return false;
                case 2:

                    return false;



            }

            }





            return false;
        }


}

