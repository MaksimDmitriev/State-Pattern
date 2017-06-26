package com.api;


class ModifiedState extends BaseState {

    private final State mStagedState;

    ModifiedState(GitFileManager gitFileManager) {
        super(gitFileManager);
        mStagedState = new StagedState(gitFileManager);
    }

    @Override
    public void addFile() {

    }

    @Override
    public void removeFile() {
        // TODO: if it's the last file, we will move to CommittedState.
        // But here for simplicity we ignore this
    }

    @Override
    public void addToIndex() {
        // TODO: if there are no files, we won't move anywhere.
        // But here for simplicity we ignore this
        mGitFileManager.setCurrentState(mStagedState);
    }

    @Override
    public void commit() {
    }

}
