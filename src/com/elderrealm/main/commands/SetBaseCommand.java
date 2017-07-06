package com.elderrealm.main.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.elderrealm.main.ElderRealmCore;

public class SetBaseCommand implements CommandExecutor {

	private ElderRealmCore plugin;

	public SetBaseCommand(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}

		Player player = (Player) sender;

		Location baseLoc = player.getLocation();
		if (args.length == 0) {
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".Bases.PlayerBase", baseLoc);
			plugin.saveConfig();
			player.sendMessage("§7[§cBases§7]: Base has been set");
			return true;
		}else
			player.sendMessage("§7[§cBases§7]: Usage: /SetBase");
		return true;
	}
}
