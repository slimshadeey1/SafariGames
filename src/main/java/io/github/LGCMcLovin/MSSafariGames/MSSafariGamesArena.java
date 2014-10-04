package io.github.LGCMcLovin.MSSafariGames;

import mc.alk.arena.objects.arenas.Arena;
import mc.alk.arena.serializers.Persist;
import mc.alk.arena.util.Log;
import org.bukkit.Bukkit;
import org.bukkit.World;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Allen on 9/27/2014.
 */
public class MSSafariGamesArena extends Arena {

    @Persist
    String worldName; /// What world this Survival Games is in from arenas.yml

    @Persist
    List<String> legends; // possible legendary pokemon that can spawn

    @Persist
    Map<String, Integer> spawnTimes; /// how often a legendary should spawn loaded from MSSafariGames/Arenas.yml

    Map<String, Integer> spawnTimers;/// List of Spawn Timer id's

    Map<String, Integer> waitList;// Player Waiting list IDs

    Map<String, Integer> battleList;// Players Battling List IDs

    List<LegendSpawns> spawns;

    World world; // What world SafariGames is in

    Set<String> lostPlayers = Collections.synchronizedSet(new HashSet<String>());

    @Override
    public void onOpen(){

    }

    @Override
    public void onPrestart(){
       //Save and store players inventory datas;
    }

    @Override
    public void onStart(){
        startSpawnTimers();
        startTourneyTimers();
    }

    @SuppressWarnings("UnnecessaryReturnStatement")

    private void localInit(){
        cancelTimers();
        lostPlayers.clear();
        if (worldName == null){
            Log.err("[MSSafariGames] worldName was null in arena " + getName() +"Please");
        }
    }

    public boolean initLegendSpawns(){
        if (world == null && worldName != null) {
            world = Bukkit.getWorld(worldName);
        }
        if (legends == null || legends.isEmpty() || world == null)
            return false;
        spawns = new CopyOnWriteArrayList<LegendSpawns>();
        for (String legends)
}

    private void cancelTimers() {
    }


    private void startSpawnTimers() {
        if (spawnTimers == null)
            return;
        for (String legend: legends){
            if (spawnTimers.containsKey(legend)){

        }
    }
}}
