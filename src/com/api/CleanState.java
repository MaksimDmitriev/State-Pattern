package com.api;

class CleanState extends BaseState {

    private final State mNextState;

    CleanState(FileManager fileManager) {
        super(fileManager);
        mNextState = new DirtyState(fileManager);
    }

    @Override
    public void addFile() {

    }

    @Override
    public void removeFile() {

    }

    @Override
    public void addToIndex() {

    }

    @Override
    public void commit() {

    }

    @Override
    public void push() {

    }
}
