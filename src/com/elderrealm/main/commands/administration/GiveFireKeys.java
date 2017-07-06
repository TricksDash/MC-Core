package com.elderrealm.main.commands.administration;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.CrateKeys;
import com.elderrealm.main.utils.Permissions;

public class GiveFireKeys implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (!(sender instanceof ConsoleCommandSender || sender.hasPermission(Permissions.admin))) {
			sender.sendMessage("§7[§cPermissions§7]: §7This is an §cAdmin §7command");
			return false;
		} else {
			Player target = Bukkit.getPlayer(args[0]);

			int loopAmount;

			for (loopAmount = 0; loopAmount < Integer.parseInt(args[1]); loopAmount++) {
				target.getInventory().addItem(CrateKeys.fireKey());

			}

			target.sendMessage("");
			target.sendMessage(C.green + "Thank you for supporting the server!\n" + C.yellow + args[1] + C.gold
					+ " Fire Keys " + C.green + "have been added to your inventory!");
			target.sendMessage("");
			return true;
		}
	}
}
