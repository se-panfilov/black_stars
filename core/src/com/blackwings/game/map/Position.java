package com.blackwings.game.map;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.units.gameengine.GEUnit;
import com.blackwings.game.map.units.gameengine.GEUnitPosition;
import com.blackwings.game.map.units.ingame.InGameUnit;
import com.blackwings.game.map.units.ingame.InGameUnitPosition;
import com.blackwings.game.map.units.tile.TileUnit;
import com.blackwings.game.map.units.tile.TileUnitPosition;
import com.blackwings.space.objects.SpaceObj;

public class Position implements GEUnitPosition, InGameUnitPosition, TileUnitPosition {

    private GEUnit positionData = new GEUnit();

    public Position(GEUnit geUnit) {
        this.positionData = geUnit;
    }

    public Position(Position position) {
        GEUnit gameUnits = toGEUnits(position);
        positionData.setX(gameUnits.getX());
        positionData.setY(gameUnits.getY());
    }

    public Position(InGameUnit inGameUnit) {
        GEUnit gameUnits = toGEUnits(inGameUnit);
        positionData.setX(gameUnits.getX());
        positionData.setY(gameUnits.getY());
    }

    public Position(TileUnit tile) {
        GEUnit gameUnits = toGEUnits(tile);
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
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public float getInGameUnitX() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public float getInGameUnitY() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public void setInGameUnitX(float x) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public void setInGameUnitY(float y) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
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
    public int getPositionZ() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public void setPositionZ(int z) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public TileUnit getTileUnits() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public float getTileUnitX() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public float getTileUnitY() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public void setTileUnitX(float x) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public void setTileUnitY(float y) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }
    /////////END TileUnitPosition////////////
}
