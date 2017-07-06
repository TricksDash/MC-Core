package com.elderrealm.main.chatchannels;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.Permissions;

public class DonatorChannel implements CommandExecutor {

	private ElderRealmCore plugin;

	public DonatorChannel(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		if (!(player.hasPermission(Permissions.moderator) || player.hasPermission(Permissions.srMod) || player.hasPermission(Permissions.admin) || player.hasPermission(Permissions.assistant) || player.hasPermission(Permissions.diamond) || player.hasPermission(Permissions.emerald)|| player.hasPermission(Permissions.gold) || player.hasPermission(Permissions.iron))) {

			player.sendMessage("§7[§cPermissions§7]: §7This is a §aDonator §7command");
		}else {
			if (plugin.getConfig()
					.get("Player-Data." + player.getUniqueId() + ".BasicInformation.ChatChannel") == "Donator") {
				player.sendMessage("§7[§cChatChannels§7]: §cYou are already in §eDonator Chat ");
				return false;

			}
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.ChatChannel", "Donator");
			plugin.saveConfig();

			player.sendMessage("§7[§cChatChannels§7]: §7You have entered §eDonator Chat");
		}
		return true;
	}
}
