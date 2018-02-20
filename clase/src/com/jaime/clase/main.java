package com.jaime.clase;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin activado!");
		
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("gamec").setExecutor(new Gamemode());
		getCommand("flyspeed").setExecutor(new FlySpeed());
		getCommand("flynormal").setExecutor(new FlyNormal());
	}
}
