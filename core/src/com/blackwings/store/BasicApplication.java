package com.blackwings.store;


import com.glung.redux.Store;

public class BasicApplication {
    public static void main(String[] args) {
        final Store.Creator<Integer> creator = new Store.Creator<Integer>();
        final ReduxApplication application = new ReduxApplication(creator, System.out);
        application.runDemo();
    }

}
