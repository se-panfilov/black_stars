package com.blackwings.game.map;

import com.blackwings.game.map.grid.HexGrid;

public class Map {

    private HexGrid grid;

    public Map() {
        //TODO (S.Panfilov) CurWorkPoint: fix it!
        grid = new HexGrid(0, 0, 0, 0);//fake
    }

    public HexGrid getGrid() {
        return grid;
    }

    public void setGrid(HexGrid grid) {
        this.grid = grid;
    }
}
