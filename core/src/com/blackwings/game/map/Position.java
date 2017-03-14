package com.blackwings.game.map;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.units.gameengine.GEUnit;
import com.blackwings.game.map.units.gameengine.GEUnitPosition;
import com.blackwings.game.map.units.ingame.InGameUnit;
import com.blackwings.game.map.units.ingame.InGameUnitPosition;
import com.blackwings.game.map.units.tile.TileUnit;
import com.blackwings.game.map.units.tile.TileUnitPosition;
import com.blackwings.space.objects.SpaceObj;

//TODO (S.Panfilov) perhaps Position too heavy to use it in hexes and other object,
//Will be better to split it with utils class
public class Position implements GEUnitPosition, InGameUnitPosition, TileUnitPosition {

    private GEUnit positionData = new GEUnit();

    public Position(GEUnit geUnit) {
        this.positionData = geUnit;
    }

    public Position(Position position) {
        setPositionData(toGEUnits(position));
    }

    public Position(InGameUnit inGameUnit) {
        setPositionData(toGEUnits(inGameUnit));
    }

    public Position(TileUnit tile) {
        setPositionData(toGEUnits(tile));
    }

    private void setPositionData(GEUnit gameUnits) {
        positionData.setX(gameUnits.getX());
        positionData.setY(gameUnits.getY());
    }

    public Array<SpaceObj> getObjectsInPosition() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    public boolean isObjectInPosition(SpaceObj spaceObj) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    /////////GEUnitPosition////////////
    @Override
    public GEUnit toGEUnits() {
        return toGEUnits(this);
    }

    @Override
    public GEUnit toGEUnits(Position position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public GEUnit toGEUnits(TileUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public GEUnit toGEUnits(InGameUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public GEUnit getGEUnits() {
        return positionData;
    }

    @Override
    public float getGEUnitX() {
        return positionData.getX();
    }

    @Override
    public float getGEUnitY() {
        return positionData.getY();
    }

    @Override
    public void setGEUnitX(float x) {
        positionData.setX(x);
    }

    @Override
    public void setGEUnitY(float y) {
        positionData.setY(y);
    }
    /////////END GEUnitPosition////////////

    /////////InGameUnitPosition////////////
    @Override
    public InGameUnit toInGameUnits() {
        return toInGameUnits(this);
    }

    @Override
    public InGameUnit toInGameUnits(Position position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public InGameUnit toInGameUnits(GEUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public InGameUnit toInGameUnits(TileUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public InGameUnit getInGameUnits() {
        return toInGameUnits(positionData);
    }

    @Override
    public float getInGameUnitX() {
        return toInGameUnits(positionData).getX();
    }

    @Override
    public float getInGameUnitY() {
        return toInGameUnits(positionData).getY();
    }

    @Override
    public void setInGameUnitX(float x) {
        float inGameY = toInGameUnits(positionData).getY();
        InGameUnit inGameUnit = new InGameUnit(x, inGameY);
        GEUnit geUnits = toGEUnits(inGameUnit);

        setPositionData(geUnits);
    }

    @Override
    public void setInGameUnitY(float y) {
        float inGameX = toInGameUnits(positionData).getX();
        InGameUnit inGameUnit = new InGameUnit(inGameX, y);
        GEUnit geUnits = toGEUnits(inGameUnit);

        setPositionData(geUnits);
    }
    /////////END InGameUnitPosition////////////

    /////////TileUnitPosition////////////
    @Override
    public TileUnit toTileUnits() {
        return toTileUnits(this);
    }

    @Override
    public TileUnit toTileUnits(Position position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public TileUnit toTileUnits(GEUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public TileUnit toTileUnits(InGameUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public TileUnit getTileUnits() {
        return toTileUnits(positionData);
    }

    @Override
    public int getTileUnitZ() {
        return toTileUnits(positionData).getZ();
    }

    @Override
    public void setTileUnitZ(int z) {
        TileUnit inGame = toTileUnits(positionData);
        int x = (int) inGame.getX();
        int y = (int) inGame.getY();
        TileUnit tileUnit = new TileUnit(x, y, z);
        GEUnit geUnits = toGEUnits(tileUnit);

        setPositionData(geUnits);
    }

    @Override
    public float getTileUnitX() {
        return toTileUnits(positionData).getX();
    }

    @Override
    public void setTileUnitX(float x) {
        TileUnit inGame = toTileUnits(positionData);
        int _x = (int) x;
        int y = (int) inGame.getY();
        int z = inGame.getZ();
        TileUnit tileUnit = new TileUnit(_x, y, z);
        GEUnit geUnits = toGEUnits(tileUnit);

        setPositionData(geUnits);
    }

    @Override
    public float getTileUnitY() {
        return toTileUnits(positionData).getY();
    }

    @Override
    public void setTileUnitY(float y) {
        TileUnit inGame = toTileUnits(positionData);
        int x = (int) inGame.getX();
        int _y = (int) y;
        int z = inGame.getZ();
        TileUnit tileUnit = new TileUnit(x, _y, z);
        GEUnit geUnits = toGEUnits(tileUnit);

        setPositionData(geUnits);
    }
    /////////END TileUnitPosition////////////
}
