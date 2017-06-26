package com.api;

import com.sun.istack.internal.NotNull;

public class FileManager {

    private State mCurrentState;

    public FileManager() {
        mCurrentState = new CleanState(this);
    }

    void setCurrentState(State state) {
        mCurrentState = state;
    }

    public State getCurrentState() {
        return mCurrentState;
    }


    public void add(@NotNull String fileName) {

    }

    public void edit(@NotNull String fileName) {

    }

    public void remove(@NotNull String fileName) {

    }
}
