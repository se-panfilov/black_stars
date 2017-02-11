package com.blackwings.space.objects.ships;

import com.blackwings.space.objects.PositionData;
import com.blackwings.space.objects.SpaceObjData;
import com.blackwings.space.objects.SpaceObjTypes;
import com.blackwings.space.objects.subsystems.SubSystemsList;

abstract public class ShipData extends SpaceObjData {
    private String name;
    private ShipClasses shipClass;
    private SubSystemsList subSystemsList;

    public ShipData(int size, SpaceObjTypes type, PositionData positionData, String name, ShipClasses shipClass, SubSystemsList subSystemsList) {
        super(size, type, positionData);
        setName(name);
        setShipClass(shipClass);
        setSubSystemsList(subSystemsList);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public ShipClasses getShipClass() {
        return shipClass;
    }

    private void setShipClass(ShipClasses shipClass) {
        this.shipClass = shipClass;
    }

    public SubSystemsList getSubSystemsList() {
        return subSystemsList;
    }

    private void setSubSystemsList(SubSystemsList subSystemsList) {
        this.subSystemsList = subSystemsList;
    }
}
