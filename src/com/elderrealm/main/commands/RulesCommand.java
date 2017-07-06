package com.elderrealm.main.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;

public class RulesCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		player.sendMessage(C.gray + "                           [" + C.red + "Rules Menu" + C.gray + "]");
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		
		player.sendMessage("§71. §cGcriefing §7is §cNOT §7allowed!");
		player.sendMessage("§73. §cHacking §7and §cExploitation §7is §cNOT §7allowed!");
		player.sendMessage("§74. §7Do §CNOT §7abuse the Chat Channels");
		player.sendMessage("§75. §7Show respect to Staff and Players on ElderRealm");
		player.sendMessage("§76. §cThievery §7is §cNOT §7tolerated in any form!");
		
		player.sendMessage(C.gold+C.bold + "-------------------------------------------");
		
		return true;
	}
}
