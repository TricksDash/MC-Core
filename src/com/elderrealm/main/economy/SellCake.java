package com.elderrealm.main.economy;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.Permissions;

import net.milkbowl.vault.economy.Economy;

public class SellCake implements CommandExecutor {

	private ElderRealmCore plugin;

	public SellCake(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Economy eco = ElderRealmCore.eco;

		Player player = (Player) sender;

		int amount = 0;
		for (ItemStack is : player.getInventory().all(Material.CAKE).values()) {
			amount = amount + is.getAmount();
		}

		int price = 50;

		if (player.hasPermission(Permissions.iron)) {
			price = 75;
		} else if (player.hasPermission(Permissions.gold)) {
			price = 100;
		} else if (player.hasPermission(Permissions.diamond)) {
			price = 125;
		} else if (player.hasPermission(Permissions.emerald)) {
			price = 150;
		}

		player.sendMessage(C.gold + "+ " + amount * price + " Coins ");
		eco.depositPlayer(player, amount * price);

		player.getInventory().remove(Material.CAKE);

		plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.CakesSold",
				plugin.getConfig().getInt("Player-Data." + player.getUniqueId() + ".BasicInformation.CakesSold", 0)
						+ amount);
		plugin.saveConfig();
		return true;
	}
}
