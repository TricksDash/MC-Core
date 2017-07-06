package com.elderrealm.main.utils;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.elderrealm.main.C;

public class RareItems {

	public static ItemStack GuidedPickaxe() {
		ItemStack guidedPickaxe = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta guidedPickaxeMeta = guidedPickaxe.getItemMeta();
		guidedPickaxeMeta.setDisplayName(C.blue + "Guided Pickaxe");
		guidedPickaxeMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		guidedPickaxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		guidedPickaxeMeta.addEnchant(Enchantment.DURABILITY, 4, true);
		guidedPickaxeMeta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		guidedPickaxeMeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		guidedPickaxe.setItemMeta(guidedPickaxeMeta);
		return guidedPickaxe;
	}

	public static ItemStack LovingPickaxe() {
		ItemStack lovingPickaxe = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta lovingPickaxeMeta = lovingPickaxe.getItemMeta();
		lovingPickaxeMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Pickaxe" + C.red + " ❤");
		lovingPickaxeMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingPickaxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingPickaxeMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		lovingPickaxeMeta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		lovingPickaxeMeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true);
		lovingPickaxeMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingPickaxe.setItemMeta(lovingPickaxeMeta);
		return lovingPickaxe;
	}

	public static ItemStack LovingSword() {
		ItemStack lovingPickaxe = new ItemStack(Material.IRON_SWORD);
		ItemMeta lovingPickaxeMeta = lovingPickaxe.getItemMeta();
		lovingPickaxeMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Sword" + C.red + " ❤");
		lovingPickaxeMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingPickaxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingPickaxeMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		lovingPickaxeMeta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		lovingPickaxeMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
		lovingPickaxeMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingPickaxe.setItemMeta(lovingPickaxeMeta);
		return lovingPickaxe;
	}

	public static ItemStack LovingAxe() {
		ItemStack lovingAxe = new ItemStack(Material.GOLD_AXE);
		ItemMeta lovingAxeMeta = lovingAxe.getItemMeta();
		lovingAxeMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Axe" + C.red + " ❤");
		lovingAxeMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingAxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingAxeMeta.addEnchant(Enchantment.DURABILITY, 1, true);
		lovingAxeMeta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		lovingAxeMeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
		lovingAxeMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingAxe.setItemMeta(lovingAxeMeta);
		return lovingAxe;
	}

	public static ItemStack LovingShield() {
		ItemStack lovingShield = new ItemStack(Material.SHIELD);
		ItemMeta lovingShieldMeta = lovingShield.getItemMeta();
		lovingShieldMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Shield" + C.red + " ❤");
		lovingShieldMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingShieldMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingShieldMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		lovingShieldMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingShield.setItemMeta(lovingShieldMeta);
		return lovingShield;
	}

	public static ItemStack LovingHelmet() {
		ItemStack lovingHelmet = new ItemStack(Material.IRON_HELMET);
		ItemMeta lovingHelmetMeta = lovingHelmet.getItemMeta();
		lovingHelmetMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Helmet" + C.red + " ❤");
		lovingHelmetMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingHelmetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingHelmetMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		lovingHelmetMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingHelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		lovingHelmetMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 3, true);
		lovingHelmet.setItemMeta(lovingHelmetMeta);
		return lovingHelmet;
	}

	public static ItemStack LovingChestplate() {
		ItemStack lovingChestplate = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta lovingChestplateMeta = lovingChestplate.getItemMeta();
		lovingChestplateMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Chestplate" + C.red + " ❤");
		lovingChestplateMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingChestplateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingChestplateMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		lovingChestplateMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingChestplateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		lovingChestplateMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 3, true);
		lovingChestplate.setItemMeta(lovingChestplateMeta);
		return lovingChestplate;
	}

	public static ItemStack LovingLeggings() {
		ItemStack lovingLeggings = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta lovingLeggingsMeta = lovingLeggings.getItemMeta();
		lovingLeggingsMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Leggings" + C.red + " ❤");
		lovingLeggingsMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingLeggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingLeggingsMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		lovingLeggingsMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingLeggingsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		lovingLeggingsMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 3, true);
		lovingLeggings.setItemMeta(lovingLeggingsMeta);
		return lovingLeggings;
	}

	public static ItemStack LovingBoots() {
		ItemStack lovingBoots = new ItemStack(Material.IRON_BOOTS);
		ItemMeta lovingBootsMeta = lovingBoots.getItemMeta();
		lovingBootsMeta.setDisplayName(C.red + "❤ " + C.blue + "Loving Boots" + C.red + " ❤");
		lovingBootsMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		lovingBootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lovingBootsMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		lovingBootsMeta.addEnchant(Enchantment.THORNS, 1, true);
		lovingBootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		lovingBootsMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 3, true);
		lovingBoots.setItemMeta(lovingBootsMeta);
		return lovingBoots;
	}

	public static ItemStack SlayingSword() {
		ItemStack slayingSword = new ItemStack(Material.IRON_SWORD);
		ItemMeta slayingSwordMeta = slayingSword.getItemMeta();
		slayingSwordMeta.setDisplayName(C.blue + "Slaying Sword");
		slayingSwordMeta.setLore(Arrays.asList(" ", C.blue + "Rare Item"));
		slayingSwordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		slayingSwordMeta.addEnchant(Enchantment.DURABILITY, 3, true);
		slayingSwordMeta.addEnchant(Enchantment.DAMAGE_UNDEAD, 4, true);
		slayingSwordMeta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 3, true);
		slayingSwordMeta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		slayingSword.setItemMeta(slayingSwordMeta);
		return slayingSword;
	}
}
