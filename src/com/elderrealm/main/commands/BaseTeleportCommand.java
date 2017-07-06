package com.elderrealm.main.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

public class BaseTeleportCommand implements CommandExecutor {

	private ElderRealmCore plugin;

	public BaseTeleportCommand(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		int baseTps = (int) plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".BasicInformation.BaseTPs");
		if (baseTps == 0) {
			player.sendMessage(
					C.gray + "[" + C.red + "Base" + C.gray + "] " + C.gray + "You have no more Base Teleports");
			player.sendMessage(C.gray + "purchase more at " + C.green + "store.elderrealm.net");
			return true;
		}

		if (plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".Bases") == null) {
			player.sendMessage(
					C.gray + "[" + C.red + "Base" + C.gray + "] " + C.gray + "You have not set a base! /SetBase");
			return false;
		}

		if (plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".Bases.PlayerBase") == null) {
			player.sendMessage(
					C.gray + "[" + C.red + "Base" + C.gray + "] " + C.gray + "You have not set a base! /SetBase");
			return false;
		}

		if (args.length > 1) {
			player.sendMessage("§7[§cBases§7]: /Sethome || (Name)");
			return false;
		}
		
		// * Teleport using /Base *//
		if (args.length == 0) {
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.BaseTPs",
					plugin.getConfig().getInt("Player-Data." + player.getUniqueId() + ".BasicInformation.BaseTPs", 0)
							- 1);
			plugin.saveConfig();

			player.sendMessage(C.gray + "[" + C.red + "Base" + C.gray + "] " + C.gray + "Teleporting to base");

			Location baseLoc = (Location) plugin.getConfig()
					.get("Player-Data." + player.getUniqueId() + ".Bases.PlayerBase");

			player.teleport(baseLoc);
			return true;

			// * Donator Check *//
		}
		return true;
	}
}
