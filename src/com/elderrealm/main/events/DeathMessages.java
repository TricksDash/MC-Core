package com.elderrealm.main.events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.LegendaryItems;
import com.elderrealm.main.utils.Permissions;

import net.milkbowl.vault.economy.Economy;

public class DeathMessages implements Listener {

	private ElderRealmCore plugin;

	public DeathMessages(ElderRealmCore pl) {
		plugin = pl;

	}

	@EventHandler
	public void onPlayerDeathEvent(PlayerDeathEvent event) {

		if (event.getEntity() instanceof Player) {
			Player player = event.getEntity();
			Economy eco = ElderRealmCore.eco;

			World playerWorld = player.getWorld();

			int x = player.getLocation().getBlockX();
			int z = player.getLocation().getBlockZ();

			Location loc = player.getLocation();
			
			String nameColor;
			if(player.hasPermission(Permissions.admin)){
				nameColor = "§c";
			}else if(player.hasPermission(Permissions.srMod)){
				nameColor = "§2";
			}else if(player.hasPermission(Permissions.moderator)){
				nameColor = "§d";
			}else if(player.hasPermission(Permissions.assistant)){
				nameColor = "§9";
			}else if(player.hasPermission(Permissions.emerald)){
				nameColor = "§a";
			}else if(player.hasPermission(Permissions.diamond)){
				nameColor = "§3";
			}else if(player.hasPermission(Permissions.gold)){
				nameColor = "§6";
			}else if(player.hasPermission(Permissions.iron)){
				nameColor = "§f";
			}else{
				nameColor = "§8";
			}			
			
			
			
			if (event.getDeathMessage().contains("was slain by")) {
				Player killer = Bukkit.getPlayer(event.getEntity().getKiller().getName());
				
				String killerNameColor;
				if(killer.hasPermission(Permissions.admin)){
					killerNameColor = "§c";
				}else if(killer.hasPermission(Permissions.srMod)){
					killerNameColor = "§2";
				}else if(killer.hasPermission(Permissions.moderator)){
					killerNameColor = "§d";
				}else if(killer.hasPermission(Permissions.assistant)){
					killerNameColor = "§9";
				}else if(killer.hasPermission(Permissions.emerald)){
					killerNameColor = "§a";
				}else if(killer.hasPermission(Permissions.diamond)){
					killerNameColor = "§3";
				}else if(killer.hasPermission(Permissions.gold)){
					killerNameColor = "§6";
				}else if(killer.hasPermission(Permissions.iron)){
					killerNameColor = "§f";
				}else{
					killerNameColor = "§8";
				}	
				
				event.setDeathMessage(C.gray + "[" + nameColor + event.getEntity().getName() + C.gray + "] " + C.yellow
						+ "was killed by " + C.gray + "[" + killerNameColor + event.getEntity().getKiller().getName() + C.gray
						+ "] " + C.yellow + "- " + C.gray + C.gray + "[" + C.dgray + x + ", " + z + " | "
						+ playerWorld.getName() + C.gray + "]");

				player.getWorld().strikeLightningEffect(player.getLocation());

				short durability = killer.getInventory().getItemInMainHand().getDurability();
				if (killer.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(C.gold + "StatTrack™ Sword")) {
					plugin.getConfig().set("Player-Data." + killer.getUniqueId() + ".StatTrackKills",
							plugin.getConfig().getInt("Player-Data." + killer.getUniqueId() + ".StatTrackKills") + 1);
					plugin.saveConfig();

					ItemStack statTrackSword = new ItemStack(LegendaryItems.statTrackSword(killer, null));
					statTrackSword.setDurability(durability);

					killer.getInventory().setItemInMainHand(statTrackSword);
				}
				if(plugin.getConfig().get("Player-Data." + killer.getUniqueId() + ".BattleCry").equals("Active")) {
					
					ItemStack playerSkull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
					SkullMeta playerSkullMeta = (SkullMeta) playerSkull.getItemMeta();
					playerSkullMeta.setOwner(player.getName());
					playerSkull.setItemMeta(playerSkullMeta);
					plugin.getConfig().set("Player-Data." + killer.getUniqueId() + ".BattleCry", "inActive");
					plugin.saveConfig();
					
					World world = player.getWorld();
					world.dropItem(player.getLocation(), playerSkull);
					
				}
				
				double playersBalance = eco.getBalance(player);
				double amount = playersBalance / 10;
				
				eco.depositPlayer(killer, amount);
				eco.withdrawPlayer(player, amount);
				
				player.sendMessage(C.gold + "-" + amount + " Coins");
				killer.sendMessage(C.gold + "+" + amount + " Coins");

				if (player.getLocation().getBlock().getType().equals(Material.AIR)) {
					DateFormat dateFormat = new SimpleDateFormat(C.gray + "[" + C.gold + "dd-mm-yy" + C.gray + "]");
					Date date = new Date();
					Block blockToChange = playerWorld.getBlockAt(loc);
					blockToChange.setType(Material.SIGN_POST);
					Sign s = (Sign) blockToChange.getState();
					s.setLine(0, dateFormat.format(date));
					s.setLine(1, "-*+*-");
					s.setLine(2, "Killer: " + C.red + event.getEntity().getKiller().getName());
					s.setLine(3, "Victim: " + C.daqua + player.getName());
					s.update();
					
					player.getWorld().dropItem(player.getLocation(), (ItemStack) s);
				}
			} else if (event.getDeathMessage().contains("fell from a high place")) {
				event.setDeathMessage(C.gray + "[" + nameColor + event.getEntity().getName() + C.gray + "] " + C.yellow
						+ "fell from a high place " + C.gray + "[" + C.dgray + x + ", " + z + " | "
						+ playerWorld.getName() + C.gray + "]");

			} else {
				event.setDeathMessage(
						C.gray + "[" + nameColor + event.getEntity().getName() + C.gray + "] " + C.yellow + "just died "
								+ C.gray + "[" + C.dgray + x + ", " + z + " | " + playerWorld.getName() + C.gray + "]");

			}
		}
	}
}
