package com.elderrealm.main;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.WorldCreator;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import com.elderrealm.main.chatchannels.ChatChannel;
import com.elderrealm.main.chatchannels.DonatorChannel;
import com.elderrealm.main.chatchannels.LocalChannel;
import com.elderrealm.main.chatchannels.MainChannel;
import com.elderrealm.main.chatchannels.StaffChannel;
import com.elderrealm.main.commands.BaseTeleportCommand;
import com.elderrealm.main.commands.EconomyCommand;
import com.elderrealm.main.commands.HelpCommand;
import com.elderrealm.main.commands.MessagePlayerCommand;
import com.elderrealm.main.commands.PingCommand;
import com.elderrealm.main.commands.PlayersOnlineCommand;
import com.elderrealm.main.commands.ProfileCommand;
import com.elderrealm.main.commands.ReplyMessageCommand;
import com.elderrealm.main.commands.RulesCommand;
import com.elderrealm.main.commands.SetBaseCommand;
import com.elderrealm.main.commands.StaffOnlineCommand;
import com.elderrealm.main.commands.WebsiteCommand;
import com.elderrealm.main.commands.administration.Alert;
import com.elderrealm.main.commands.administration.CustomItemsGUI;
import com.elderrealm.main.commands.administration.FlyCommand;
import com.elderrealm.main.commands.administration.GiveBaseTPs;
import com.elderrealm.main.commands.administration.GiveEnderKeys;
import com.elderrealm.main.commands.administration.GiveFireKeys;
import com.elderrealm.main.commands.administration.legenddrop;
import com.elderrealm.main.donators.AnvilCommand;
import com.elderrealm.main.donators.BattleCry;
import com.elderrealm.main.donators.CraftCommand;
import com.elderrealm.main.donators.EnderChestCommand;
import com.elderrealm.main.donators.Mining;
import com.elderrealm.main.donators.MiningRealm;
import com.elderrealm.main.donators.NearCommand;
import com.elderrealm.main.donators.chatsymbols.ChatSymbolsGUI;
import com.elderrealm.main.donators.chatsymbols.ChatSymbolsItemClicked;
import com.elderrealm.main.donators.crates.EnderKeyCrate;
import com.elderrealm.main.donators.crates.FireKeyCrate;
import com.elderrealm.main.economy.BalanceCommand;
import com.elderrealm.main.economy.BuyEggs;
import com.elderrealm.main.economy.SellCake;
import com.elderrealm.main.economy.SellGold;
import com.elderrealm.main.economy.SellHayBale;
import com.elderrealm.main.events.ChangeCraftedDiamondItems;
import com.elderrealm.main.events.ChatManager;
import com.elderrealm.main.events.Connect;
import com.elderrealm.main.events.DeathMessages;
import com.elderrealm.main.events.DenyShieldCraft;
import com.elderrealm.main.events.Disconnect;
import com.elderrealm.main.events.OreBreakCancel;
import com.elderrealm.main.events.StopEggLaying;
import com.elderrealm.main.events.mobs.CreeperDeathDropChance;
import com.elderrealm.main.events.mobs.EndermanDeathDropChance;
import com.elderrealm.main.events.mobs.SkeletonDeathDropChance;
import com.elderrealm.main.events.mobs.ZombieDeathDropChance;
import com.elderrealm.main.events.newplayers.FirstJoin;
import com.elderrealm.main.events.teleports.CratesTeleport;
import com.elderrealm.main.events.teleports.HelpRoomCommand;
import com.elderrealm.main.events.teleports.PvPRealmTeleporter;
import com.elderrealm.main.events.teleports.SpawnCommand;
import com.elderrealm.main.events.teleports.Teleport;
import com.elderrealm.main.events.teleports.TeleportHere;
import com.elderrealm.main.events.teleports.WildernessCommand;
import com.elderrealm.main.items.PvPItemsGUI;
import com.elderrealm.main.kits.DiamondKitGUI;
import com.elderrealm.main.kits.EmeraldKitGUI;
import com.elderrealm.main.kits.GoldKitGUI;
import com.elderrealm.main.kits.IronKitGUI;
import com.elderrealm.main.kits.PlayerKitGUI;
import com.elderrealm.main.pvp.events.BestRemedyCooldown;
import com.elderrealm.main.pvp.events.BetterRemedyCooldown;
import com.elderrealm.main.pvp.events.ChangeBeetrootSoup;
import com.elderrealm.main.pvp.events.ChangeMushroomSoup;
import com.elderrealm.main.pvp.events.ChangeRabbitStew;
import com.elderrealm.main.pvp.events.WorstRemedyCooldown;

