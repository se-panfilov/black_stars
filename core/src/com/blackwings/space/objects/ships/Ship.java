package com.blackwings.space.objects.ships;

import com.blackwings.space.objects.*;
import com.blackwings.space.objects.subsystems.SubSystemsList;

abstract class Ship implements SpaceObj, SubSystemAble, MoveAble {

    private ShipData shipData;
    private SubSystemsList subSystems;
    private SpaceObjTypes spaceObjType = SpaceObjTypes.SHIP;

//    protected Ship(ShipData shipData) {
////        shipData = new SpaceObjData();
//        setObjData(shipData);
//    }

    @Override
    public SubSystemsList getSubsystemsList() {
        return subSystems;
    }

    @Override
    public void setSubSystemsList(SubSystemsList aSubsystems) {
        subSystems = aSubsystems;
    }

    @Override
    public SpaceObjData getObjData() {
        return shipData;
    }

    @Override
    public void setObjData(SpaceObjData data) {
        shipData = (ShipData) data;
    }

    public SpaceObjTypes getType() {
        return spaceObjType;
    }

}
