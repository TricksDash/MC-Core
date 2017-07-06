package com.elderrealm.main.commands.administration;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import com.elderrealm.main.utils.Permissions;

public class Alert implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof ConsoleCommandSender || sender.hasPermission(Permissions.admin))) {
			sender.sendMessage("§7[§cPermissions§7]: §7This is an §cAdmin §7command");
			return false;
		} else {
			
			

			String alertMessage = " ";

			for (int i = 0; i < args.length; i++) {
				String arg = args[i] + " ";
				alertMessage = alertMessage + arg;
			}

			Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', alertMessage));
		}
		return true;
	}
}
