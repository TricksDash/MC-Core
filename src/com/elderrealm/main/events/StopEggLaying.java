package com.elderrealm.main.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;

public class StopEggLaying implements Listener {

	@EventHandler
	public void onItemSpawnEvent(ItemSpawnEvent event) {

		event.getEntity().getType();
		if (event.getEntity().equals(Material.EGG)) {
			event.setCancelled(true);
		}
	}
}
