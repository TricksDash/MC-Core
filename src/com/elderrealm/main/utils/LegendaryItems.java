package com.elderrealm.main.utils;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

public class LegendaryItems {

	public static ItemStack aresLongSword() {
		ItemStack als = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta alsMeta = als.getItemMeta();
		alsMeta.setDisplayName(C.gold + "Ares Long Sword");
		alsMeta.setLore(Arrays.asList(" ", C.gold + C.bold + "Legendary Item"));
		alsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		alsMeta.addEnchant(Enchantment.DURABILITY, 7, true);
		alsMeta.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		alsMeta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
		alsMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		alsMeta.addEnchant(Enchantment.THORNS, 3, true);
		als.setItemMeta(alsMeta);
		return als;
	}

	public static ItemStack demonBattleAxe() {
		ItemStack dba = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta dbaMeta = dba.getItemMeta();
		dbaMeta.setDisplayName(C.gold + "Demon Battle Axe");
		dbaMeta.setLore(Arrays.asList(" ", C.gold + C.bold + "Legendary Item"));
		dbaMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		dbaMeta.addEnchant(Enchantment.DURABILITY, 9, true);
		dbaMeta.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		dbaMeta.addEnchant(Enchantment.THORNS, 2, true);
		dbaMeta.addEnchant(Enchantment.DIG_SPEED, 7, true);
		dbaMeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
		dba.setItemMeta(dbaMeta);
		return dba;
	}

	public static ItemStack bootsOfGadlon() {
		ItemStack bog = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta bogMeta = bog.getItemMeta();
		bogMeta.setDisplayName(C.gold + "Boots of Gadlon");
		bogMeta.setLore(Arrays.asList(" ", C.gold + C.bold + "Legendary Item"));
		bogMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		bogMeta.addEnchant(Enchantment.DURABILITY, 9, true);
		bogMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
		bogMeta.addEnchant(Enchantment.PROTECTION_FIRE, 7, true);
		bogMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 7, true);
		bogMeta.addEnchant(Enchantment.PROTECTION_FALL, 10, true);
		bog.setItemMeta(bogMeta);
		return bog;
	}

	public static ItemStack fireBow() {
		ItemStack fireBow = new ItemStack(Material.BOW);
		ItemMeta fireBowMeta = fireBow.getItemMeta();
		fireBowMeta.setDisplayName(C.gold + "Fire Bow");
		fireBowMeta.setLore(Arrays.asList(" ", C.gold + C.bold + "Legendary Item"));
		fireBowMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		fireBowMeta.addEnchant(Enchantment.ARROW_FIRE, 5, true);
		fireBowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		fireBowMeta.addEnchant(Enchantment.ARROW_DAMAGE, 7, true);
		fireBowMeta.addEnchant(Enchantment.DURABILITY, 9, true);
		fireBow.setItemMeta(fireBowMeta);
		return fireBow;
	}

	public static ItemStack notchedPickaxe() {
		ItemStack notchedPick = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta notchedPickMeta = notchedPick.getItemMeta();
		notchedPickMeta.setDisplayName(C.gold + "Notched Pickaxe");
		notchedPickMeta.setLore(Arrays.asList(" ", C.gold + C.bold + "Legendary Item"));
		notchedPickMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		notchedPickMeta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		notchedPickMeta.addEnchant(Enchantment.DURABILITY, 10, true);
		notchedPickMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
		notchedPickMeta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
		notchedPick.setItemMeta(notchedPickMeta);
		return notchedPick;
	}

	public static ItemStack gondorHelmet() {
		ItemStack gondorHelmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta gondorHelmetMeta = gondorHelmet.getItemMeta();
		gondorHelmetMeta.setDisplayName(C.gold + "Helmet of Gondor");
		gondorHelmetMeta.setLore(Arrays.asList(" ", C.gold + C.bold + "Legendary Item"));
		gondorHelmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		gondorHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		gondorHelmetMeta.addEnchant(Enchantment.FROST_WALKER, 1, true);
		gondorHelmetMeta.addEnchant(Enchantment.DEPTH_STRIDER, 1, true);
		gondorHelmetMeta.addEnchant(Enchantment.OXYGEN, 10, true);
		gondorHelmetMeta.addEnchant(Enchantment.DURABILITY, 10, true);
		gondorHelmet.setItemMeta(gondorHelmetMeta);
		return gondorHelmet;
	}

	public static ItemStack enderSword() {
		ItemStack enderSword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta enderSwordMeta = enderSword.getItemMeta();
		enderSwordMeta.setDisplayName(C.gold + "Ender Sword");
		enderSwordMeta.setLore(Arrays.asList(" ", C.gold + C.bold + "Legendary Item"));
		enderSwordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		enderSwordMeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		enderSwordMeta.addEnchant(Enchantment.DURABILITY, 7, true);
		enderSwordMeta.addEnchant(Enchantment.KNOCKBACK, 2, true);
		enderSwordMeta.addEnchant(Enchantment.MENDING, 2, true);
		enderSwordMeta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
		enderSword.setItemMeta(enderSwordMeta);
		return enderSword;
	}
	
	
	public static ItemStack statTrackSword(Player killer, HumanEntity player) {		
		ItemStack als = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta alsMeta = als.getItemMeta();
		alsMeta.setDisplayName(C.gold + "StatTrack™ Sword");
		alsMeta.setLore(Arrays.asList(" ",C.gray + killer.getName() +  "'s Kills: " + C.gold + ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig().get("Player-Data." + killer.getUniqueId() + ".StatTrackKills"),
				"",
				C.gold + C.bold + "Legendary Item"));
		alsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		alsMeta.addEnchant(Enchantment.DURABILITY, 7, true);
		alsMeta.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		alsMeta.addEnchant(Enchantment.THORNS, 3, true);
		als.setItemMeta(alsMeta);
		return als;
	}
}
