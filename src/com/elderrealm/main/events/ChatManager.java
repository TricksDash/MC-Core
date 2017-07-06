package com.elderrealm.main.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import com.elderrealm.main.utils.Permissions;

public class ChatManager implements Listener {


	@EventHandler
	public void onPlayerTalk(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		
		String rank;
		if (player.hasPermission(Permissions.admin)) {
			rank = "§e*§c";
		} else if (player.hasPermission(Permissions.srMod)) {
			rank = "§e*§2";
		} else if (player.hasPermission(Permissions.moderator)) {
			rank = "§e*§d";
		} else if (player.hasPermission(Permissions.assistant)) {
			rank = "§e*§9";
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
		
		event.setFormat("111" + rank + player.getName() + ": §7" + event.getMessage());
	}
}
