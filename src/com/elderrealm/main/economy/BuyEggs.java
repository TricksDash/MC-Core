package com.elderrealm.main.economy;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

import net.milkbowl.vault.economy.Economy;

public class BuyEggs implements CommandExecutor {

	private ElderRealmCore plugin;

	public BuyEggs(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}

		Player player = (Player) sender;

		Economy eco = ElderRealmCore.eco;

		if (args.length == 0) {
			player.sendMessage("Usage: /buyegg (amount)");

		} else if (args.length > 1) {
			player.sendMessage("Usage: /buyegg (amount)");

		} else if (Integer.parseInt(args[0]) > 16) {
			player.sendMessage(C.red + "You can only purchase up to 16 eggs!");

		} else if (Integer.parseInt(args[0]) < 2) {
			if (eco.getBalance(player) >= Integer.parseInt(args[0]) * 25) {
				player.sendMessage(C.gray + "You have purchased " + C.yellow + args[0] + C.gray + " Egg!");
				player.getInventory().addItem(new ItemStack(Material.EGG, Integer.parseInt(args[0])));
				player.sendMessage(C.gold + "- " + Integer.parseInt(args[0]) * 25 + " coins");

				plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.EggsPurchased",
						plugin.getConfig()
								.getInt("Player-Data." + player.getUniqueId() + ".BasicInformation.EggsPurchased", 0)
								+ Integer.parseInt(args[0]));
				plugin.saveConfig();

				int withdraw = Integer.parseInt(args[0]) * 25;

				eco.withdrawPlayer(player, withdraw);

				player.updateInventory();

			} else {
				player.sendMessage(C.red + "You don't have enough money");
			}

		} else {
			if (eco.getBalance(player) >= Integer.parseInt(args[0]) * 25) {
				player.sendMessage(C.gray + "You have purchased " + C.yellow + args[0] + C.gray + " Eggs!");
				player.getInventory().addItem(new ItemStack(Material.EGG, Integer.parseInt(args[0])));
				player.sendMessage(C.gold + "- " + Integer.parseInt(args[0]) * 25 + " coins");

				plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.EggsPurchased",
						plugin.getConfig()
								.getInt("Player-Data." + player.getUniqueId() + ".BasicInformation.EggsPurchased", 0)
								+ Integer.parseInt(args[0]));
				plugin.saveConfig();

				int withdraw = Integer.parseInt(args[0]) * 25;

				eco.withdrawPlayer(player, withdraw);

				player.updateInventory();
			} else {
				player.sendMessage(C.red + "You don't have enough money");
			}
		}

		return true;
	}
}
