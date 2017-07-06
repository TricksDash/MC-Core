package com.elderrealm.main.events.teleports;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;

public class Teleport implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		if (args.length == 0 || args.length >= 2) {
			player.sendMessage("Usage: /TP (Name)");
		} else {

			Player target = Bukkit.getServer().getPlayer(args[0]);

			if (target == null) {
				player.sendMessage(C.red + "That player isn't online.");
				return false;
			} else

				player.teleport(target.getLocation());

			player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Teleporting to " + C.yellow
					+ target.getName());
			target.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.yellow + player.getName() + C.gray
					+ " Teleported to you");
		}
		return true;
	}
}
