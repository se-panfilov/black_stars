package com.blackwings.store.action;

public class Actions {

    public static class SetGameState {
        final String state;

        public SetGameState(String state) {
            this.state = state;
        }
    }
}
