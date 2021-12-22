package org.louis.mycommands.tabcomplete;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GamemodeTabcomplete implements TabCompleter {
    /**
     * Requests a list of possible completions for a command argument.
     *
     * @param sender  Source of the command.  For players tab-completing a
     *                command inside of a command block, this will be the player, not
     *                the command block.
     * @param command Command which was executed
     * @param alias   The alias used
     * @param args    The arguments passed to the command, including final
     *                partial argument to be completed and command label
     * @return A List of possible completions for the final argument, or null
     * to default to the command executor
     */
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (args.length == 1) {
            List<String> completions = new ArrayList<>();
            completions.add("survival");
            completions.add("creative");
            completions.add("adventure");
            completions.add("spectator");
            return completions;
        }
        if (args.length == 2) {
            List<String> PlayerNames = new ArrayList<>();
            Player[] players = new Player[Bukkit.getServer().getOnlinePlayers().size()];
            Bukkit.getServer().getOnlinePlayers().toArray(players);
            for (int i = 0; i < players.length; i++) {
                PlayerNames.add(players[i].getName());
            }
            PlayerNames.add("@a");
            PlayerNames.add("@p");
            PlayerNames.add("@e");
            PlayerNames.add("@r");
            return PlayerNames;
        }

        return null;
    }
}
