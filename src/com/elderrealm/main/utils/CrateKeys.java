package com.elderrealm.main.utils;

import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.elderrealm.main.C;

public class CrateKeys {
	
	public static ItemStack enderKey() {
		ItemStack enderKey = new ItemStack(Material.IRON_BARDING);
		ItemMeta enderKeyMeta = enderKey.getItemMeta();
		enderKeyMeta.setDisplayName(C.dpurple + "Ender Key " + C.gray + "(Left Click)");
		enderKeyMeta.setLore(Arrays.asList(C.gold + C.bold + "Thank you for donating!"));
		enderKey.setItemMeta(enderKeyMeta);
		return enderKey;
	}

	public static ItemStack enderCrate() {
		ItemStack enderCrate = new ItemStack(Material.CHEST);
		ItemMeta enderCrateMeta = enderCrate.getItemMeta();
		enderCrateMeta.setDisplayName(C.dpurple + "Ender Crate");
		enderCrate.setItemMeta(enderCrateMeta);
		return enderCrate;
	}

	public static ItemStack fireKey() {
		ItemStack fireKey = new ItemStack(Material.IRON_BARDING);
		ItemMeta fireKeyMeta = fireKey.getItemMeta();
		fireKeyMeta.setDisplayName(C.gold + "Fire Key " + C.gray + "(Left Click)");
		fireKeyMeta.setLore(Arrays.asList(C.gold + C.bold + "Thank you for donating!"));
		fireKey.setItemMeta(fireKeyMeta);
		return fireKey;
	}

	public static ItemStack fireCrate() {
		ItemStack fireCrate = new ItemStack(Material.CHEST);
		ItemMeta fireCrateMeta = fireCrate.getItemMeta();
		fireCrateMeta.setDisplayName(C.gold + "Fire Crate");
		fireCrate.setItemMeta(fireCrateMeta);
		return fireCrate;
	}
	
	public static ItemStack cloakKey() {
		ItemStack cloakKey = new ItemStack(Material.POTION);
		ItemMeta cloakKeyMeta = cloakKey.getItemMeta();
		cloakKeyMeta.setDisplayName(C.dpurple + "Cloak Key");
		cloakKeyMeta.setLore(Arrays.asList(C.gold + C.bold + "Thank you for donating!"));
		cloakKey.setItemMeta(cloakKeyMeta);
		return cloakKey;
	}
}
