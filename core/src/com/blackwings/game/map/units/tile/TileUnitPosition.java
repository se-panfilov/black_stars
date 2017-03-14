package com.blackwings.game.map.units.tile;

import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.UnitPosition;
import com.blackwings.game.map.units.gameengine.GEUnit;
import com.blackwings.game.map.units.ingame.InGameUnit;

public interface TileUnitPosition extends UnitPosition {
    TileUnit toTileUnits();

    TileUnit toTileUnits(Position position);

    TileUnit toTileUnits(GEUnit unit);

    TileUnit toTileUnits(InGameUnit unit);

    TileUnit getTileUnits();

    int getTileUnitZ();

    void setTileUnitZ(int z);

    float getTileUnitX();

    float getTileUnitY();

    void setTileUnitX(float x);

    void setTileUnitY(float y);
}
