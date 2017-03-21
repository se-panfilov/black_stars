package com.blackwings.game.space.objects.ships;

import com.blackwings.game.space.objects.PositionData;

public class Cruiser extends Ship {

    final private int SHIP_SIZE = com.blackwings.game.space.objects.ships.ShipSizes.getCruiserSize();
    final private com.blackwings.game.space.objects.ships.ShipClasses SHIP_CLASS = com.blackwings.game.space.objects.ships.ShipClasses.CRUISER;

    private ShipData shipData;

    public Cruiser(String name, com.blackwings.game.space.objects.subsystems.SubSystemsList subSystemsList) {
        shipData = new ShipData(SHIP_SIZE, name, SHIP_CLASS, subSystemsList);

        setObjData(shipData);
    }

    public void setPosition(PositionData position) {
        shipData.setPositionData(position);
    }

    @Override
    public boolean moveTo(Object position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public boolean isCanMove(Object position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public boolean isCanMoveTo(Object position) {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    @Override
    public boolean isSubSystemsCanBeChanged() {
        //TODO (S.Panfilov)
        throw new Error("Method Not ready");
    }

    public int getShipSize() {
        return SHIP_SIZE;
    }

    public com.blackwings.game.space.objects.ships.ShipClasses getShipClass() {
        return SHIP_CLASS;
    }

}
