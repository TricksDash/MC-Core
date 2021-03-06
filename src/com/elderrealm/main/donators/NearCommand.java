package com.elderrealm.main.donators;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.Permissions;

public class NearCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		if (!(player.hasPermission(Permissions.diamond) || player.hasPermission(Permissions.emerald)
				|| player.hasPermission(Permissions.gold) || player.hasPermission(Permissions.iron)
				|| player.hasPermission(Permissions.staff))) {
			player.sendMessage(
					"�7[�cPermissions�7]: �7This is a �aDonator �7command \nPurchase at �cstore.elderrealm.net");
			return false;
		}

		List<String> nearbyPlayers = new ArrayList<>();

		for (Entity nearby : player.getNearbyEntities(50, 50, 50)) {
			if (nearby instanceof Player) {
				nearbyPlayers.add(nearby.getName());
			}
		}

		player.sendMessage(C.gray + "Players within 50 Blocks: " + C.gold
				+ nearbyPlayers.toString().replace("[", "").replace("]", "").trim());

		return true;
	}
}
