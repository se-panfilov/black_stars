package com.blackwings.store.reducer;

import com.blackwings.store.state.GlobalState;

abstract class Reducer implements redux.api.Reducer<GlobalState> {

    private Class expectedType;

    @Override
    public GlobalState reduce(GlobalState state, Object action) {
        if (!isActionTypeCorrect(action)) return state;
        return reduceData(state, action);
    }

    public boolean isActionTypeCorrect(Object action) {
        //TODO (S.Panfilov) checkif it'swotk
        return action.getClass().isInstance(expectedType);
    }

    public void setExpectedActionType(Class aClass) {
        this.expectedType = aClass;
    }

    abstract public GlobalState reduceData(GlobalState state, Object action);
}