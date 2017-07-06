package com.elderrealm.main.commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.elderrealm.main.C;
import com.elderrealm.main.utils.CrateKeys;
import com.elderrealm.main.utils.LegendaryItems;
import com.elderrealm.main.utils.MythicalItems;
import com.elderrealm.main.utils.Permissions;
import com.elderrealm.main.utils.RareItems;

public class legenddrop implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		int[] percentage = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
				52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
				78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, };

		Random percentageRandom = new Random();
		int myIndexpercentage = percentageRandom.nextInt(percentage.length);

		Player player = (Player) sender;

		player.sendMessage(percentage[myIndexpercentage] + "");

		if (player.hasPermission(Permissions.emerald) || player.hasPermission(Permissions.staff)) {
			if (percentage[myIndexpercentage] >= 1 && percentage[myIndexpercentage] <= 5) {
				player.getWorld().dropItem(player.getLocation(), LegendaryItems.aresLongSword());
				Bukkit.broadcastMessage(C.bold + C.green + player.getName().toUpperCase() + "JUST FOUND A LEGENDARY ITEM!");

		} else if (player.hasPermission(Permissions.diamond)) {
				if (percentage[myIndexpercentage] >= 1 && percentage[myIndexpercentage] <= 4) {
					player.getWorld().dropItem(player.getLocation(), LegendaryItems.aresLongSword());

		} else if (player.hasPermission(Permissions.gold)) {
					if (percentage[myIndexpercentage] >= 1 && percentage[myIndexpercentage] <= 3) {
						player.getWorld().dropItem(player.getLocation(), LegendaryItems.aresLongSword());

		} else if (player.hasPermission(Permissions.iron)) {
						if (percentage[myIndexpercentage] >= 1 && percentage[myIndexpercentage] <= 2) {
							player.getWorld().dropItem(player.getLocation(), LegendaryItems.aresLongSword());

			} else if (player.hasPermission(Permissions.iron)) {
				if (percentage[myIndexpercentage] == 1) {
								player.getWorld().dropItem(player.getLocation(), LegendaryItems.aresLongSword());
							}
					if (percentage[myIndexpercentage] >= 6 && percentage[myIndexpercentage] <= 12) {
						player.getWorld().dropItem(player.getLocation(), MythicalItems.BattleAxe());
					} else if (percentage[myIndexpercentage] >= 13 && percentage[myIndexpercentage] <= 20 ) {
						player.getWorld().dropItem(player.getLocation(), RareItems.LovingAxe());
					}
				}
			}
		}
	}

	{

		player.getInventory().addItem(CrateKeys.enderKey());
		player.getInventory().addItem(CrateKeys.enderCrate());
		player.getInventory().addItem(CrateKeys.fireCrate());
		player.getInventory().addItem(CrateKeys.fireKey());
	}
		}
		return true;
	}

}
