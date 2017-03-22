package com.blackwings.game.map.units.concept;

import com.blackwings.game.map.Position;
import com.blackwings.game.map.units.UnitPosition;
import com.blackwings.game.map.units.concept.tile.TileUnit;
import com.blackwings.game.map.units.engine.EngineUnit;
import com.blackwings.game.map.units.game.GameUnit;

public interface ConceptUnitPosition extends UnitPosition {
    TileUnit toConceptUnits();

    TileUnit toConceptUnits(Position position);

    TileUnit toConceptUnits(EngineUnit unit);

    TileUnit toConceptUnits(GameUnit unit);

    TileUnit getConceptUnits();

    int getConceptUnitZ();

    void setConceptUnitZ(int z);

    float getConceptUnitX();

    float getConceptUnitY();

    void setConceptUnitX(float x);

    void setConceptUnitY(float y);
}
