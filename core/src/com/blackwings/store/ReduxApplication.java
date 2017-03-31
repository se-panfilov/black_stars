package com.blackwings.store;

import com.blackwings.store.action.Actions;
import com.blackwings.store.reducer.GameStateReducer;
import com.blackwings.store.store.GlobalStore;
import com.glung.redux.Store;

import java.io.PrintStream;

class ReduxApplication {

    public static void main(String[] args) {
        final Store.Creator<GlobalStore> storeCreator = new Store.Creator<GlobalStore>();
        redux.api.Store<GlobalStore> store = storeCreator.create(new GameStateReducer(), new GlobalStore());
        PrintStream stream = System.out;
        //runDemo(store, stream);
        store.subscribe(new Subscriber(store, stream));
        //TODO (S.Panfilov) Do I really have got to create new class? How about method call?
        store.dispatch(new Actions.SetGameState("asdasd")); // print 1
        //TODO (S.Panfilov)cur work point, we need to fix reduers
    }

//    private static void runDemo(redux.api.Store<GlobalStore> store, PrintStream stream) {


//        store.dispatch(Actions.STOP); // print 0
//        store.dispatch("unknown action"); // print 0
//        store.dispatch(Actions.END); // print 1
//    }

}