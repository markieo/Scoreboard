package io.github.markieo.ScoreBoardPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
public void onEnable(){
	getLogger().info("Scoreboard plugin enabled!");
}
public void onDisable(){
	getLogger().info("Scoreboard plugin disabled!");
}
}
