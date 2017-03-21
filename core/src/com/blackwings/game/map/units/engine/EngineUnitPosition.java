package com.blackwings.game.map.units.engine;

import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.UnitPosition;
import com.blackwings.game.map.units.concept.tile.TileUnit;
import com.blackwings.game.map.units.game.GameUnit;

public interface EngineUnitPosition extends UnitPosition {
    EngineUnit toEngineUnits();

    EngineUnit toEngineUnits(Position position);

    EngineUnit toEngineUnits(TileUnit unit);

    EngineUnit toEngineUnits(GameUnit unit);

    EngineUnit getEngineUnits();

    float getEngineUnitX();

    float getEngineUnitY();

    void setEngineUnitX(float x);

    void setEngineUnitY(float y);
}
