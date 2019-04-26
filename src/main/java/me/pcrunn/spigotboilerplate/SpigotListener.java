package me.pcrunn.spigotboilerplate;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/*
 * As you can see, this class implements (and doesn't extend) Listener.
 * Implementing a class lets you pretty much set the type of this class, so by saying implements Listener we let the plugin
 * know that this class is a listener.
 * A Listener is useful for performing actions when a specific event happens ( example: player joins )
 */

public class SpigotListener implements Listener {

    /*
     * An Annotation is a keyword which adds some properties into a class, constructor, VOID, field, etc.
     * To mention an annotation you have to do @(annotationname).
     * @EventHandler is an annotation exposed by the Bukkkit API (Just like Listener and JavaPlugin), and lets you
     * tell the plugin that this method is an event handler, an event is an action
     *
     * As you can see, this void is named onJoin, but it can be named whatever you want.
     * The important part is the PlayerJoinEvent event. This is a parameter
     * which is used to change how a void reacts depending on the information you give it.
     * The PlayerJoinEvent is an object with other objects inside it that you can access by executing the void
     * event.get(Object name capitalized meaning the first letter is uppercase)()
     */

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        /*
         * Here we set a variable of the type Player and set it to event.getPlayer() which gives us
         * the player who joined. There are a lot of events that you can use, you can have a look at them at
         * When the player joins, we check if they're joining for the first time, if so, message them "Welcome",
         * else, message them "Welcome back".
         * You can test it by removing the playerdata folder on your world.
         * See how to build the project ( https://github.com/pcrunn/spigot-boilerplate/wiki/Building-a-JAR )
         */

        Player player = event.getPlayer();

        player.sendMessage("Welcome " + (player.hasPlayedBefore() ? "back" : ""));
    }

}
