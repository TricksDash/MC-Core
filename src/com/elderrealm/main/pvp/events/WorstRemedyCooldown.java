package com.elderrealm.main.pvp.events;

import java.util.HashMap;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.elderrealm.main.C;
import com.elderrealm.main.utils.PvPItems;
import com.elderrealm.main.utils.TimeUtil;

public class WorstRemedyCooldown implements Listener {

	public HashMap<String, Long> cooldowns = new HashMap<String, Long>();

	@EventHandler
	public void onBandageUse(PlayerInteractEvent event) {
		HumanEntity player = event.getPlayer();

		if (player.getInventory().getItemInMainHand().equals(PvPItems.worstRemedy())) {{
				int[] percentage = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4 };

				event.setCancelled(true);
				Random percentageRandom = new Random();
				int myIndexpercentage = percentageRandom.nextInt(percentage.length);

				int cooldownTime = 10;

				if (cooldowns.containsKey(player.getName())) {
					long secondsLeft = ((cooldowns.get(player.getName()) / 1000) + cooldownTime)
							- (System.currentTimeMillis() / 1000);
					if (secondsLeft == 0) {
						cooldowns.remove(player.getName());
					}

					if (secondsLeft > 0) {
						String timeString = TimeUtil.formatIntoHHMMSS(secondsLeft);

						player.sendMessage(
								C.gray + "Worst Remedy is currently on cooldown " + C.dgray + "[" + timeString + "]");
						return;
					}
				}

				if (player.getHealth() == 20) {
					player.sendMessage(C.gray + "You are not bleeding!");
					return;
				}

				cooldowns.put(player.getName(), System.currentTimeMillis());
				int amount = player.getInventory().getItemInMainHand().getAmount();
				if (amount > 1) {
					player.getInventory().getItemInMainHand().setAmount(amount - 1);
				} else {
					player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));
				}

				player.setHealth(player.getHealth() + percentage[myIndexpercentage]);
				player.sendMessage(C.gray + "You bandaged yourself and the bleeding barely stopped");
			}
		}
	}
}