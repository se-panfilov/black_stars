package com.blackwings.space.objects.subsystems;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.utils.Array;
import com.sun.tools.javac.util.ArrayUtils;

public class SubSystemsList {

    private Array<SubSystem> list;

    public SubSystemsList(Array<SubSystem> subSystemsArray) {
        list = new Array<SubSystem>(subSystemsArray);
    }

    public SubSystemsList() {
        list = new Array<SubSystem>();
    }

    public void add(SubSystem subSystem) {
        list.add(subSystem);
    }

    public void remove(SubSystem subSystem) {
        list.removeValue(subSystem, true); //TODO (S.Panfilov) true?
    }

}
