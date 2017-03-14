package com.blackwings.game.map;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.units.gameengine.GEUnit;

abstract class Grid {

    protected static Array<GEUnit> getCentres(int rows, int cols, float radius) {
        Array<GEUnit> centres = new Array<GEUnit>();

        for (int i = 0; i < rows; i++) {
            boolean isOddRow = (i % 2 == 0);
            Array<GEUnit> rowCentresArray = fillRow(cols, i, radius, isOddRow);
            centres.addAll(rowCentresArray);
        }

        return centres;
    }

    protected static Array<GEUnit> fillRow(int cols, int curRowNumber, float radius, boolean isOdd) {
        Array<GEUnit> coords = new Array<GEUnit>();

        float x = isOdd ? radius : 0;
        float y = (curRowNumber * radius);

        for (int i = 0; i < cols; i++) {
            x += radius;
            coords.add(new GEUnit(x, y));
        }

        return coords;
    }

}
