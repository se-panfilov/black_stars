package com.blackwings.game.map;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.units.gameengine.GEUnit;

public interface GridItem {
    public Array<GEUnit> getCoordinatesList();

    public GEUnit getCenter();
}
