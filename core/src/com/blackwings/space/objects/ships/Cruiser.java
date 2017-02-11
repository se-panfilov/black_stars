package com.blackwings.space.objects.ships;

import com.blackwings.space.objects.PositionData;
import com.blackwings.space.objects.SpaceObjTypes;
import com.blackwings.space.objects.subsystems.SubSystemsList;

public class Cruiser extends Ship {

    final private int SHIP_SIZE = ShipSizes.getCruiserSize();
    final private SpaceObjTypes SPACE_OBJ_TYPE = SpaceObjTypes.SHIP;
    final private ShipClasses SHIP_CLASS = ShipClasses.CRUISER;

    public Cruiser(String name, PositionData positionData, SubSystemsList subSystemsList) {
        ShipData shipData = new ShipData(SHIP_SIZE, SPACE_OBJ_TYPE, positionData, name, SHIP_CLASS, subSystemsList);

        setObjData(shipData);
    }

    @Override
    public boolean moveTo(Object position) {
        return false;//TODO (S.Panfilov)
    }

    @Override
    public boolean isCanMove(Object position) {
        return false;//TODO (S.Panfilov)
    }

    @Override
    public boolean isCanMoveTo(Object position) {
        return false;//TODO (S.Panfilov)
    }

    @Override
    public boolean isSubSystemsCanBeChanged() {
        return false;//TODO (S.Panfilov)
    }
}
