package com.elderrealm.main.events;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

import com.elderrealm.main.C;

public class DenyShieldCraft implements Listener {

	@EventHandler
	public void onCraftItem(CraftItemEvent event) {
		ItemStack item = event.getCurrentItem();
		HumanEntity player = event.getWhoClicked();

		if (item.getType().equals(Material.SHIELD) || item.getType().equals(Material.ANVIL)) {
			event.setCancelled(true);
			player.sendMessage(
					C.gray + "[" + C.red + "Crafting" + C.gray + "] " + C.dgray + "You can't craft this item!");
		}

	}

}
