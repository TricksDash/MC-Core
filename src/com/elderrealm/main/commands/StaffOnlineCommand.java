package com.elderrealm.main.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.utils.Permissions;

public class StaffOnlineCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player playerSender = (Player) sender;

		List<String> admins = new ArrayList<>();
		List<String> srMods = new ArrayList<>();
		List<String> mods = new ArrayList<>();
		List<String> assistants = new ArrayList<>();

		for (Player onlinePlayers : Bukkit.getServer().getOnlinePlayers()) {
			if (onlinePlayers.hasPermission(Permissions.admin))
				admins.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.assistant))
				assistants.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.srMod))
				srMods.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.moderator))
				mods.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.assistant))
				assistants.add(onlinePlayers.getName());

		}
		playerSender.sendMessage("");
		playerSender
				.sendMessage("§7Online §cAdmins§7: §6" + admins.toString().replace("[", "").replace("]", "").trim());
		playerSender
				.sendMessage("§7Online §2Sr.Mods§7: §6" + srMods.toString().replace("[", "").replace("]", "").trim());
		playerSender.sendMessage("§7Online §dMods§7: §6" + mods.toString().replace("[", "").replace("]", "").trim());
		playerSender.sendMessage(
				"§7Online §9Assistants§7: §6" + assistants.toString().replace("[", "").replace("]", "").trim());
		playerSender.sendMessage("");

		return true;
	}

}
