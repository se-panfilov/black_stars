package com.blackwings.game.space.objects.ships;

import com.blackwings.game.space.objects.SpaceObjTypes;

public class ShipData extends com.blackwings.game.space.objects.SpaceObjData {
    private String name;
    private ShipClasses shipClass;
    private com.blackwings.game.space.objects.subsystems.SubSystemsList subSystemsList;

    public ShipData(int size, String name, ShipClasses shipClass, com.blackwings.game.space.objects.subsystems.SubSystemsList subSystemsList) {
        super(size, SpaceObjTypes.SHIP);
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

    public com.blackwings.game.space.objects.subsystems.SubSystemsList getSubSystemsList() {
        return subSystemsList;
    }

    private void setSubSystemsList(com.blackwings.game.space.objects.subsystems.SubSystemsList subSystemsList) {
        this.subSystemsList = subSystemsList;
    }
}
