package com.blackwings.game.space.objects.ships;

public class ShipSizes {
    private static int CRUISER_SIZE = 100;

    public static int getCruiserSize() {
        return CRUISER_SIZE;
    }

    private static void setCruiserSize(int cruiser) {
        CRUISER_SIZE = cruiser;
    }
}
