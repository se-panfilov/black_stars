package com.blackwings.store;

import com.blackwings.store.action.type.IncrementAction;
import com.blackwings.store.reducer.MyReducer;
import com.glung.redux.Store;

import java.io.PrintStream;

//import com.glung.redux.Store;

class ReduxApplication {

    public static void main(String[] args) {
        final Store.Creator<Integer> storeCreator = new Store.Creator<Integer>();
        redux.api.Store<Integer> store = storeCreator.create(new MyReducer(), 0);
        PrintStream stream = System.out;
        runDemo(store, stream);
    }

    private static void runDemo(redux.api.Store<Integer> store, PrintStream stream) {
        store.subscribe(new Subscriber(store, stream));
        store.dispatch(IncrementAction.INCREMENT); // print 1
        store.dispatch(IncrementAction.DECREMENT); // print 0
        store.dispatch("unknown action"); // print 0
        store.dispatch(IncrementAction.INCREMENT); // print 1
    }

}