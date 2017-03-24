package com.blackwings.store.reducer;

import com.blackwings.store.state.GlobalState;
import com.blackwings.store.type.GameStateTypes;

public class GameStateReducer extends Reducer {

    @Override
    public GlobalState reduceData(GlobalState state, Object action) {
        return reduceData(state, (GameStateTypes) action);
    }

    public GlobalState reduceData(GlobalState state, GameStateTypes action) {
        GlobalState newState = state.clone();
        newState.gamePlayState = action;
        return newState;
    }
}