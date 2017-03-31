package com.blackwings.store.reducer;

import com.blackwings.store.store.GlobalStore;

abstract class Reducer implements redux.api.Reducer<GlobalStore> {

    private Class expectedType;

    @Override
    public GlobalStore reduce(GlobalStore state, Object action) {
        if (!isActionTypeCorrect(action)) return state;
        return reduceData(state, action);
    }

    boolean isActionTypeCorrect(Object action) {
        //TODO (S.Panfilov) checkif it's wotk
        return action.getClass().isInstance(expectedType);
    }

    public void setExpectedActionType(Class aClass) {
        this.expectedType = aClass;
    }

    abstract public GlobalStore reduceData(GlobalStore state, Object action);
}