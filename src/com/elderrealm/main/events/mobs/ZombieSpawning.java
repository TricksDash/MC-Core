package com.elderrealm.main.events.mobs;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class ZombieSpawning implements Listener {

	Material[] zombieSwordGiven = { Material.WOOD_SWORD, Material.STONE_SWORD, Material.IRON_SWORD, Material.GOLD_SWORD,
			Material.DIAMOND_SWORD, Material.AIR };

	Random zombieSwordRandom = new Random();
	int myIndexzombieSwordRandom = zombieSwordRandom.nextInt(zombieSwordGiven.length);

	@EventHandler
	public void onZombieSpawn(CreatureSpawnEvent event) {

		World world = event.getEntity().getLocation().getWorld();
		if (event.getEntityType() == EntityType.ZOMBIE) {
			event.setCancelled(true);

			Location loc = event.getLocation();
			Zombie zomb = (Zombie) loc.getWorld().spawn(loc, Zombie.class);

			zomb.setCustomName("Zombie");
			zomb.setCustomNameVisible(true);

			world.spawn(loc, zomb.getClass());

			// zombie.getEquipment().setItemInMainHand(new
			// ItemStack(zombieSwordGiven[myIndexzombieSwordRandom]));;

		} else
			return;
	}
}
