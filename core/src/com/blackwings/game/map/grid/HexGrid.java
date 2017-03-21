package com.blackwings.game.map.grid;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.Hex;
import com.blackwings.game.map.units.engine.EngineUnit;

public class HexGrid extends Grid {

    private Array<GridItem> hexes;

    public HexGrid(int rows, int cols, float height, float width) {
        float hexRadius = getHexRadius(rows, cols, height, width);
        hexes = makeHexGrid(rows, cols, hexRadius);
    }

    private static float getHexRadius(int rows, int cols, float height, float width) {
        float maxHorizontalRadius = (width / cols) / 2;
        float maxVerticalRadius = (height / rows) / 2;

        return (maxHorizontalRadius < maxVerticalRadius) ? maxHorizontalRadius : maxVerticalRadius;
    }

    private static Array<GridItem> makeHexGrid(int rows, int cols, float radius) {
        //TODO (S.Panfilov) test it
        Array<EngineUnit> centres = getCentres(rows, cols, radius);
        Array<GridItem> hexes = new Array<GridItem>();

        for (EngineUnit center : centres) {
            Hex hex = new Hex(center);
            hexes.add(hex);
        }

        return hexes;
    }

    private Array<GridItem> getHexGrid() {
        return hexes;
    }
}
