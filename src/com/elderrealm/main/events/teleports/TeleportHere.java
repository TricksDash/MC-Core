package com.elderrealm.main.events.teleports;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;

public class TeleportHere implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		if (args.length == 0 || args.length >= 2) {
			player.sendMessage("Usage: /Tphere (Name)");
		} else {
			Player target = Bukkit.getPlayer(args[0]);
			if (target == null) {
				player.sendMessage(C.red + "That player isn't online.");
				return false;
			} else

				target.teleport(player.getLocation());

			target.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Teleporting to " + C.yellow
					+ target.getName());
			player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.yellow + target.getName() + C.gray
					+ " has been teleported to you");

		}
		return true;
	}
}
