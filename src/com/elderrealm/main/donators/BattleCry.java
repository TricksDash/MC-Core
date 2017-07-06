package com.elderrealm.main.donators;

import java.util.HashMap;

import org.bukkit.Effect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.Permissions;
import com.elderrealm.main.utils.TimeUtil;

public class BattleCry implements CommandExecutor {
	
	private ElderRealmCore plugin;

	public BattleCry(ElderRealmCore pl) {
		plugin = pl;

	}

	public HashMap<String, Long> cooldowns = new HashMap<String, Long>();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You are not a player");
			return false;
		}

		Player player = (Player) sender;

		if (!(player.hasPermission(Permissions.diamond) || player.hasPermission(Permissions.emerald)
				|| player.hasPermission(Permissions.staff))) {
			player.sendMessage(
					"§7[§cPermissions§7]: §7This is a §3Diamond+ §7command \nPurchase at §cstore.elderrealm.net");
			return false;
		}

		int cooldownTime = 3600;

		if (cooldowns.containsKey(sender.getName())) {
			long secondsLeft = ((cooldowns.get(sender.getName()) / 1000) + cooldownTime)
					- (System.currentTimeMillis() / 1000);
			if(secondsLeft == 0) {
				cooldowns.remove(player.getName());
			}
			
			if (secondsLeft > 0) {
				String timeString = TimeUtil.formatIntoHHMMSS(secondsLeft);

				player.sendMessage(C.gray + "[" + C.red + "BattleCry" + C.gray + "] " + C.gray
						+ "Currently on cooldown " + C.dgray + "[" + timeString + "]");
				return true;
			}
		}
		
		cooldowns.put(sender.getName(), System.currentTimeMillis());
		player.sendMessage(C.gray + "[" + C.red + "BattleCry" + C.gray + "] " + C.gray + "Has been activated");
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3600, 1));
		player.getWorld().playEffect(player.getLocation(), Effect.BLAZE_SHOOT, 1);
		plugin.getConfig().set("Player-Data." + player.getUniqueId() + ".BattleCry", "Active");
		plugin.saveConfig();
		
		return true;
	}
}
