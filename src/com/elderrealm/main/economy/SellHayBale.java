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

public class SellHayBale implements CommandExecutor {

	private ElderRealmCore plugin;

	public SellHayBale(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}

		Player player = (Player) sender;
		if (!(player.hasPermission(Permissions.diamond) || player.hasPermission(Permissions.emerald)
				|| player.hasPermission(Permissions.staff))) {
			player.sendMessage(
					"§7[§cPermissions§7]: §7This is a §3Diamond+ §7command \nPurchase at §cstore.elderrealm.net");
			return false;
		}

		Economy eco = ElderRealmCore.eco;

		int amount = 0;
		for (ItemStack is : player.getInventory().all(Material.HAY_BLOCK).values()) {
			amount = amount + is.getAmount();
		}

		player.sendMessage(C.gold + "+ " + amount * 2 + " Coins ");
		eco.depositPlayer(player, amount * 2);

		player.getInventory().remove(Material.HAY_BLOCK);

		plugin.saveConfig();
		return true;
	}
}
