package com.elderrealm.main.economy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

import net.milkbowl.vault.economy.Economy;

public class BalanceCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		Economy eco = ElderRealmCore.eco;

		player.sendMessage(C.gray + "Coins: " + C.gold + eco.getBalance(player));
		return true;
	}
}
