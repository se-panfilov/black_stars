package com.blackwings.game.map.grid;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.engine.EngineUnit;

public interface GridItem {
    public Array<EngineUnit> getCoordinatesList();

    public EngineUnit getCenter();

    public Position getPosition();
}
