package com.blackwings.game.space.objects.ships;

abstract public class Ship implements com.blackwings.game.space.objects.SpaceObj, com.blackwings.game.space.objects.SubSystemAble, com.blackwings.game.space.objects.MoveAble {

    private ShipData shipData;
    private com.blackwings.game.space.objects.subsystems.SubSystemsList subSystems;
    private com.blackwings.game.space.objects.SpaceObjTypes spaceObjType = com.blackwings.game.space.objects.SpaceObjTypes.SHIP;

//    protected Ship(ShipData shipData) {
////        shipData = new SpaceObjData();
//        setObjData(shipData);
//    }

    @Override
    public com.blackwings.game.space.objects.subsystems.SubSystemsList getSubsystemsList() {
        return subSystems;
    }

    @Override
    public void setSubSystemsList(com.blackwings.game.space.objects.subsystems.SubSystemsList aSubsystems) {
        subSystems = aSubsystems;
    }

    @Override
    public com.blackwings.game.space.objects.SpaceObjData getObjData() {
        return shipData;
    }

    @Override
    public void setObjData(com.blackwings.game.space.objects.SpaceObjData data) {
        shipData = (ShipData) data;
    }

    public com.blackwings.game.space.objects.SpaceObjTypes getType() {
        return spaceObjType;
    }

}
