package com.elderrealm.main.events.teleports;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

import com.elderrealm.main.C;

public class PvPRealmTeleporter implements Listener {

	@EventHandler
	public static void onPortalTravel(PlayerPortalEvent event) {
		if (event.getCause() == PlayerPortalEvent.TeleportCause.END_PORTAL) {
			Player player = event.getPlayer();

			if (player.getWorld() == Bukkit.getWorld("ElderRealm")) {

				Location loc = new Location(Bukkit.getWorld("ElderRealm_the_end"), 0, 65, 0);

				loc.setYaw(-45);
				player.teleport(loc);
				player.sendMessage(C.dred + "(Danger!)");
				player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Teleporting to "
						+ C.yellow + "PvP Realm");

				event.setCancelled(true);
			} else if (player.getWorld() == Bukkit.getWorld("ElderRealm_the_end")) {

				World Skyworld = Bukkit.getWorld("ElderRealm");
				Location loc = new Location(Skyworld, -304, 115, 483);
				loc.setYaw(90);
				player.teleport(loc);

				player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Welcome to " + C.yellow
						+ "Capital");

			}
		}
	}
}
