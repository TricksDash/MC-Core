package com.elderrealm.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

public class MessagePlayerCommand implements CommandExecutor {

	private ElderRealmCore plugin;

	public MessagePlayerCommand(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		if (args.length >= 2) {
			String playerMessage = " ";
			Player target = Bukkit.getPlayer(args[0]);

			if (target == null) {
				player.sendMessage(C.red + "That player isn't online.");
				return false;
			} else

				for (int i = 1; i < args.length; i++) {
					String arg = args[i] + " ";
					playerMessage = playerMessage + arg;

				}
			player.sendMessage(C.gray + "[" + C.gold + "Me" + C.gray + " » " + target.getDisplayName() + C.gray + "]"
					+ C.yellow + playerMessage);

			target.sendMessage(C.gray + "[" + player.getDisplayName() + C.gray + " » " + C.gold + "Me" + C.gray + "]"
					+ C.yellow + playerMessage);

			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.Reply", target.getName());
			plugin.saveConfig();

		} else {

			player.sendMessage(C.red + "Enter a message to send");
		}
		return true;
	}
}
