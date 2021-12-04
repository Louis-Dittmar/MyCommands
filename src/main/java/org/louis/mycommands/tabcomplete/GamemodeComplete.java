package org.louis.mycommands.tabcomplete;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;


import java.util.ArrayList;
import java.util.List;

public class GamemodeComplete implements TabCompleter {
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
    public List<String> onTabComplete( CommandSender sender,Command command, String alias,  String[] args) {


        if(args.length == 0) {
            List<String> completions = new ArrayList<String>();
            completions.add("0");
            completions.add("1");
            completions.add("2");
            completions.add("3");
            return completions;
        }
        if(args.length == 1) {
            List<String> completions = new ArrayList<String>();
            Player[] players = new Player[Bukkit.getOnlinePlayers().size()];
            for(int i = 0; i < players.length; i++) {
                completions.add(players[i].getName());
                return completions;
            }
        }


        return null;
    }
}
