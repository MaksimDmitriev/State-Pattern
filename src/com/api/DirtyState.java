package com.api;


class DirtyState extends BaseState {

    private final State mStagedState;

    DirtyState(FileManager fileManager) {
        super(fileManager);
        mStagedState = new StagedState(fileManager);
    }

    @Override
    public void addFile() {

    }

    @Override
    public void removeFile() {
        // TODO: if it's the last file, we will move to CleanState.
        // But here for simplicity we ignore this
    }

    @Override
    public void addToIndex() {
        // TODO: if there are no files, we won't move anywhere.
        // But here for simplicity we ignore this
        mFileManager.setCurrentState(mStagedState);
    }

    @Override
    public void commit() {
    }

    @Override
    public void push() {

    }
}
