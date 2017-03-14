package com.blackwings.game.map.units.ingame;

import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.UnitPosition;
import com.blackwings.game.map.units.gameengine.GEUnit;
import com.blackwings.game.map.units.tile.TileUnit;

public interface InGameUnitPosition extends UnitPosition {
    InGameUnit toInGameUnits();

    InGameUnit toInGameUnits(Position position);

    InGameUnit toInGameUnits(GEUnit unit);

    InGameUnit toInGameUnits(TileUnit unit);

    InGameUnit getInGameUnits();

    float getInGameUnitX();

    float getInGameUnitY();

    void setInGameUnitX(float x);

    void setInGameUnitY(float y);
}
