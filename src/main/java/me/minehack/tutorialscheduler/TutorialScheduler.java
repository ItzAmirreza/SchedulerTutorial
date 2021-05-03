package me.minehack.tutorialscheduler;

import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialScheduler extends JavaPlugin {


    private static TutorialScheduler plugin;


    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        getServer().getPluginCommand("startalert").setExecutor(new commands());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public static TutorialScheduler getInstance() {
        return plugin;
    }
}
