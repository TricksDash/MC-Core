package com.elderrealm.main.chatchannels;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.ElderRealmCore;

public class LocalChannel implements CommandExecutor {

	private ElderRealmCore plugin;

	public LocalChannel(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;

		if (plugin.getConfig()
				.get("Player-Data." + player.getUniqueId() + ".BasicInformation.ChatChannel") == "Local") {
			player.sendMessage("§7[§cChatChannels§7]: §cYou are already in §eLocal Chat ");
			return false;
		}

		plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.ChatChannel", "Local");
		plugin.saveConfig();
		
		player.sendMessage("§7[§cChatChannels§7]: §7You have entered §eLocal Chat");
		return true;
	}
}
