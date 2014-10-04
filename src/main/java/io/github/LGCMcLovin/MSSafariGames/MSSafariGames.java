package io.github.LGCMcLovin.MSSafariGames;

import com.pixelmonmod.pixelmon.storage.ServerStorage;
import mc.alk.arena.BattleArena;
import mc.alk.arena.util.Log;
import mc.battleplugins.api.BattlePluginsAPI;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
/**
 * Created by Allen on 9/26/2014.
 */
public class MSSafariGames extends JavaPlugin {
        static MSSafariGames plugin;
    @Override
    public void onEnable(){
        plugin = this;
        /// Registers MSSafariGames plugin, the command will be "mssg"
        BattleArena.registerCompetition(this, "MSSafariGames", "mssg", MSSafariGamesArena.class);
        /// Load the Config
        loadConfig();
        Log.info("[" + getName() + "] v" + getDescription().getVersion() + " enabled!");
    }

    @Override
    public void onDisable(){
        Log.info("[" + getName()+ "] v" + getDescription().getVersion()+ " stopping!");
    }

    @Override
    public void reloadConfig(){
        super.reloadConfig();
        loadConfig();
    }

    public static MSSafariGames getSelf() {
        return plugin;
    }

    private void loadConfig() {
        saveDefaultConfig();

        FileConfiguration config = this.getConfig();

        ///add defaults
    }
}

