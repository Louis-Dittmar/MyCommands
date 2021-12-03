package org.louis.mycommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {


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
            if(!(args.length >= 1)) {
                sender.sendMessage("Zu Kurz"); // TODO Chat Message
                return false;
            }
            Player target = Bukkit.getPlayer(args[1]);
            if(target == null) {
                sender.sendMessage("Nicht Online"); // TODO Chat Message
                return false;
            }
            switch(args[0]) {
                case "0":
                case "survival":
                    if(target.getGameMode() == GameMode.SURVIVAL) {
                        sender.sendMessage("Hat Gamemode 0"); // TODO Chat Message
                        return false;
                    }
                    target.sendMessage("Message Gamemode 0"); // TODO Chat Message
                    target.setGameMode(GameMode.SURVIVAL);
                    return true;
                case "1":
                case "creative":
                    if(target.getGameMode() == GameMode.SURVIVAL) {
                        sender.sendMessage("Hat Gamemode 1"); // TODO Chat Message
                        return false;
                    }
                    target.sendMessage("Message Gamemode 1"); // TODO Chat Message
                    target.setGameMode(GameMode.CREATIVE);
                    return true;
                case "2":
                case "adventure":
                    if(target.getGameMode() == GameMode.SURVIVAL) {
                        sender.sendMessage("Hat Gamemode 2"); // TODO Chat Message
                        return false;
                    }
                    target.sendMessage("Message Gamemode 2"); // TODO Chat Message
                    target.setGameMode(GameMode.ADVENTURE);
                    return true;
                case "3":
                case "spectator":
                    if(target.getGameMode() == GameMode.SURVIVAL) {
                        sender.sendMessage("Hat Gamemode 3"); // TODO Chat Message
                        return false;
                    }
                    target.sendMessage("Message Gamemode 3"); // TODO Chat Message
                    target.setGameMode(GameMode.SPECTATOR);
                    return true;
                default:
                    sender.sendMessage("Message Error Gamemode not Found"); // TODO Chat Message;
                    return false;
            }
        }
        Player player = ((Player) sender);
        if(args.length == 0) {
            if (!(sender.hasPermission("mycommands.change"))) { // TODO Permission
                sender.sendMessage("Not allowed to change"); // TODO Message
            }
            switch(args[0]) {
                case "0":
                case "survival":
                    if(player.getGameMode() == GameMode.SURVIVAL) {
                        sender.sendMessage("Du bist schon"); // TODO Message
                        return false;
                    }
                    player.setGameMode(GameMode.SURVIVAL);
                    sender.sendMessage("Set Gamemode"); // TODO Message

                    return true;
                case "1":
                case "creative":
                    if(player.getGameMode() == GameMode.CREATIVE) {
                        sender.sendMessage("Du bist schon"); // TODO Message
                        return false;
                    }
                    player.setGameMode(GameMode.CREATIVE);
                    sender.sendMessage("Set Gamemode"); // TODO Message
                    return true;

                case "2":
                case "adventure":
                    if(player.getGameMode() == GameMode.ADVENTURE) {
                        sender.sendMessage("Du bist schon"); // TODO Message
                        return false;
                    }
                    player.setGameMode(GameMode.ADVENTURE);
                    sender.sendMessage("Set Gamemode"); // TODO Message
                    return true;
                case "3":
                case "spectator":
                    if(player.getGameMode() == GameMode.SPECTATOR) {
                        sender.sendMessage("Du bist schon"); // TODO Message
                        return false;
                    }
                    player.setGameMode(GameMode.SPECTATOR);
                    sender.sendMessage("Set Gamemode"); // TODO Message
                    return true;
                default:
                    sender.sendMessage("Falsch"); // TODO Message
                    return false;
            }
        }
        if(args.length > 1) {
            if (!(sender.hasPermission("mycommands.change"))) { // TODO Permission
                sender.sendMessage("Not allowed to change"); // TODO Message
            }
            Player target = Bukkit.getPlayer(args[1]);
            if(!(target == null)) {
                player.sendMessage("Nicht Online"); // TODO Message
            }

            switch(args[0]) {

                case "0":
                case "survival":
                    if (target != null && target.getGameMode() == GameMode.SURVIVAL) {
                        sender.sendMessage("Hat Gamemode 0"); // TODO Chat Message
                        return false;
                    }
                    assert target != null;
                    sender.sendMessage("Hat Gamemode 0 Sender"); // TODO Chat Message
                    target.sendMessage("Hat Gamemode 0 Target"); // TODO Chat Message
                    target.setGameMode(GameMode.SURVIVAL);


                    return true;
                case "1":
                case "creative":
                    if (target != null && target.getGameMode() == GameMode.CREATIVE) {
                        sender.sendMessage("Hat Gamemode 1"); // TODO Chat Message
                        return false;
                    }
                    assert target != null;
                    sender.sendMessage("Hat Gamemode 1 Sender"); // TODO Chat Message
                    target.sendMessage("Hat Gamemode 1 Target"); // TODO Chat Message
                    target.setGameMode(GameMode.CREATIVE);
                    return true;
                case "2":
                case "adventure":
                    if (target != null && target.getGameMode() == GameMode.ADVENTURE) {
                        sender.sendMessage("Hat Gamemode 2"); // TODO Chat Message
                        return false;
                    }
                    assert target != null;
                    sender.sendMessage("Hat Gamemode 2 Sender"); // TODO Chat Message
                    target.sendMessage("Hat Gamemode 2 Target"); // TODO Chat Message
                    target.setGameMode(GameMode.ADVENTURE);
                    return true;
                case "3":
                case "spectator":
                    if (target != null && target.getGameMode() == GameMode.SPECTATOR) {
                        sender.sendMessage("Hat Gamemode 3"); // TODO Chat Message
                        return false;
                    }
                    assert target != null;
                    sender.sendMessage("Hat Gamemode 3 Sender"); // TODO Chat Message
                    target.sendMessage("Hat Gamemode 3 Target"); // TODO Chat Message
                    target.setGameMode(GameMode.SPECTATOR);

                    return true;
            }
        }
        return false;
    }
}