package com.elderrealm.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.Permissions;

public class PingCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		int ping;

		if (args.length == 0 || args.length > 1) {
			ping = ((CraftPlayer) player).getHandle().ping;
			player.sendMessage(C.gray + "Your ping is " + C.yellow + ping);

		} else if (args.length == 1) {
			Player target = Bukkit.getPlayer(args[0]);
			if (target == null) {
				player.sendMessage("Player is not online");
				return false;
			}

			String nameColor;
			if(target.hasPermission(Permissions.admin)){
				nameColor = "§c";
			}else if(target.hasPermission(Permissions.srMod)){
				nameColor = "§2";
			}else if(target.hasPermission(Permissions.moderator)){
				nameColor = "§d";
			}else if(target.hasPermission(Permissions.assistant)){
				nameColor = "§9";
			}else if(target.hasPermission(Permissions.emerald)){
				nameColor = "§a";
			}else if(target.hasPermission(Permissions.diamond)){
				nameColor = "§3";
			}else if(target.hasPermission(Permissions.gold)){
				nameColor = "§6";
			}else if(target.hasPermission(Permissions.iron)){
				nameColor = "§f";
			}else{
				nameColor = "§8";
			}	
			
			ping = ((CraftPlayer) target).getHandle().ping;
			player.sendMessage(nameColor + target.getName() + "'s §7Ping is " + C.yellow + ping);

		}
		return true;
	}
}
