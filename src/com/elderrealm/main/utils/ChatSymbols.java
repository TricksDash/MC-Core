package com.elderrealm.main.utils;

import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

public class ChatSymbols {

	public static ItemStack clearSymbol(Player player) {
		ItemStack clearSymbol = new ItemStack(Material.STAINED_GLASS, 1, (byte) 14);
		ItemMeta clearSymbolMeta = clearSymbol.getItemMeta();
		clearSymbolMeta.setDisplayName(C.red + "Reset Symbol");
		clearSymbolMeta.setLore(Arrays.asList(C.gray + "Clear your current symbol"));
		clearSymbol.setItemMeta(clearSymbolMeta);

		return clearSymbol;
	}

	/* Gold+ Symbols */
	public static ItemStack heartSymbol(Player player) {
		ItemStack heartSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 1);

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		ItemMeta heartSymbolMeta = heartSymbol.getItemMeta();

		if (getChatSymbol == "Heart") {
			heartSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			heartSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		heartSymbolMeta.setDisplayName(C.red + "Heart Symbol");
		heartSymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.red + "❤" + C.gray + " as your chat Symbol"));
		heartSymbol.setItemMeta(heartSymbolMeta);
		player.closeInventory();

		return heartSymbol;
	}

	public static ItemStack wheelSymbol(Player player) {
		ItemStack wheelSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 2);
		ItemMeta wheelSymbolMeta = wheelSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Wheel") {
			wheelSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			wheelSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}
		wheelSymbolMeta.setDisplayName(C.gold + "Wheel Symbol");
		wheelSymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.gold + "⎈" + C.gray + " as your chat Symbol"));
		wheelSymbol.setItemMeta(wheelSymbolMeta);
		player.closeInventory();

		return wheelSymbol;
	}

	public static ItemStack omegaSymbol(Player player) {

		ItemStack omegaSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 3);
		ItemMeta omegaSymbolMeta = omegaSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Omega") {
			omegaSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			omegaSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		omegaSymbolMeta.setDisplayName(C.blue + "Omega Symbol");
		omegaSymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.blue + "Ω" + C.gray + " as your chat Symbol"));
		omegaSymbol.setItemMeta(omegaSymbolMeta);
		player.closeInventory();

		return omegaSymbol;
	}

	public static ItemStack phiSymbol(Player player) {
		ItemStack phiSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 4);
		ItemMeta phiSymbolMeta = phiSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Phi") {
			phiSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			phiSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		phiSymbolMeta.setDisplayName(C.blue + "Phi Symbol");
		phiSymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.blue + "Φ" + C.gray + " as your chat Symbol"));
		phiSymbol.setItemMeta(phiSymbolMeta);
		player.closeInventory();

		return phiSymbol;
	}

	public static ItemStack sigmaSymbol(Player player) {
		ItemStack sigmaSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 5);
		ItemMeta sigmaSymbolMeta = sigmaSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Sigma") {
			sigmaSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			sigmaSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		sigmaSymbolMeta.setDisplayName(C.blue + "Sigma Symbol");
		sigmaSymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.blue + "Σ" + C.gray + " as your chat Symbol"));
		sigmaSymbol.setItemMeta(sigmaSymbolMeta);
		player.closeInventory();

		return sigmaSymbol;
	}

	/* Diamond Symbols */

	public static ItemStack diamondSymbol(Player player) {
		ItemStack diamondSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 6);
		ItemMeta diamondSymbolMeta = diamondSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Diamond") {
			diamondSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			diamondSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		diamondSymbolMeta.setDisplayName(C.daqua + "Diamond Symbol");
		diamondSymbolMeta
				.setLore(Arrays.asList(C.gray + "Have the " + C.daqua + "✦" + C.gray + " as your chat Symbol"));
		diamondSymbol.setItemMeta(diamondSymbolMeta);
		player.closeInventory();

		return diamondSymbol;
	}

	public static ItemStack airplaneSymbol(Player player) {
		ItemStack airplaneSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 7);
		ItemMeta airplaneSymbolMeta = airplaneSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Airplane") {
			airplaneSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			airplaneSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		airplaneSymbolMeta.setDisplayName(C.white + "Airplane Symbol");
		airplaneSymbolMeta
				.setLore(Arrays.asList(C.gray + "Have the " + C.white + "✈" + C.gray + " as your chat Symbol"));
		airplaneSymbol.setItemMeta(airplaneSymbolMeta);
		player.closeInventory();

		return airplaneSymbol;
	}

	public static ItemStack cloverSymbol(Player player) {
		ItemStack cloverSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 9);
		ItemMeta cloverSymbolMeta = cloverSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Clover") {
			cloverSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			cloverSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		cloverSymbolMeta.setDisplayName(C.green + "Clover Symbol");
		cloverSymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.green + "☘" + C.gray + " as your chat Symbol"));
		cloverSymbol.setItemMeta(cloverSymbolMeta);
		player.closeInventory();

		return cloverSymbol;
	}

	public static ItemStack arrow1Symbol(Player player) {
		ItemStack arrow1Symbol = new ItemStack(Material.INK_SACK, 1, (byte) 10);
		ItemMeta arrow1SymbolMeta = arrow1Symbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Arrow1") {
			arrow1SymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			arrow1SymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		arrow1SymbolMeta.setDisplayName(C.dgreen + "Arrow Symbol");
		arrow1SymbolMeta
				.setLore(Arrays.asList(C.gray + "Have the " + C.dgreen + "➣" + C.gray + " as your chat Symbol"));
		arrow1Symbol.setItemMeta(arrow1SymbolMeta);
		player.closeInventory();

		return arrow1Symbol;
	}

	public static ItemStack snowflakeSymbol(Player player) {
		ItemStack snowflakeSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 11);
		ItemMeta snowflakeSymbolMeta = snowflakeSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Snowflake") {
			snowflakeSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			snowflakeSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		snowflakeSymbolMeta.setDisplayName(C.white + "Snowflake Symbol");
		snowflakeSymbolMeta
				.setLore(Arrays.asList(C.gray + "Have the " + C.gray + "❅" + C.gray + " as your chat Symbol"));
		snowflakeSymbol.setItemMeta(snowflakeSymbolMeta);
		player.closeInventory();

		return snowflakeSymbol;
	}

	public static ItemStack crossSymbol(Player player) {
		ItemStack crossSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 12);
		ItemMeta crossSymbolMeta = crossSymbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Cross") {
			crossSymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			crossSymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		crossSymbolMeta.setDisplayName(C.red + "Cross Symbol");
		crossSymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.red + "✕" + C.gray + " as your chat Symbol"));
		crossSymbol.setItemMeta(crossSymbolMeta);
		player.closeInventory();

		return crossSymbol;
	}

	public static ItemStack star1Symbol(Player player) {
		ItemStack star1Symbol = new ItemStack(Material.INK_SACK, 1, (byte) 13);
		ItemMeta star1SymbolMeta = star1Symbol.getItemMeta();

		String getChatSymbol = (String) ElderRealmCore.getPlugin(ElderRealmCore.class).getConfig()
				.get("Player-Data." + player.getUniqueId() + ".ChatSymbols.SymbolSelected");

		if (getChatSymbol == "Star1") {
			star1SymbolMeta.addEnchant(Enchantment.DURABILITY, 1, true);
			star1SymbolMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		}

		star1SymbolMeta.setDisplayName(C.yellow + "Star");
		star1SymbolMeta.setLore(Arrays.asList(C.gray + "Have the " + C.yellow + "✪" + C.gray + " as your chat Symbol"));
		star1Symbol.setItemMeta(star1SymbolMeta);
		player.closeInventory();

		return star1Symbol;
	}

	/* Upgrade Diamond */
	public static ItemStack upgradeDiamond(Player player) {
		ItemStack upgradeDiamondSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 8);
		ItemMeta upgradeDiamondSymbolMeta = upgradeDiamondSymbol.getItemMeta();
		upgradeDiamondSymbolMeta.setDisplayName(C.red + "Symbol Locked");
		upgradeDiamondSymbolMeta.setLore(Arrays.asList(C.gray + "To unlock this symbol, ",
				C.gray + "upgrade your rank to " + C.daqua + "Diamond", "", C.red + "store.elderrealm.net", "",
				C.gold + "/Donate"));
		upgradeDiamondSymbol.setItemMeta(upgradeDiamondSymbolMeta);

		return upgradeDiamondSymbol;
	}

	/* Upgrade Emerald */
	public static ItemStack upgradeEmerald(Player player) {
		ItemStack upgradeEmeraldSymbol = new ItemStack(Material.INK_SACK, 1, (byte) 8);
		ItemMeta upgradeEmeraldSymbolMeta = upgradeEmeraldSymbol.getItemMeta();
		upgradeEmeraldSymbolMeta.setDisplayName(C.red + "Coming Soon");
		upgradeEmeraldSymbolMeta.setLore(Arrays.asList(C.gray + "To unlock this symbol, ",
				C.gray + "upgrade your rank to " + C.green + "Emerald", "", C.red + "store.elderrealm.net", "",
				C.gold + "/Donate"));
		upgradeEmeraldSymbol.setItemMeta(upgradeEmeraldSymbolMeta);

		return upgradeEmeraldSymbol;
	}
}
