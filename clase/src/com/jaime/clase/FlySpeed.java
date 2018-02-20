package com.jaime.clase;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlySpeed implements CommandExecutor {


	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String []args) {
		
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			GameMode gm = player.getGameMode();
			
			if (gm == GameMode.CREATIVE) {
				
				player.setFlySpeed(0.3f);
				player.sendMessage(ChatColor.GOLD + "Listo, disfruta de tu velocidad!");
				player.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1, 1);
				
			} else {
				player.sendMessage(ChatColor.RED + "Necesitas estar en creativo para ejecutar este comando!");
			}
		} else {
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "No puedes ejecutar ese comando desde la consola!");
		}
		return false;
	}
}