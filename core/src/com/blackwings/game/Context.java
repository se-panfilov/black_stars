package com.blackwings.game;

import com.blackwings.game.map.Map;

class Context {
    private static GamePlayState state;
    private static World world;
    private static WorldObjects worldObjects;
    private static Map map;

    static GamePlayState getState() {
        return state;
    }

    static World getWorld() {
        return world;
    }

    static void setWorld(World world) {
        Context.world = world;
    }

    static WorldObjects getWorldObjects() {
        return worldObjects;
    }

    static void setWorldObjects(WorldObjects worldObjects) {
        Context.worldObjects = worldObjects;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        Context.map = map;
    }
}
