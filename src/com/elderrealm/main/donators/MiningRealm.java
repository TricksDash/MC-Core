package com.elderrealm.main.donators;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

import com.elderrealm.main.C;

public class MiningRealm implements Listener {

	@EventHandler
	public static void onPortalTravel(PlayerPortalEvent event) {
		if (event.getCause() == PlayerPortalEvent.TeleportCause.NETHER_PORTAL) {
			event.setCancelled(true);

			Player player = event.getPlayer();
			Location loc = new Location(Bukkit.getServer().getWorld("Mining"),411, 69, 328);

			loc.setYaw(180);
			player.teleport(loc);
			player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Teleporting to " + C.yellow
					+ "Mining Realm");
			player.sendMessage(C.dred+C.bold+C.underline + "Do not create bases in this Realm, it RESETS regulary");
		}
	}
}
