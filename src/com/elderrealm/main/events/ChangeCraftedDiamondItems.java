package com.elderrealm.main.events;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

import com.elderrealm.main.C;

public class ChangeCraftedDiamondItems implements Listener {

	@EventHandler
	public void onCraftItem(CraftItemEvent event) {
		ItemStack item = event.getCurrentItem();
		HumanEntity player = event.getWhoClicked();

		if (item.getType() == Material.DIAMOND_BLOCK) {
			return;

		} else if (item.getType().name().contains("DIAMOND_")) {
			event.setCancelled(true);
			player.sendMessage(
					C.gray + "[" + C.red + "Crafting" + C.gray + "] " + C.dgray + "You can't craft " + item.getType());
		}
	}
}
