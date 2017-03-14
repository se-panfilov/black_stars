package com.blackwings.game.map.units.gameengine;

import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.UnitPosition;
import com.blackwings.game.map.units.ingame.InGameUnit;
import com.blackwings.game.map.units.tile.TileUnit;

public interface GEUnitPosition extends UnitPosition {
    GEUnit toGEUnits();

    GEUnit toGEUnits(Position position);

    GEUnit toGEUnits(TileUnit unit);

    GEUnit toGEUnits(InGameUnit unit);

    GEUnit getGEUnits();

    float getGEUnitX();

    float getGEUnitY();

    void setGEUnitX(float x);

    void setGEUnitY(float y);
}
