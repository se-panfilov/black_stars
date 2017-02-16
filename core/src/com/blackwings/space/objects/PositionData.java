package com.blackwings.space.objects;

import java.util.HashMap;

public class PositionData {
    private int orientation;
    private HashMap<String, Integer> coordinates;

    public PositionData(int x, int y, int z, int orientation) {
        coordinates = new HashMap<String, Integer>();
        coordinates.put("x", x);
        coordinates.put("y", y);
        coordinates.put("z", z);

        setOrientation(orientation);
    }

    public HashMap<String, Integer> getCoordinates() {
        return coordinates;
    }

    private void setCoordinates(HashMap<String, Integer> aCoordinates) {
        coordinates = aCoordinates;
    }

    public int getOrientation() {
        return orientation;
    }

    private void setOrientation(int orientation) {
        this.orientation = orientation;
    }
}
