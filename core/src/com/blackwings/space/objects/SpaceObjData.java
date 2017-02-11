package com.blackwings.space.objects;

abstract public class SpaceObjData {
    private int size;
    private SpaceObjTypes type;
    private PositionData positionData;

    public SpaceObjData(int size, SpaceObjTypes type, PositionData positionData) {
        setSize(size);
        setType(type);
        setPositionData(positionData);
    }

    public PositionData getPositionData() {
        return positionData;
    }

    void setPositionData(PositionData positionData) {
        this.positionData = positionData;
    }

    public SpaceObjTypes getType() {
        return type;
    }

    void setType(SpaceObjTypes type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }
}
