package com.elderrealm.main.items;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.LegendaryItems;
import com.elderrealm.main.utils.MythicalItems;
import com.elderrealm.main.utils.Permissions;
import com.elderrealm.main.utils.RareItems;

public class CustomItemsGUI implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)){
			sender.sendMessage("You are not a player");
		return false;
		}
		Player player = (Player) sender;
		if(!player.hasPermission(Permissions.admin)) {
			player.sendMessage(C.red + "You do not have permission.");
		}else{
		
		Inventory customItemMenu = Bukkit.createInventory(null, 45, "Legendary Items");
	
	//** Legendary **\\
	customItemMenu.setItem(0, LegendaryItems.aresLongSword());
	customItemMenu.setItem(1, LegendaryItems.bootsOfGadlon());
	customItemMenu.setItem(2, LegendaryItems.demonBattleAxe());
	customItemMenu.setItem(3, LegendaryItems.fireBow());
	customItemMenu.setItem(4, LegendaryItems.gondorHelmet());
	customItemMenu.setItem(5, LegendaryItems.notchedPickaxe());
	
	//* Mythical *\\
	customItemMenu.setItem(9, MythicalItems.BattleSword());
	customItemMenu.setItem(10, MythicalItems.BattleAxe());
	customItemMenu.setItem(11, MythicalItems.BattleBow());
	customItemMenu.setItem(12, MythicalItems.BattleShield());
	customItemMenu.setItem(13, MythicalItems.BattleChestplate());
	customItemMenu.setItem(14, MythicalItems.BattleLeggings());
	customItemMenu.setItem(15, MythicalItems.BattleHelmet());
	customItemMenu.setItem(16, MythicalItems.BattleBoots());
	
	//* Rare Items *\\
	customItemMenu.setItem(18, RareItems.GuidedPickaxe());
	customItemMenu.setItem(19, RareItems.LovingPickaxe());
	customItemMenu.setItem(20, RareItems.LovingSword());
	customItemMenu.setItem(21, RareItems.LovingAxe());
	customItemMenu.setItem(21, RareItems.LovingShield());
	customItemMenu.setItem(22, RareItems.LovingHelmet());
	customItemMenu.setItem(23, RareItems.LovingChestplate());
	customItemMenu.setItem(24, RareItems.LovingLeggings());
	customItemMenu.setItem(25, RareItems.LovingBoots());
	customItemMenu.setItem(25, RareItems.SlayingSword());
	
	
	player.openInventory(customItemMenu);
	
		}
		return true;
	}
}
