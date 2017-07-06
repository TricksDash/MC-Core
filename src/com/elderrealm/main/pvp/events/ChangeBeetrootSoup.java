package com.elderrealm.main.pvp.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import com.elderrealm.main.utils.PvPItems;

public class ChangeBeetrootSoup implements Listener {

	@EventHandler
	public void onBandageCraft(PrepareItemCraftEvent  event) {
ItemStack result = event.getRecipe().getResult();
		
		if(result.getType() == Material.BEETROOT_SOUP) {
			event.getInventory().setResult(new ItemStack(PvPItems.basicRemedy()));
			
		}
	}
}
