package com.elderrealm.main.events.teleports;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;

public class SpawnCommand implements CommandExecutor {

	private ElderRealmCore plugin;

	public SpawnCommand(ElderRealmCore pl) {
		plugin = pl;

	}

	private HashMap<Player, Integer> cooldownTime;
	private HashMap<Player, BukkitRunnable> cooldownTask;
	{

		cooldownTime = new HashMap<Player, Integer>();
		cooldownTask = new HashMap<Player, BukkitRunnable>();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}
		Player player = (Player) sender;
		if (cooldownTime.containsKey(player)) {

		}

		player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Teleporting to " + C.yellow
				+ "Capital" + C.gray + " in 5 seconds");
		int playerLocationX = player.getLocation().getBlockX();
		int playerLocationY = player.getLocation().getBlockY();
		int playerLocationZ = player.getLocation().getBlockZ();

		cooldownTime.put(player, 5);
		cooldownTask.put(player, new BukkitRunnable() {
			public void run() {
				cooldownTime.put(player, cooldownTime.get(player) - 1);

				if (cooldownTime.get(player) > 0) {
					if (!(player.getLocation().getBlockX() == playerLocationX
							|| player.getLocation().getBlockY() == playerLocationY
							|| player.getLocation().getBlockZ() == playerLocationZ)) {
						player.sendMessage(
								C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Teleport cancelled");
						cancel();
					}
				}

				if (cooldownTime.get(player) == 0) {

					World Skyworld = Bukkit.getWorld("ElderRealm");
					Location loc = new Location(Skyworld, -44, 129, -128);
					loc.setYaw(90);
					player.teleport(loc);

					player.sendMessage(C.gray + "[" + C.red + "Teleport" + C.gray + "] " + C.gray + "Welcome to "
							+ C.yellow + "Capital");

					cooldownTime.remove(player);
					cooldownTask.remove(player);
					cancel();
				}
			}
		});
		cooldownTask.get(player).runTaskTimer(plugin, 20, 20);
		return true;
	}
}
