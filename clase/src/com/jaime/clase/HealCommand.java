package com.jaime.clase;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String []args) {
		
		if (sender instanceof Player) {
		Player player = (Player) sender;
		if (player.hasPermission("curar")) {
		
		player.setHealth(20);
		player.sendMessage(ChatColor.GREEN + "Curado!");
		player.playSound(player.getPlayer().getLocation(), Sound.ENTITY_VILLAGER_YES, 1, 1);
		player.setFoodLevel(20);
		
			} else {	
		player.sendMessage(ChatColor.RED + "No tienes permisos para ejecutar este comando!");
		player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
			}
		} else {
			
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "No puedes ejecutar esete comando desde la consola");	
			
		}
		return false;
	}
}


