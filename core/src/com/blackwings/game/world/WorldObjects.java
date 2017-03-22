package com.blackwings.game.world;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.space.objects.ships.Ship;

public class WorldObjects {

    private Array<Ship> shipsList;

    public WorldObjects(Array<Ship> shipsList) {
        this.shipsList = shipsList;
    }

    public WorldObjects() {
    }

    public Array<Ship> getShipsList() {
        return shipsList;
    }

    public void setShipsList(Array<Ship> shipsList) {
        this.shipsList = shipsList;
    }

    public void clear() {
        shipsList.clear();
    }
}
