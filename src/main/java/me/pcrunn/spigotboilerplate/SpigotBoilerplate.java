package me.pcrunn.spigotboilerplate;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


/*
 * JavaPlugin is a class exposed by the Bukkit API, every plugin has to have a class that extends JavaPlugin.
 */

public class SpigotBoilerplate extends JavaPlugin {

    /*
     * A void is a series of actions that you tell the program/plugin
     * to do instead of writing them every time and wasting your time.
     * Every programming language has this.
     * public means that it can be used by other classes such as JavaPlugin,
     * and that's the only class that actually uses it.
     * Don't worry about the @Override for now. But you have to use it for onEnable and onDisable
     */

    @Override
    public void onEnable() {
        // Literally whatever you want.


        /*
         * In the next line we register a listenr
         */
        Bukkit.getPluginManager().registerEvents(new SpigotListener(), this);
    }

    @Override
    public void onDisable() {
        // Literally whatever you want.
    }
}
