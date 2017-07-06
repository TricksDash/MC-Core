package com.elderrealm.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;

public class WebsiteCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		player.sendMessage(C.gray + "Website: " + C.gold + "http://www.ElderRealm.net");
		player.sendMessage(C.gray + "Donate: " + C.gold + "http://store.ElderRealm.net");
		return true;
	}
}
