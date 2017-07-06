package com.elderrealm.main.commands.administration;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.elderrealm.main.C;
import com.elderrealm.main.ElderRealmCore;
import com.elderrealm.main.utils.Permissions;

public class GiveBaseTPs implements CommandExecutor {

	private ElderRealmCore plugin;

	public GiveBaseTPs(ElderRealmCore pl) {
		plugin = pl;

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof ConsoleCommandSender || sender.hasPermission(Permissions.admin))) {
			sender.sendMessage("§7[§cPermissions§7]: §7This is an §cAdmin §7command");
			return false;
		} else {
		Player target = Bukkit.getPlayer(args[0]);

			plugin.getConfig().set("Player-Data." + target.getUniqueId() + ".BasicInformation.BaseTPs",
					plugin.getConfig().getInt("Player-Data." + target.getUniqueId() + ".BasicInformation.BaseTPs", 0)
							+ Integer.parseInt(args[1]));
		plugin.saveConfig();
		target.sendMessage("");
		target.sendMessage(C.green + "Thank you for supporting the server!\n" + C.yellow + args[1] + C.green
				+ " Base Teleports have been added to your account!");
		target.sendMessage("");
		}

		return true;
	}
}
