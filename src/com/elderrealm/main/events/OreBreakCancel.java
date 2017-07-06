package com.elderrealm.main.events;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class OreBreakCancel implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();

		int[] beefAmount = { 0, 1, 2, 3, 4, 5 };

		Random beefAmountRandom = new Random();
		int myIndexBeefAmount = beefAmountRandom.nextInt(beefAmount.length);

		ItemStack drop = new ItemStack(Material.COOKED_BEEF, beefAmount[myIndexBeefAmount]);

		if (player.getLocation().getWorld().getName().equalsIgnoreCase("ElderRealm"))
			if (block.getType().name().contains("_ORE")) {
				event.setCancelled(true);
				block.setTypeId(0);

				World world = player.getWorld();
				world.dropItem(block.getLocation(), drop);
			}
	}
}
