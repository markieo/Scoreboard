package io.github.markieo.ScoreBoardPlugin.Commands;

import io.github.markieo.ScoreBoardPlugin.Main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportExecutor implements CommandExecutor {

	private Main plugin;
	public TeleportExecutor(Main plugin) {
		this.plugin = plugin;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("tp")){ 
			Player playerTeTeleporteren = Bukkit.getServer().getPlayer(args[0]);
			Player playerNaarTeleporteren = Bukkit.getServer().getPlayer(args[1]);
			playerTeTeleporteren.teleport(playerNaarTeleporteren);
			return true;
		} 
		return false; 
	}

}
