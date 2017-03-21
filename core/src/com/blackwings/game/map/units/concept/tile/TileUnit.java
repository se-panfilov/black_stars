package com.blackwings.game.map.units.concept.tile;

import com.blackwings.game.map.units.Unit;

public class TileUnit extends Unit {
    protected int z;

    public TileUnit() {
        setX(0);
        setY(0);
        setZ(0);
    }

    public TileUnit(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public TileUnit(int number, int colsCount) {
        setX(getX(number, colsCount));
        setY(getY(number, colsCount));
        setZ(getZ(number, colsCount));
    }

    private int getX(int number, int colsCount) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    private int getY(int number, int colsCount) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    private int getZ(int number, int colsCount) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getNumber() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    public int getCenter() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }
}
