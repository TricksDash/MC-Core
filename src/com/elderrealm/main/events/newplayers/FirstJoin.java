package com.elderrealm.main.events.newplayers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

import net.milkbowl.vault.economy.Economy;

public class FirstJoin implements Listener {

	private ElderRealmCore plugin;

	public FirstJoin(ElderRealmCore pl) {
		plugin = pl;

	}

	@EventHandler
	public void onFirstJoin(PlayerJoinEvent event) {
		Player player = (Player) event.getPlayer();

		if (!player.hasPlayedBefore()) {

			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.DateJoined",
					new SimpleDateFormat("dd/MM/yy").format(new Date()));
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.NameWhenJoined",
					player.getName());
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.IPAddressFirstConnect",
					player.getAddress().getHostName());
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.BaseTPs", 5);
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.ChatChannel", "Main");
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.EggsPurchased", 0);
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BasicInformation.CakesSold", 0);
			plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".StatTrackKills", 0);

			plugin.getConfig().createSection("Player-Data." + player.getUniqueId() + ".ChatSymbols");
			plugin.getConfig().createSection("Player-Data." + player.getUniqueId() + ".Bases");
			plugin.saveConfig();

			Economy eco = ElderRealmCore.eco;

			//eco.depositPlayer(player, 250);
			player.sendMessage(
					C.red + "-*+*- " + C.yellow+ "We have added 250 Coins to your account" + C.red + " -*+*-");

			Bukkit.broadcastMessage(C.gray + "[" + C.red + "Connection" + C.gray + "] " + C.gray + "Welcome " + C.yellow
					+ player.getName() + C.gray + " to ElderRealm!");
			
			player.sendMessage(C.gray + "Website: " + C.gold + "http://www.ElderRealm.net");
			player.sendMessage(C.gray + "Donate: " + C.gold + "http://store.ElderRealm.net");
			player.sendMessage(C.gray + "Discord: " + C.gold + "https://discord.gg/YuDKbww");
			player.sendMessage("");
			player.sendMessage(C.gray + "Help Guide: " + C.gold + "/Help");
			player.sendMessage(C.gray + "Economy Guide: " + C.gold + "/Economy");
			player.sendMessage(C.gray + "Guilds Guide: " + C.gold + "/Guilds");
			player.sendMessage("");
			player.sendMessage(C.gray+C.underline + "Go to the Wilderness using §6/Wild §7or go to the Mining Realm \n "
					+ "by going through the Portal outside of Capital");
			player.sendMessage("");
			
			World Skyworld = Bukkit.getWorld("ElderRealm");
			Location loc = new Location(Skyworld, -44, 129, -128);
			loc.setYaw(90);
			player.teleport(loc);

			ItemStack commonPickaxe = new ItemStack(Material.STONE_PICKAXE);
			ItemMeta commonPickaxeMeta = commonPickaxe.getItemMeta();
			commonPickaxe.setItemMeta(commonPickaxeMeta);

			player.getInventory().setItem(0, commonPickaxe);

			ItemStack commonSword = new ItemStack(Material.IRON_SWORD);
			ItemMeta commonSwordMeta = commonSword.getItemMeta();
			commonSword.setDurability((short) 100);
			commonSword.setItemMeta(commonSwordMeta);

			player.getInventory().setItem(1, commonSword);

			ItemStack commonTorches = new ItemStack(Material.TORCH, 16);
			ItemMeta commonTorchesMeta = commonTorches.getItemMeta();
			commonTorches.setItemMeta(commonTorchesMeta);

			player.getInventory().setItem(8, commonTorches);

			ItemStack commonApple = new ItemStack(Material.APPLE, 16);
			ItemMeta commonAppleMeta = commonApple.getItemMeta();
			commonApple.setItemMeta(commonAppleMeta);

			player.getInventory().setItem(7, commonApple);
		}
	}
}
