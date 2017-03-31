package com.blackwings.store.reducer;

import com.blackwings.store.action.Actions;
import com.blackwings.store.store.GlobalStore;

public class GameStateReducer extends Reducer {

    @Override
    public GlobalStore reduceData(GlobalStore state, Object action) {
        return reduceData(state, (Actions) action);
    }

    public GlobalStore reduceData(GlobalStore state, Actions stateType) {
        GlobalStore newState = state.clone();
        newState.gamePlayState = stateType;
        return newState;
    }
}