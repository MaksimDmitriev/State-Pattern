package com.api;

class StagedState extends BaseState {

    private final State mModifiedState;
    private final State mCommittedState;

    StagedState(GitFileManager gitFileManager) {
        super(gitFileManager);
        mModifiedState = new ModifiedState(gitFileManager);
        mCommittedState = new CommittedState(gitFileManager);
    }

    @Override
    public void addFile() {
        mGitFileManager.setCurrentState(mModifiedState);
    }

    @Override
    public void removeFile() {
        mGitFileManager.setCurrentState(mModifiedState);
    }

    @Override
    public void addToIndex() {

    }

    @Override
    public void commit() {
        mGitFileManager.setCurrentState(mCommittedState);
    }

}
