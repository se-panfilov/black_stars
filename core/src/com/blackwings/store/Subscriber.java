package com.blackwings.store;

import com.blackwings.store.store.GlobalStore;

import java.io.PrintStream;

class Subscriber implements redux.api.Store.Subscriber {
    private final redux.api.Store<GlobalStore> store;
    private final PrintStream stream;

    Subscriber(redux.api.Store<GlobalStore> store, PrintStream stream) {
        this.store = store;
        this.stream = stream;
    }

    @Override
    public void onStateChanged() {
        stream.println(store.getState());
    }
}
