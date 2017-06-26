package com.api;

class CommittedState extends BaseState {

    private final State mNextState;

    CommittedState(GitFileManager gitFileManager) {
        super(gitFileManager);
        mNextState = new ModifiedState(gitFileManager);
    }

    @Override
    public void addFile() {
        mGitFileManager.setCurrentState(mNextState);
    }

    @Override
    public void removeFile() {
        mGitFileManager.setCurrentState(mNextState);
    }

    @Override
    public void addToIndex() {

    }

    @Override
    public void commit() {

    }

}
