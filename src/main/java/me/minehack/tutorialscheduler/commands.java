package me.minehack.tutorialscheduler;

import me.minehack.tutorialscheduler.schedulers.AlertPlayerTask;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {

    TutorialScheduler mainclass = TutorialScheduler.getInstance();


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            AlertPlayerTask taskclass = new AlertPlayerTask();


            player.sendMessage("ta 5 sanie digar task shoma start khahad shod.");
            Bukkit.getScheduler().scheduleSyncDelayedTask(mainclass, new Runnable() {
                @Override
                public void run() {
                    taskclass.startAlerting(player);

                }
            }, 20 * 5);

        }


        return false;
    }
}
