package com.elderrealm.main.items;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.Permissions;
import com.elderrealm.main.utils.PvPItems;

public class PvPItemsGUI implements CommandExecutor {

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
		
		Inventory pvpItemsMenu = Bukkit.createInventory(null, 45, "PvP Items");
	
	//** Legendary **\\
		pvpItemsMenu .setItem(0, PvPItems.bestRemedy());
		pvpItemsMenu .setItem(1, PvPItems.basicRemedy());
		pvpItemsMenu .setItem(2, PvPItems.worstRemedy());
	
		player.openInventory(pvpItemsMenu);
	
		}
		return true;
	}
}
