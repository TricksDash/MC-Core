package com.elderrealm.main.utils;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.elderrealm.main.C;

public class PvPItems {
	
	public static ItemStack worstRemedy() {
		ItemStack worstRemedy = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta worstRemedyMeta = worstRemedy.getItemMeta();
		worstRemedyMeta.setDisplayName(C.gray + "Worst Health Remedy");
		worstRemedyMeta.setLore(Arrays.asList(C.gray + C.underline + "PvP Item: ", "", C.red + "Worst Health Remedy",
				C.gray + "Heals between", C.red + "❤" + C.gray + " and " + C.red + "❤❤"));
		worstRemedy.setItemMeta(worstRemedyMeta);

		return worstRemedy;
	}

	public static ItemStack basicRemedy(){
		ItemStack basicBandage = new ItemStack(Material.BEETROOT_SOUP);
		ItemMeta basicBandageMeta = basicBandage.getItemMeta();
		basicBandageMeta.setDisplayName(C.blue + "Better Health Remedy");
		basicBandageMeta.setLore(Arrays.asList(C.gray + C.underline + "PvP Item: ", "", C.red + "Better Health Remedy",
				C.gray + "Heals between", C.red + "❤❤❤" + C.gray + " and " + C.red + "❤❤❤❤"));
		basicBandage.setItemMeta(basicBandageMeta);

		return basicBandage;
	}

	public static ItemStack bestRemedy() {
		ItemStack bestRemedy = new ItemStack(Material.RABBIT_STEW);
		ItemMeta bestRemedyMeta = bestRemedy.getItemMeta();
		bestRemedyMeta.setDisplayName(C.gold+ "Best Health Remedy");
		bestRemedyMeta.setLore(Arrays.asList(C.gray + C.underline + "PvP Item: ", "", C.red + "Best Health Remedy",
				C.gray + "Heals between", C.red + "❤❤❤❤❤" + C.gray + " and " + C.red + "❤❤❤❤❤❤"));
		bestRemedy.setItemMeta(bestRemedyMeta);

		return bestRemedy;
	}

}
