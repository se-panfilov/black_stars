package com.blackwings.game.map.units.game;

import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.UnitPosition;
import com.blackwings.game.map.units.concept.tile.TileUnit;
import com.blackwings.game.map.units.engine.EngineUnit;

public interface GameUnitPosition extends UnitPosition {
    GameUnit toGameUnits();

    GameUnit toGameUnits(Position position);

    GameUnit toGameUnits(EngineUnit unit);

    GameUnit toGameUnits(TileUnit unit);

    GameUnit getGameUnits();

    float getGameUnitX();

    float getGameUnitY();

    void setGameUnitX(float x);

    void setGameUnitY(float y);
}
