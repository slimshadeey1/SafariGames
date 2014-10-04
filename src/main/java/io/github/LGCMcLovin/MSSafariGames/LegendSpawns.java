package io.github.LGCMcLovin.MSSafariGames;

import org.bukkit.*;
import org.bukkit.util.Vector;



/**
 * Created by Allen on 10/3/2014.
 */
public class LegendSpawns {
    private Vector arenaMax; //This is the first corner of the available spawn area for the legendary.
    private Vector arenaMin;
    private World world;

    public LegendSpawns(Location min, Location max){ // For your interactive setup with and item in hand
        this.arenaMax = max.toVector();
        this.arenaMin = min.toVector();
        this.world = min.getWorld(); // Because we have location format here, we can set the world by getting it form the location.
    }

    public void setArenaMax(Vector arenaMax) {
        this.arenaMax = arenaMax;
    }

    public void setArenaMin(Vector arenaMin) {
        this.arenaMin = arenaMin;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Vector getArenaMax() {
        return arenaMax;
    }

    public Vector getArenaMin() {
        return arenaMin;
    }

    public World getWorld() {
        return world;
    }

    public Location minToLocation(){
        return this.arenaMin.toLocation(this.world); // Damn sexy
    }

    public Location maxToLocation(){
        return this.arenaMax.toLocation(this.world); // "Also Damn Sexy" -lgc_mclovin 2014
    }

}
