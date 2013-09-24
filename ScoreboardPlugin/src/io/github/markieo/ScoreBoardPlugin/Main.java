package io.github.markieo.ScoreBoardPlugin;

import io.github.markieo.ScoreBoardPlugin.Commands.TeleportExecutor;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
public void onEnable(){
	getCommand("tp").setExecutor(new TeleportExecutor(this));
	getLogger().info("Scoreboard plugin enabled!");
}
public void onDisable(){
	getLogger().info("Scoreboard plugin disabled!");
}
}
