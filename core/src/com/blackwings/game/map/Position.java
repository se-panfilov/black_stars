package com.blackwings.game.map;

import com.badlogic.gdx.utils.Array;
import com.blackwings.game.map.units.concept.ConceptUnitPosition;
import com.blackwings.game.map.units.concept.tile.TileUnit;
import com.blackwings.game.map.units.engine.EngineUnit;
import com.blackwings.game.map.units.engine.EngineUnitPosition;
import com.blackwings.game.map.units.game.GameUnit;
import com.blackwings.game.map.units.game.GameUnitPosition;
import com.blackwings.game.space.objects.SpaceObj;

//TODO (S.Panfilov) perhaps Position too heavy to use it in hexes and other object,
//Will be better to split it with utils class
public class Position implements EngineUnitPosition, GameUnitPosition, ConceptUnitPosition {

    private EngineUnit positionData = new EngineUnit();

    public Position(EngineUnit engineUnit) {
        this.positionData = engineUnit;
    }

    public Position(Position position) {
        setPositionData(toEngineUnits(position));
    }

    public Position(GameUnit gameUnit) {
        setPositionData(toEngineUnits(gameUnit));
    }

    public Position(TileUnit tile) {
        setPositionData(toEngineUnits(tile));
    }

    private void setPositionData(EngineUnit gameUnits) {
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

    /////////EngineUnitPosition////////////
    @Override
    public EngineUnit toEngineUnits() {
        return toEngineUnits(this);
    }

    @Override
    public EngineUnit toEngineUnits(Position position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public EngineUnit toEngineUnits(TileUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public EngineUnit toEngineUnits(GameUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public EngineUnit getEngineUnits() {
        return positionData;
    }

    @Override
    public float getEngineUnitX() {
        return positionData.getX();
    }

    @Override
    public float getEngineUnitY() {
        return positionData.getY();
    }

    @Override
    public void setEngineUnitX(float x) {
        positionData.setX(x);
    }

    @Override
    public void setEngineUnitY(float y) {
        positionData.setY(y);
    }
    /////////END EngineUnitPosition////////////

    /////////GameUnitPosition////////////
    @Override
    public GameUnit toGameUnits() {
        return toGameUnits(this);
    }

    @Override
    public GameUnit toGameUnits(Position position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public GameUnit toGameUnits(EngineUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public GameUnit toGameUnits(TileUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public GameUnit getGameUnits() {
        return toGameUnits(positionData);
    }

    @Override
    public float getGameUnitX() {
        return toGameUnits(positionData).getX();
    }

    @Override
    public float getGameUnitY() {
        return toGameUnits(positionData).getY();
    }

    @Override
    public void setGameUnitX(float x) {
        float inGameY = toGameUnits(positionData).getY();
        GameUnit gameUnit = new GameUnit(x, inGameY);
        EngineUnit engineUnits = toEngineUnits(gameUnit);

        setPositionData(engineUnits);
    }

    @Override
    public void setGameUnitY(float y) {
        float inGameX = toGameUnits(positionData).getX();
        GameUnit gameUnit = new GameUnit(inGameX, y);
        EngineUnit engineUnits = toEngineUnits(gameUnit);

        setPositionData(engineUnits);
    }
    /////////END GameUnitPosition////////////

    /////////ConceptUnitPosition////////////
    @Override
    public TileUnit toConceptUnits() {
        return toConceptUnits(this);
    }

    @Override
    public TileUnit toConceptUnits(Position position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public TileUnit toConceptUnits(EngineUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public TileUnit toConceptUnits(GameUnit unit) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public TileUnit getConceptUnits() {
        return toConceptUnits(positionData);
    }

    @Override
    public int getConceptUnitZ() {
        return toConceptUnits(positionData).getZ();
    }

    @Override
    public void setConceptUnitZ(int z) {
        TileUnit inGame = toConceptUnits(positionData);
        int x = (int) inGame.getX();
        int y = (int) inGame.getY();
        TileUnit tileUnit = new TileUnit(x, y, z);
        EngineUnit engineUnits = toEngineUnits(tileUnit);

        setPositionData(engineUnits);
    }

    @Override
    public float getConceptUnitX() {
        return toConceptUnits(positionData).getX();
    }

    @Override
    public void setConceptUnitX(float x) {
        TileUnit inGame = toConceptUnits(positionData);
        int _x = (int) x;
        int y = (int) inGame.getY();
        int z = inGame.getZ();
        TileUnit tileUnit = new TileUnit(_x, y, z);
        EngineUnit engineUnits = toEngineUnits(tileUnit);

        setPositionData(engineUnits);
    }

    @Override
    public float getConceptUnitY() {
        return toConceptUnits(positionData).getY();
    }

    @Override
    public void setConceptUnitY(float y) {
        TileUnit inGame = toConceptUnits(positionData);
        int x = (int) inGame.getX();
        int _y = (int) y;
        int z = inGame.getZ();
        TileUnit tileUnit = new TileUnit(x, _y, z);
        EngineUnit engineUnits = toEngineUnits(tileUnit);

        setPositionData(engineUnits);
    }
    /////////END ConceptUnitPosition////////////
}
