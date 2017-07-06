package com.elderrealm.main.commands.administration;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.elderrealm.main.utils.Permissions;

public class FlyCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		if (!(player.hasPermission(Permissions.admin)))

			player.sendMessage("§7[§cPermissions§7]: §7This is an §cAdmin§7+ §7command");
		else {

			player.sendMessage("§aToggled Fly");
		}
		return true;
	}
}
