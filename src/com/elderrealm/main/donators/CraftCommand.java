package com.elderrealm.main.donators;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.elderrealm.main.utils.Permissions;

public class CraftCommand implements CommandExecutor {

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

		player.openWorkbench(null, true);
		return true;
	}
}
