package com.elderrealm.main.utils;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.elderrealm.main.C;

public class MythicalItems {

	public static ItemStack BattleSword() {
		ItemStack battleSword = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta battleSwordMeta = battleSword.getItemMeta();
		battleSwordMeta.setDisplayName(C.dpurple + "Battle Sword");
		battleSwordMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleSwordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleSwordMeta.addEnchant(Enchantment.DURABILITY, 4, true);
		battleSwordMeta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		battleSwordMeta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
		battleSword.setItemMeta(battleSwordMeta);
		return battleSword;
	}

	public static ItemStack BattleAxe() {
		ItemStack battleAxe = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta battleAxeMeta = battleAxe.getItemMeta();
		battleAxeMeta.setDisplayName(C.dpurple + "Battle Axe");
		battleAxeMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleAxeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleAxeMeta.addEnchant(Enchantment.DURABILITY, 6, true);
		battleAxeMeta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		battleAxeMeta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		battleAxe.setItemMeta(battleAxeMeta);
		return battleAxe;
	}

	public static ItemStack BattleBow() {
		ItemStack battleBow = new ItemStack(Material.BOW);
		ItemMeta battleBowMeta = battleBow.getItemMeta();
		battleBowMeta.setDisplayName(C.dpurple + "Battle Bow");
		battleBowMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleBowMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleBowMeta.addEnchant(Enchantment.ARROW_DAMAGE, 4, true);
		battleBowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		battleBowMeta.addEnchant(Enchantment.DURABILITY, 4, true);
		battleBow.setItemMeta(battleBowMeta);
		return battleBow;
	}

	public static ItemStack BattleShield() {
		ItemStack battleShield = new ItemStack(Material.SHIELD);
		ItemMeta battleShieldMeta = battleShield.getItemMeta();
		battleShieldMeta.setDisplayName(C.dpurple + "Battle Shield");
		battleShieldMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleShieldMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleShieldMeta.addEnchant(Enchantment.THORNS, 3, true);
		battleShieldMeta.addEnchant(Enchantment.DURABILITY, 10, true);
		battleShield.setItemMeta(battleShieldMeta);
		return battleShield;
	}

	public static ItemStack BattleChestplate() {
		ItemStack battleChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta battleChestplateMeta = battleChestplate.getItemMeta();
		battleChestplateMeta.setDisplayName(C.dpurple + "Battle Chestplate");
		battleChestplateMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleChestplateMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleChestplateMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		battleChestplateMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
		battleChestplateMeta.addEnchant(Enchantment.THORNS, 1, true);
		battleChestplateMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		battleChestplate.setItemMeta(battleChestplateMeta);
		return battleChestplate;
	}

	public static ItemStack BattleLeggings() {
		ItemStack battleLeggings = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta battleLeggingsMeta = battleLeggings.getItemMeta();
		battleLeggingsMeta.setDisplayName(C.dpurple + "Battle Leggings");
		battleLeggingsMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleLeggingsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleLeggingsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		battleLeggingsMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
		battleLeggingsMeta.addEnchant(Enchantment.THORNS, 1, true);
		battleLeggingsMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		battleLeggings.setItemMeta(battleLeggingsMeta);
		return battleLeggings;
	}

	public static ItemStack BattleHelmet() {
		ItemStack battleHelmets = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta battleHelmetsMeta = battleHelmets.getItemMeta();
		battleHelmetsMeta.setDisplayName(C.dpurple + "Battle Helmet");
		battleHelmetsMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleHelmetsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleHelmetsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		battleHelmetsMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
		battleHelmetsMeta.addEnchant(Enchantment.THORNS, 1, true);
		battleHelmetsMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		battleHelmets.setItemMeta(battleHelmetsMeta);
		return battleHelmets;
	}

	public static ItemStack BattleBoots() {
		ItemStack battleBoots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta battleBootsMeta = battleBoots.getItemMeta();
		battleBootsMeta.setDisplayName(C.dpurple + "Battle Boots");
		battleBootsMeta.setLore(Arrays.asList(" ", C.dpurple + C.bold + "Mythical Item"));
		battleBootsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		battleBootsMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		battleBootsMeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
		battleBootsMeta.addEnchant(Enchantment.THORNS, 1, true);
		battleBootsMeta.addEnchant(Enchantment.DURABILITY, 5, true);
		battleBoots.setItemMeta(battleBootsMeta);
		return battleBoots;
	}
}
