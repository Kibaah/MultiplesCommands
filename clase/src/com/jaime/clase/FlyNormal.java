package com.jaime.clase;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyNormal implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String []args) {
		
		if (sender instanceof Player) {
			
			Player player = (Player) sender;
			
			GameMode gm = player.getGameMode();
			if (gm == GameMode.CREATIVE) {
				player.setFlySpeed(0.1f);
				player.sendMessage(ChatColor.GOLD + "Vuelta a la normalidad?!");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_PLACE, 1, 1);
			} else {
				player.sendMessage(ChatColor.RED + "Necesitas estar en creativo para ejecutar este comando!");
			}
			
		} else {
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "No puedes ejecutar este comando desde la consola!");
		}
		return false;
	}
}