import net.milkbowl.vault.economy.Economy;

public class ElderRealmCore extends JavaPlugin implements Listener {

	public static Economy eco = null;

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		registerCommands();
		registerConfig();
		registerEvents();
		
	    	
		String prefix = C.gray + "[" + C.red + "Announcement" + C.gray + "]: ";
		new BukkitRunnable(){
	            Random random = new Random();
	            
	                public void run() {
	                int message = random.nextInt(5-1);
	                    switch(message){
	                   
	                    case 0:
	                    getServer().broadcastMessage(prefix + "§7Join our Discord > §3https://discord.gg/YuDKbww");
	                    break;
	                    
	                    case 1:
	                    getServer().broadcastMessage(prefix + "§7New to Elderrealm? Use §6/Help §7to get started");
	                    break;
	                    
	                    case 2:
	                    getServer().broadcastMessage(prefix + "§7Our Website is §3https://ElderRealm.net");
	                    break;
	                    
	                    case 3:
	                    getServer().broadcastMessage(prefix + "§6Ranks§7, §2Keys§7, §5Base Teleports §7and §aVIP Guilds §7@ §3store.ElderRealm.net");
	                    break;
	                    
	                    case 4:
	                    getServer().broadcastMessage(prefix + "§7Please report all Bugs to Staff! §6/Staff");
	                    break;
	                    
	                    case 5:
	                    getServer().broadcastMessage(prefix + "§7If you have any suggestions, please tell them to staff, your opinions really do matter to us! §6/Staff");
	                    break;
	                    
	                    default:
	                    getServer().broadcastMessage(prefix + "§7Join our Discord > §3https://discord.gg/YuDKbww");
	                    break;
	                }
	            }
	        }.runTaskTimer(this, 20*60*5, 20*60*5);

