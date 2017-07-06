package com.elderrealm.main.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.Permissions;

public class PlayersOnlineCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player playerSender = (Player) sender;

		List<String> playerCount = new ArrayList<>();
		List<String> staff = new ArrayList<>();
		List<String> emerald = new ArrayList<>();
		List<String> diamond = new ArrayList<>();
		List<String> gold = new ArrayList<>();
		List<String> iron = new ArrayList<>();
		List<String> player = new ArrayList<>();

		for (Player onlinePlayers : Bukkit.getServer().getOnlinePlayers()) {
			playerCount.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.staff))
				staff.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.emerald))
				emerald.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.diamond))
				diamond.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.gold))
				gold.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.iron))
				iron.add(onlinePlayers.getName());
			if (onlinePlayers.hasPermission(Permissions.player))
				player.add(onlinePlayers.getName());
		}

		playerSender.sendMessage("");
		playerSender.sendMessage("§7Amount of players online: §6" + playerCount.size());
		playerSender.sendMessage("§7Online §cStaff§7: §6" + staff.toString().replace("[", "").replace("]", "").trim());
		playerSender
				.sendMessage("§7Online §aEmeralds§7: §6" + emerald.toString().replace("[", "").replace("]", "").trim());
		playerSender
				.sendMessage("§7Online §3Diamonds§7: §6" + diamond.toString().replace("[", "").replace("]", "").trim());
		playerSender.sendMessage(
				"§7Online §6Golds§7: §6" + C.gold + gold.toString().replace("[", "").replace("]", "").trim());
		playerSender.sendMessage("§7Online §fIrons§7: §6" + iron.toString().replace("[", "").replace("]", "").trim());
		playerSender
				.sendMessage("§7Online §8Players§7: §6" + player.toString().replace("[", "").replace("]", "").trim());
		playerSender.sendMessage("");

		return true;
	}

}
