package com.elderrealm.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.Permissions;

import net.milkbowl.vault.economy.Economy;

public class ProfileCommand implements CommandExecutor {

	private ElderRealmCore plugin;

	public ProfileCommand(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		if (args.length == 0) {
			Economy eco = ElderRealmCore.eco;
			String rank;

			if (player.hasPermission(Permissions.admin)) {
				rank = "§cAdmin";
			} else if (player.hasPermission(Permissions.srMod)) {
				rank = "§2Sr.Moderator";
			} else if (player.hasPermission(Permissions.moderator)) {
				rank = "§dModerator";
			} else if (player.hasPermission(Permissions.assistant)) {
				rank = "§9Assistant";
			} else if (player.hasPermission(Permissions.emerald)) {
				rank = "§aEmerald";
			} else if (player.hasPermission(Permissions.diamond)) {
				rank = "§3Diamond";
			} else if (player.hasPermission(Permissions.gold)) {
				rank = "§6Gold";
			} else if (player.hasPermission(Permissions.iron)) {
				rank = "§fIron";
			} else {
				rank = "§8Player";
			}
			
			player.sendMessage("");
			player.sendMessage(C.gray + "[" + C.red + "Profile" + C.gray + "]");
			player.sendMessage(C.gray + "Username: " + C.gold + player.getName());
			player.sendMessage(C.gray + "Rank: " + C.gold + rank);
			player.sendMessage(C.gray + "Date Joined: " + C.gold
					+ plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".BasicInformation.DateJoined"));
			player.sendMessage(C.gray + "Base Teleports: " + C.gold
					+ plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".BasicInformation.BaseTPs"));
			player.sendMessage(C.gray + "Cakes Sold: " + C.gold
					+ plugin.getConfig().get("Player-Data." + player.getUniqueId() + ".BasicInformation.CakesSold"));
			player.sendMessage(C.gray + "Eggs Purchased: " + C.gold + plugin.getConfig()
					.get("Player-Data." + player.getUniqueId() + ".BasicInformation.EggsPurchased"));
			player.sendMessage(C.gray + "Coins: " + C.gold + eco.getBalance(player));
			player.sendMessage("");

		} else if (args.length == 1) {

			Player target = Bukkit.getPlayer(args[0]);

			if (target == null || target.isOnline() == false) {
				player.sendMessage(C.red + "That player isn't online.");
				return false;
			} else {

				Economy eco = ElderRealmCore.eco;
				String rank;
				if (target.hasPermission(Permissions.admin)) {
					rank = "§cAdmin";
				} else if (target.hasPermission(Permissions.srMod)) {
					rank = "§2Sr.Moderator";
				} else if (target.hasPermission(Permissions.moderator)) {
					rank = "§dModerator";
				} else if (target.hasPermission(Permissions.assistant)) {
					rank = "§9Assistant";
				} else if (target.hasPermission(Permissions.emerald)) {
					rank = "§aEmerald";
				} else if (target.hasPermission(Permissions.diamond)) {
					rank = "§3Diamond";
				} else if (target.hasPermission(Permissions.gold)) {
					rank = "§3Diamond";
				} else if (target.hasPermission(Permissions.iron)) {
					rank = "§6Gold";
				} else {
					rank = "§8Player";
				}

				player.sendMessage("");
				player.sendMessage(C.gray + "[" + C.red + "Profile" + C.gray + "]");
				player.sendMessage(C.gray + "Username: " + C.gold + target.getName());
				player.sendMessage(C.gray + "Rank: " + C.gold + rank);
				player.sendMessage(C.gray + "Date Joined: " + C.gold + plugin.getConfig()
						.get("Player-Data." + target.getUniqueId() + ".BasicInformation.DateJoined"));
				player.sendMessage(C.gray + "Base Teleports: " + C.gold
						+ plugin.getConfig().get("Player-Data." + target.getUniqueId() + ".BasicInformation.BaseTPs"));
				player.sendMessage(C.gray + "Cakes Sold: " + C.gold + plugin.getConfig()
						.get("Player-Data." + target.getUniqueId() + ".BasicInformation.CakesSold"));
				player.sendMessage(C.gray + "Eggs Purchased: " + C.gold + plugin.getConfig()
						.get("Player-Data." + target.getUniqueId() + ".BasicInformation.EggsPurchased"));
				player.sendMessage(C.gray + "Coins: " + C.gold + eco.getBalance(target));
				player.sendMessage("");
			}
		} else if (args.length <= 2) {
			player.sendMessage("Usage: /Profile || (Name)");
		}
		return true;
	}
}
