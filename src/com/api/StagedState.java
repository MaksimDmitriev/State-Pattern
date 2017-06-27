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
    public void onFilesChanged() {
        mGitFileManager.setCurrentState(mModifiedState);
    }

    @Override
    public void onAddedToIndex() {

    }

    @Override
    public void onCommitted() {
        mGitFileManager.setCurrentState(mCommittedState);
    }

}
