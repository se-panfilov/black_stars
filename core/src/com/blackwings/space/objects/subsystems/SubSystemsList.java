package com.blackwings.space.objects.subsystems;

import com.badlogic.gdx.utils.Array;

public class SubSystemsList {

    private Array<SubSystem> list;

    public SubSystemsList(Array<SubSystem> list) {
        this.list = new Array<SubSystem>(list);
    }

    public SubSystemsList() {
        this.list = new Array<SubSystem>();
    }

    public void add(SubSystem subSystem) {
        list.add(subSystem);
    }

    public void remove(SubSystem subSystem) {
        list.removeValue(subSystem, true); //TODO (S.Panfilov) true?
    }

}
