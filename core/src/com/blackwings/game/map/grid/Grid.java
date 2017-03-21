package com.blackwings.game.map.grid;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.units.engine.EngineUnit;

abstract class Grid {

    protected static Array<EngineUnit> getCentres(int rows, int cols, float radius) {
        Array<EngineUnit> centres = new Array<EngineUnit>();

        for (int i = 0; i < rows; i++) {
            boolean isOddRow = (i % 2 == 0);
            Array<EngineUnit> rowCentresArray = fillRow(cols, i, radius, isOddRow);
            centres.addAll(rowCentresArray);
        }

        return centres;
    }

    protected static Array<EngineUnit> fillRow(int cols, int curRowNumber, float radius, boolean isOdd) {
        Array<EngineUnit> coords = new Array<EngineUnit>();

        float x = isOdd ? radius : 0;
        float y = (curRowNumber * radius);

        for (int i = 0; i < cols; i++) {
            x += radius;
            coords.add(new EngineUnit(x, y));
        }

        return coords;
    }

}
