package com.elderrealm.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;

public class HelpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		
		
		if(args.length == 0) {
		player.sendMessage(C.gray + "                           [" + C.red + "Help Menu - Page 1" + C.gray + "]");
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		
		player.sendMessage(C.daqua + "/Capital" + C.gray + " - " +  "Teleport back to Capital Territory");
		player.sendMessage(C.daqua + "/Wild" + C.gray + " - " +  "Teleport back to the Wilderness");
		player.sendMessage(C.daqua + "/HelpRoom" + C.gray + " - " +  "Teleport back to the Help Room");
		player.sendMessage(C.daqua + "/Profile" + C.gray + " - " +  "View information on your self or others");
		player.sendMessage(C.daqua + "/Staff" + C.gray + " - " +  "See which staff are online");
		player.sendMessage(C.daqua + "/Online" + C.gray + " - " +  "See which players are online");
		player.sendMessage(C.daqua + "/Coins" + C.gray + " - " +  "Check how many Coins you have");
		player.sendMessage(C.daqua + "/Cake" + C.gray + " - " +  "Sell Cake from your inventory for Coins");
		player.sendMessage(C.daqua + "/BuyEgg" + C.gray + " - " +  "Purchase Eggs to craft cakes");
		player.sendMessage(C.daqua + "/SetBase" + C.gray + " - " +  "Sets your Base location");
		player.sendMessage(C.daqua + "/Base" + C.gray + " - " +  "Use BaseTeleports to get to your base");
		player.sendMessage(C.daqua + "/msg" + C.gray + " - " +  "Message any player online");
		player.sendMessage(C.daqua + "/r" + C.gray + " - " +  "Reply to the player who you last messaged");
		
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		}
		else if (args.length == 1 && args[0].equals("2")) {
		player.sendMessage(C.gray + "                           [" + C.red + "Chat Channels - Page 2" + C.gray + "]");
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		player.sendMessage(C.daqua + "/Main" + C.gray + " - " +  "Talk to everyone on the server");
		player.sendMessage(C.daqua + "/Local" + C.gray + " - " +  "Talk to anyone within 100 Blocks of you");
		player.sendMessage(C.daqua + "/DChat" + C.gray + " - " +  "Donators can talk together");
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		}
		
		else if (args.length == 1 &&  args[0].equals("3")) {
		player.sendMessage(C.gray + "                           [" + C.red + "Donator Perks - Page 3" + C.gray + "]");
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		player.sendMessage(C.daqua + "/Symbols" + C.gray + " - " +  "Choose a symbol to use");
		player.sendMessage(C.daqua + "/Anvil" + C.gray + " - " +  "Open an Anvil");
		player.sendMessage(C.daqua + "/Craft" + C.gray + " - " +  "Open a Crafting Table");
		player.sendMessage(C.daqua + "/ender" + C.gray + " - " +  "Open a Ender Chest");
		player.sendMessage(C.daqua + "/BattleCry" + C.gray + " - " + "Get the head of the player you kill next");
		player.sendMessage(C.daqua + "/Mine" + C.gray + " - " +  "Teleport to the Mining world");
		player.sendMessage(C.daqua + "/Near" + C.gray + " - " +  "A list of players within 50 Blocks");
		player.sendMessage(C.daqua + "/Hay" + C.gray + " - " +  "Sell Hay Blocks from your inventory");
		player.sendMessage(C.daqua + "/Books" + C.gray + " - " +  "Sell Books from your inventory");
		player.sendMessage(C.daqua + "/SellGold" + C.gray + " - " +  "Sell Gold Ingots from your inventory");
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		
		} else {
			player.sendMessage(C.gray + "                           [" + C.red + "Help Menu - Page 1" + C.gray + "]");
			player.sendMessage(C.gold+C.bold + "-------------------------------------------");
			player.sendMessage(C.daqua + "/Capital" + C.gray + " - " +  "Teleport back to Capital Territory");
			player.sendMessage(C.daqua + "/Wild" + C.gray + " - " +  "Teleport back to the Wilderness");
			player.sendMessage(C.daqua + "/HelpRoom" + C.gray + " - " +  "Teleport back to the Help Room");
			player.sendMessage(C.daqua + "/Profile" + C.gray + " - " +  "View information on your self or others");
			player.sendMessage(C.daqua + "/Staff" + C.gray + " - " +  "See which staff are online");
			player.sendMessage(C.daqua + "/Online" + C.gray + " - " +  "See which players are online");
			player.sendMessage(C.daqua + "/Coins" + C.gray + " - " +  "Check how many Coins you have");
			player.sendMessage(C.daqua + "/Cake" + C.gray + " - " +  "Sell Cake from your inventory for Coins");
			player.sendMessage(C.daqua + "/BuyEgg" + C.gray + " - " +  "Purchase Eggs to craft cakes");
			player.sendMessage(C.daqua + "/SetBase" + C.gray + " - " +  "Sets your Base location");
			player.sendMessage(C.daqua + "/Base" + C.gray + " - " +  "Use BaseTeleports to get to your base");
			player.sendMessage(C.daqua + "/msg" + C.gray + " - " +  "Message any player online");
			player.sendMessage(C.daqua + "/r" + C.gray + " - " +  "Reply to the player who last messaged");
			player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		}
		
		return true;
	}
}
