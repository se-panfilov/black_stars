package com.blackwings.space.objects.ships;

import com.blackwings.space.objects.PositionData;
import com.blackwings.space.objects.subsystems.SubSystemsList;

public class Cruiser extends Ship {

    final private int SHIP_SIZE = ShipSizes.getCruiserSize();
    final private ShipClasses SHIP_CLASS = ShipClasses.CRUISER;

    private ShipData shipData;

    public Cruiser(String name, SubSystemsList subSystemsList) {
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

    public ShipClasses getShipClass() {
        return SHIP_CLASS;
    }

}
