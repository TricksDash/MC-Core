package com.elderrealm.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;

public class EconomyCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		player.sendMessage("                           §7[§cElderRealm Economy§7]:");
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");

		
		player.sendMessage("§3/Cake §7- Sell all Cake in your inventory for 50 Coins or more");
		player.sendMessage("§3/SellGold §7- Sell Gold from your Inventory gathered from /Mine");
		player.sendMessage("§3/Eggs §7- Purchase Eggs for 25 Coins in order to bake Cakes");
		player.sendMessage("§3/Hay §7- Donator Command - Sell Hay bales from your inventory");
		player.sendMessage("§3/Books §7- Donator Command - Sell Books from your inventory");
		player.sendMessage("§3/Coins §7- See how many Coins you have in your Bank");
		
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		
		return true;
		
	}
}