		getServer().createWorld(new WorldCreator("Mining"));
		getServer().createWorld(new WorldCreator("PvPRealm"));
		logger.info(pdfFile.getName() + "Has been enabled - Version " + pdfFile.getVersion());
		
	}
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getName() + "Has been disabled - Version " + pdfFile.getVersion());
	}

	public void registerCommands() {
		getCommand("customitems").setExecutor(new CustomItemsGUI());
		getCommand("givebasetps").setExecutor(new GiveBaseTPs(this));
		getCommand("alert").setExecutor(new Alert());
		getCommand("legenddrop").setExecutor(new legenddrop());
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("teleport").setExecutor(new Teleport());
		getCommand("teleporthere").setExecutor(new TeleportHere());
		getCommand("elderrealm").setExecutor(new ElderRealm());
		getCommand("giveenderkeys").setExecutor(new GiveEnderKeys());
		getCommand("givefirekeys").setExecutor(new GiveFireKeys());
		getCommand("pvpitems").setExecutor(new PvPItemsGUI());

		getCommand("spawn").setExecutor(new SpawnCommand(this));
		getCommand("HelpRoom").setExecutor(new HelpRoomCommand(this));
		getCommand("wilderness").setExecutor(new WildernessCommand(this));
		getCommand("setbase").setExecutor(new SetBaseCommand(this));
		getCommand("base").setExecutor(new BaseTeleportCommand(this));
		getCommand("mining").setExecutor(new Mining());
		getCommand("crates").setExecutor(new CratesTeleport(this));
		getCommand("economy").setExecutor(new EconomyCommand());
		getCommand("rules").setExecutor(new RulesCommand());

		getCommand("profile").setExecutor(new ProfileCommand(this));
		getCommand("help").setExecutor(new HelpCommand());
		getCommand("website").setExecutor(new WebsiteCommand());
		getCommand("message").setExecutor(new MessagePlayerCommand(this));
		getCommand("reply").setExecutor(new ReplyMessageCommand(this));
		getCommand("staff").setExecutor(new StaffOnlineCommand());
		getCommand("who").setExecutor(new PlayersOnlineCommand());
		getCommand("ping").setExecutor(new PingCommand());

		getCommand("coins").setExecutor(new BalanceCommand());
		getCommand("buyeggs").setExecutor(new BuyEggs(this));
		getCommand("sellcake").setExecutor(new SellCake(this));
		getCommand("sellhaybale").setExecutor(new SellHayBale(this));
		getCommand("sellbooks").setExecutor(new SellHayBale(this));
		getCommand("sellgold").setExecutor(new SellGold());

		getCommand("near").setExecutor(new NearCommand());
		getCommand("anvil").setExecutor(new AnvilCommand());
		getCommand("craft").setExecutor(new CraftCommand());
		getCommand("chatsymbols").setExecutor(new ChatSymbolsGUI());
		getCommand("battlecry").setExecutor(new BattleCry(this));
		getCommand("enderchest").setExecutor(new EnderChestCommand());
		getCommand("near").setExecutor(new NearCommand());

		getCommand("StaffChannel").setExecutor(new StaffChannel(this));
		getCommand("localChannel").setExecutor(new LocalChannel(this));
		getCommand("mainChannel").setExecutor(new MainChannel(this));
		getCommand("donatorchannel").setExecutor(new DonatorChannel(this));

		getCommand("player").setExecutor(new PlayerKitGUI(this));
		getCommand("iron").setExecutor(new IronKitGUI(this));
		getCommand("gold").setExecutor(new GoldKitGUI(this));
		getCommand("diamond").setExecutor(new DiamondKitGUI(this));
		getCommand("emerald").setExecutor(new EmeraldKitGUI(this));

	}

	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(new FirstJoin(this), this);
		pm.registerEvents(new Connect(), this);
		pm.registerEvents(new Disconnect(), this);
		pm.registerEvents(new DeathMessages(this), this);
		pm.registerEvents(new PvPRealmTeleporter(), this);
		pm.registerEvents(new MiningRealm(), this);
		pm.registerEvents(new ChatManager(), this);

		pm.registerEvents(new CreeperDeathDropChance(), this);
		pm.registerEvents(new ZombieDeathDropChance(), this);
		pm.registerEvents(new SkeletonDeathDropChance(), this);
		pm.registerEvents(new EndermanDeathDropChance(), this);

		pm.registerEvents(new OreBreakCancel(), this);
		pm.registerEvents(new DenyShieldCraft(), this);
		pm.registerEvents(new ChangeCraftedDiamondItems(), this);
		pm.registerEvents(new StopEggLaying(), this);

		pm.registerEvents(new ChatSymbolsItemClicked(this), this);
		pm.registerEvents(new ChatChannel(this), this);
		pm.registerEvents(new EnderKeyCrate(), this);
		pm.registerEvents(new FireKeyCrate(), this);

		pm.registerEvents(new WorstRemedyCooldown(), this);
		pm.registerEvents(new BetterRemedyCooldown(), this);
		pm.registerEvents(new BestRemedyCooldown(), this);
		pm.registerEvents(new ChangeBeetrootSoup(), this);
		pm.registerEvents(new ChangeRabbitStew(), this);
		pm.registerEvents(new ChangeMushroomSoup(), this);
		pm.registerEvents(new ChangeMushroomSoup(), this);

	}

	public void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
	}
}
