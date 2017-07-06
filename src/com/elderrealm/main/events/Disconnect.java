package com.elderrealm.main.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.elderrealm.main.utils.Permissions;

public class Disconnect implements Listener {

	@EventHandler
	public void onQuitEvent(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		event.setQuitMessage(null);

		String rank;
		if (player.hasPermission(Permissions.admin)) {
			rank = "§c";
		} else if (player.hasPermission(Permissions.srMod)) {
			rank = "§2";
		} else if (player.hasPermission(Permissions.moderator)) {
			rank = "§d";
		} else if (player.hasPermission(Permissions.assistant)) {
			rank = "§9";
		} else if (player.hasPermission(Permissions.emerald)) {
			rank = "§a";
		} else if (player.hasPermission(Permissions.diamond)) {
			rank = "§3";
		} else if (player.hasPermission(Permissions.gold)) {
			rank = "§6";
		} else if (player.hasPermission(Permissions.iron)) {
			rank = "§f";
		} else {
			rank = "§8";
		}

		if (player.hasPermission(Permissions.admin)) {
			event.setQuitMessage("§7[§c-§7] §e" + rank + player.getName() + " §7has left their Realm.");

		} else if (player.hasPermission(Permissions.srMod) || player.hasPermission(Permissions.moderator)
				|| player.hasPermission(Permissions.assistant)) {
			event.setQuitMessage("§7[§c-§7] §e" + rank + player.getName() + " §7has been summoned out of the Realm.");
		
		} else if (player.hasPermission(Permissions.emerald) || player.hasPermission(Permissions.diamond) || player.hasPermission(Permissions.gold) || player.hasPermission(Permissions.iron)) {
			event.setQuitMessage("§7[§c-§7] §e" + rank + player.getName() + " §7has graced another Realm with their presence.");
		
		} else {
			event.setQuitMessage("§7[§c-§7] §e" + rank + player.getName() + " §7has left the Realm.");
		}
	}
}
