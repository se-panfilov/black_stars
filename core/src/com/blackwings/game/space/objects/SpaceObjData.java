package com.blackwings.game.space.objects;

abstract public class SpaceObjData {
    private int size;
    private com.blackwings.game.space.objects.SpaceObjTypes type;
    private PositionData positionData = new PositionData(0, 0, 0, 0);

    public SpaceObjData(int size, com.blackwings.game.space.objects.SpaceObjTypes type) {
        setSize(size);
        setType(type);
        setPositionData(positionData);
    }

    public PositionData getPositionData() {
        return positionData;
    }

    public void setPositionData(PositionData positionData) {
        this.positionData = positionData;
    }

    public com.blackwings.game.space.objects.SpaceObjTypes getType() {
        return type;
    }

    void setType(com.blackwings.game.space.objects.SpaceObjTypes type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }
}
