package com.elderrealm.main.kits;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.Permissions;
import com.elderrealm.main.utils.PvPItems;

public class PlayerKitGUI implements CommandExecutor {

	private ElderRealmCore plugin;

	public PlayerKitGUI(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		if (!player.hasPermission(Permissions.player) || player.hasPermission(Permissions.admin)) {
			player.sendMessage("§7[§cPermissions§7]: §7This is a §8Player §7command");
			return false;
		}

		if (plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".Kits.Player") == null) {

			Inventory playerItemMenu = Bukkit.createInventory(null, 9, "§cYou can only use this once!");

			playerItemMenu.setItem(0, new ItemStack(Material.IRON_BLOCK));
			playerItemMenu.setItem(1, new ItemStack(Material.LEATHER_CHESTPLATE));
			playerItemMenu.setItem(2, new ItemStack(Material.CAKE));
			playerItemMenu.setItem(3, new ItemStack(PvPItems.worstRemedy()));
			playerItemMenu.setItem(4, new ItemStack(PvPItems.worstRemedy()));
			playerItemMenu.setItem(5, new ItemStack(PvPItems.basicRemedy()));

			player.openInventory(playerItemMenu);
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".Kits.Player", "Used");
			plugin.saveConfig();
		}else
			player.sendMessage("§7[§cKit§7]: §7You have already used this.");
		return true;
	}
}
