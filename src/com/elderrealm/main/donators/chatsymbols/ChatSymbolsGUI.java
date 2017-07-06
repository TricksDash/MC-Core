package com.elderrealm.main.donators.chatsymbols;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.ChatSymbols;
import com.elderrealm.main.utils.Permissions;

public class ChatSymbolsGUI implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		if (!(player.hasPermission(Permissions.diamond) || player.hasPermission(Permissions.emerald)
				|| player.hasPermission(Permissions.staff) || player.hasPermission(Permissions.gold))) {
			player.sendMessage(
					"§7[§cPermissions§7]: §7This is a §6Gold+ §7command \nPurchase at §cstore.elderrealm.net");
			return false;
		}

		Inventory symbolsMenu = Bukkit.createInventory(null, 36, C.gold + "ChatSymbols");

		// * Clear Symbol */
		symbolsMenu.setItem(31, ChatSymbols.clearSymbol(player));

		// ** Gold+**\\
		if (player.hasPermission(Permissions.gold)) {

			symbolsMenu.setItem(2, ChatSymbols.heartSymbol(player));
			symbolsMenu.setItem(3, ChatSymbols.wheelSymbol(player));
			symbolsMenu.setItem(4, ChatSymbols.omegaSymbol(player));
			symbolsMenu.setItem(5, ChatSymbols.phiSymbol(player));
			symbolsMenu.setItem(6, ChatSymbols.sigmaSymbol(player));

			symbolsMenu.setItem(10, ChatSymbols.upgradeDiamond(player));
			symbolsMenu.setItem(11, ChatSymbols.upgradeDiamond(player));
			symbolsMenu.setItem(12, ChatSymbols.upgradeDiamond(player));
			symbolsMenu.setItem(13, ChatSymbols.upgradeDiamond(player));
			symbolsMenu.setItem(14, ChatSymbols.upgradeDiamond(player));
			symbolsMenu.setItem(15, ChatSymbols.upgradeDiamond(player));
			symbolsMenu.setItem(16, ChatSymbols.upgradeDiamond(player));

			symbolsMenu.setItem(18, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(19, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(20, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(21, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(22, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(23, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(24, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(25, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(26, ChatSymbols.upgradeEmerald(player));

			player.openInventory(symbolsMenu);
		}

		// ** Diamond+**\\
		else if (player.hasPermission(Permissions.diamond) || player.hasPermission(Permissions.staff)) {

			symbolsMenu.setItem(2, ChatSymbols.heartSymbol(player));
			symbolsMenu.setItem(3, ChatSymbols.wheelSymbol(player));
			symbolsMenu.setItem(4, ChatSymbols.omegaSymbol(player));
			symbolsMenu.setItem(5, ChatSymbols.phiSymbol(player));
			symbolsMenu.setItem(6, ChatSymbols.sigmaSymbol(player));

			symbolsMenu.setItem(10, ChatSymbols.diamondSymbol(player));
			symbolsMenu.setItem(11, ChatSymbols.airplaneSymbol(player));
			symbolsMenu.setItem(12, ChatSymbols.cloverSymbol(player));
			symbolsMenu.setItem(13, ChatSymbols.arrow1Symbol(player));
			symbolsMenu.setItem(14, ChatSymbols.snowflakeSymbol(player));
			symbolsMenu.setItem(15, ChatSymbols.crossSymbol(player));
			symbolsMenu.setItem(16, ChatSymbols.star1Symbol(player));

			symbolsMenu.setItem(18, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(19, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(20, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(21, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(22, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(23, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(24, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(25, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(26, ChatSymbols.upgradeEmerald(player));

			player.openInventory(symbolsMenu);
		}

		// ** Emerald **\\

		else if (player.hasPermission(Permissions.emerald) || player.hasPermission(Permissions.staff)) {

			symbolsMenu.setItem(2, ChatSymbols.heartSymbol(player));
			symbolsMenu.setItem(3, ChatSymbols.wheelSymbol(player));
			symbolsMenu.setItem(4, ChatSymbols.omegaSymbol(player));
			symbolsMenu.setItem(5, ChatSymbols.phiSymbol(player));
			symbolsMenu.setItem(6, ChatSymbols.sigmaSymbol(player));

			symbolsMenu.setItem(10, ChatSymbols.diamondSymbol(player));
			symbolsMenu.setItem(11, ChatSymbols.airplaneSymbol(player));
			symbolsMenu.setItem(12, ChatSymbols.cloverSymbol(player));
			symbolsMenu.setItem(13, ChatSymbols.arrow1Symbol(player));
			symbolsMenu.setItem(14, ChatSymbols.snowflakeSymbol(player));
			symbolsMenu.setItem(15, ChatSymbols.crossSymbol(player));
			symbolsMenu.setItem(16, ChatSymbols.star1Symbol(player));

			symbolsMenu.setItem(18, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(19, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(20, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(21, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(22, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(23, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(24, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(25, ChatSymbols.upgradeEmerald(player));
			symbolsMenu.setItem(26, ChatSymbols.upgradeEmerald(player));

			player.openInventory(symbolsMenu);

		}
		return true;
	}
}
