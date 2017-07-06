package com.elderrealm.main.donators;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.Permissions;

public class Mining implements CommandExecutor {

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
					"§7[§cPermissions§7]: §7This is a §aDonator §7command \nPurchase at §cstore.elderrealm.net");
			return false;
		}

		Location loc = new Location(Bukkit.getServer().getWorld("Mining"),411, 69, 328);

		loc.setYaw(180);
		player.teleport(loc);
		player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Teleporting to " + C.yellow
				+ "Mining Realm");
		player.sendMessage(C.dred+C.bold+C.underline + "Do not create bases in this Realm, it RESETS regulary");
		return true;
	}
}
