package com.blackwings.store;

import com.blackwings.store.state.GlobalState;

import java.io.PrintStream;

class Subscriber implements redux.api.Store.Subscriber {
    private final redux.api.Store<GlobalState> store;
    private final PrintStream stream;

    Subscriber(redux.api.Store<GlobalState> store, PrintStream stream) {
        this.store = store;
        this.stream = stream;
    }

    @Override
    public void onStateChanged() {
        stream.println(store.getState());
    }
}
