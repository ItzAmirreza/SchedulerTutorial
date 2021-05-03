package me.minehack.tutorialscheduler.schedulers;

import me.minehack.tutorialscheduler.TutorialScheduler;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.List;

public class AlertPlayerTask {

    TutorialScheduler mainclass = TutorialScheduler.getInstance();


    public void startAlerting(Player player) {

        Bukkit.getScheduler().scheduleSyncRepeatingTask(mainclass, new Runnable() {
            @Override
            public void run() {

                Location playerlocation = player.getLocation();

                List<Entity> listentity = player.getNearbyEntities(20, 20, 20);
                for (Entity entity : listentity) {

                    if (!(entity instanceof LivingEntity)) {
                        listentity.remove(entity);
                    }
                }

                for (Entity entity : listentity) {
                    if (entity.getType() == EntityType.SHEEP) {

                        player.sendMessage("BABAEEEE KENARE SHOMASTT!!!!!!! be soye babayiiiii");
                        player.playSound(playerlocation, Sound.BLOCK_NOTE_BLOCK_BELL, 0.5f, 0.5f);
                        break;
                    }
                }


            }
        }, 0,20);


    }




}
