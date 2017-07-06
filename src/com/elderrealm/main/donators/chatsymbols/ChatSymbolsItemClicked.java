package com.elderrealm.main.donators.chatsymbols;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.ChatSymbols;

public class ChatSymbolsItemClicked implements Listener {

	private ElderRealmCore plugin;

	public ChatSymbolsItemClicked(ElderRealmCore pl) {
		plugin = pl;

	}

	@EventHandler
	public void onInvClickEvent(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();

		if (event.getInventory().getTitle().equals(C.gold + "ChatSymbols")) {
			event.setCancelled(true);

			/* Gold Symbols */
			if (event.getCurrentItem().equals(ChatSymbols.heartSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Heart");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§c❤ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.red + "Heart " + C.gray
						+ "symbol Selected");

			} else if (event.getCurrentItem().equals(ChatSymbols.wheelSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Wheel");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§6⎈ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.gold + "Wheel " + C.gray
						+ "symbol Selected");

			} else if (event.getCurrentItem().equals(ChatSymbols.omegaSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Omega");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§9Ω ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.blue + "Omega " + C.gray
						+ "symbol Selected");

			} else if (event.getCurrentItem().equals(ChatSymbols.phiSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Phi");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§9Φ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.blue + "Phi " + C.gray
						+ "symbol Selected");
			} else if (event.getCurrentItem().equals(ChatSymbols.sigmaSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Sigma");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§9Σ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.blue + "Sigma " + C.gray
						+ "symbol Selected");

				/* Diamond Symbols */
			} else if (event.getCurrentItem().equals(ChatSymbols.diamondSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected",
						"Diamond");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§3✦ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.daqua + "Diamond " + C.gray
						+ "symbol Selected");
			} else if (event.getCurrentItem().equals(ChatSymbols.airplaneSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected",
						"Airplane");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§f✈ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.white + "Airplane " + C.gray
						+ "symbol Selected");
			} else if (event.getCurrentItem().equals(ChatSymbols.cloverSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Clover");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§a☘ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.green + "Clover " + C.gray
						+ "symbol Selected");

			} else if (event.getCurrentItem().equals(ChatSymbols.arrow1Symbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Arrow1");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§2➣ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.dgreen + "Arrow " + C.gray
						+ "symbol Selected");
			} else if (event.getCurrentItem().equals(ChatSymbols.snowflakeSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected",
						"Snowflake");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§f❅ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.white + "Snowflake "
						+ C.gray + "symbol Selected");

			} else if (event.getCurrentItem().equals(ChatSymbols.crossSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Cross");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§4✕ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.red + "Cross " + C.gray
						+ "symbol Selected");
			} else if (event.getCurrentItem().equals(ChatSymbols.star1Symbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected", "Star1");
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon", "§e✪ ");
				plugin.saveConfig();
				player.sendMessage(C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.yellow + "Star " + C.gray
						+ "symbol Selected");

				/* Clear Symbol */
			} else if (event.getCurrentItem().equals(ChatSymbols.clearSymbol(player))) {
				plugin.getConfig().set("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols", null);
				player.sendMessage(
						C.gray + "[" + C.red + "ChatSymbols" + C.gray + "] " + C.gray + "Your Symbol has been removed");
			}
			plugin.saveConfig();
		}
	}
}
