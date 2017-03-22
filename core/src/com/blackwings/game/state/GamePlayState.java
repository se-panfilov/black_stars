package com.blackwings.game.state;

public class GamePlayState {
    private static GamePlayState prevState;
    private static GamePlayState state;

    public static GamePlayState getState() {
        return state;
    }

    public static GamePlayState getPrevState() {
        return prevState;
    }

    public static void setState(GamePlayState state) {
        setPrevState(GamePlayState.state);
        GamePlayState.state = state;
    }

    private static void setPrevState(GamePlayState state) {
        GamePlayState.prevState = state;
    }

    public static boolean isState(GamePlayState aState) {
        return state == aState;
    }

}
