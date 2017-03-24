package com.blackwings.store;

import com.blackwings.store.reducer.GameStateReducer;
import com.blackwings.store.state.GlobalState;
import com.blackwings.store.type.GameStateTypes;
import com.glung.redux.Store;

import java.io.PrintStream;

class ReduxApplication {

    public static void main(String[] args) {
        final Store.Creator<GlobalState> storeCreator = new Store.Creator<GlobalState>();
        redux.api.Store<GlobalState> store = storeCreator.create(new GameStateReducer(), new GlobalState());
        PrintStream stream = System.out;
        runDemo(store, stream);
    }

    private static void runDemo(redux.api.Store<GlobalState> store, PrintStream stream) {
        store.subscribe(new Subscriber(store, stream));
        store.dispatch(GameStateTypes.START); // print 1
        store.dispatch(GameStateTypes.STOP); // print 0
        store.dispatch("unknown action"); // print 0
        store.dispatch(GameStateTypes.END); // print 1
    }

}