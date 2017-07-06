package com.elderrealm.main.donators.chatsymbols;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

public class SymbolsInChat implements Listener {

	private ElderRealmCore plugin;

	public SymbolsInChat(ElderRealmCore pl) {
		plugin = pl;

	}

	@EventHandler
	public void onDonatorSymbols(AsyncPlayerChatEvent event) {
		Player player = (Player) event.getPlayer();

		String getChatSymbol = (String) plugin.getConfig()
				.get("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolSelected");

		String chatSymbol = (String) plugin.getConfig()
				.get("Player-Data." + player.getUniqueId().toString() + ".ChatSymbols.SymbolIcon");

		/* Gold */
		if (getChatSymbol == "Heart") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Wheel") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Omega") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Phi") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Sigma") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

			/* Diamond */

		} else if (getChatSymbol == "Diamond") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Airplane") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Clover") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Arrow1") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Snowflake") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Cross") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

		} else if (getChatSymbol == "Star1") {
			event.setFormat(chatSymbol + player.getDisplayName() + C.gray + ": " + event.getMessage());

			/* Emerald */

		} else {
			event.setFormat(player.getDisplayName() + C.gray + ": " + event.getMessage());
		}
		plugin.saveConfig();
	}
}
