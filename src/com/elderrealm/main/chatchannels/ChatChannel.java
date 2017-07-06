package com.elderrealm.main.chatchannels;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.Permissions;

public class ChatChannel implements Listener {

	private ElderRealmCore plugin;

	public ChatChannel(ElderRealmCore pl) {
		plugin = pl;

	}

	@EventHandler
	public void onChatChannel(AsyncPlayerChatEvent event) {
		Player player = (Player) event.getPlayer();

		String chatSymbol;
		if (!(plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolIcon") == null)) {

			chatSymbol = (String) plugin.getConfig()
					.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolIcon");
		} else
			chatSymbol = "";
		{

			String chatChannel = (String) plugin.getConfig()
					.get("Player-Data." + player.getUniqueId() + ".BasicInformation.ChatChannel");

			if (chatChannel == "Staff") {
				Bukkit.broadcast(C.dgray + "[Staff] " + chatSymbol + player.getDisplayName() + C.gray + ": " + C.yellow
						+ event.getMessage(), Permissions.staff);
				event.setCancelled(true);

			} else if (chatChannel == "Main") {
				event.setFormat(C.dgray + "[Main] " + chatSymbol + player.getDisplayName() + C.gray + ": "
						+ event.getMessage());

			} else if (chatChannel == "Local") {
				for (Entity nearby : player.getNearbyEntities(100, 100, 100)) {
					if (nearby instanceof Player) {
						nearby.sendMessage(C.dgray + "[Local] " + chatSymbol + player.getDisplayName() + C.gray + ": "
								+ event.getMessage());
					}
				}
				player.sendMessage(C.dgray + "[Local] " + chatSymbol + player.getDisplayName() + C.gray + ": "
						+ event.getMessage());
				event.setCancelled(true);

			} else if (plugin.getConfig()
					.get("Player-Data." + player.getUniqueId() + ".BasicInformation.ChatChannel") == "Donator") {

				for (Player donatorPlayers : Bukkit.getOnlinePlayers()) {
					if (donatorPlayers.hasPermission(Permissions.staff) || player.hasPermission(Permissions.diamond)
							|| player.hasPermission(Permissions.emerald) || player.hasPermission(Permissions.gold)
							|| player.hasPermission(Permissions.iron)) {

						donatorPlayers.sendMessage(C.dgray + "[Donator] " + chatSymbol + player.getDisplayName() + C.gray + ": "
								+ C.yellow + event.getMessage());
					}
				}
				event.setCancelled(true);

			} else {
				event.setFormat(C.dgray + "[Main] " + chatSymbol + player.getDisplayName() + C.gray + ": "
						+ event.getMessage());

			}
		}
	}
}
