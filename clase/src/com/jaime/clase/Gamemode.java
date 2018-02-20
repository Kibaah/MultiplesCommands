package com.jaime.clase;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String []args) {
		
		if (sender instanceof Player) {
			Player p = (Player) sender;
			
			p.setGameMode(GameMode.CREATIVE);
			p.sendMessage(ChatColor.AQUA + "Tu juego a cambiado!");
			p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, 1, 1);
			
		} else {
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "No puedes ejecutar este comando desde la consola!");
		}
		
		return false;
	}
}
