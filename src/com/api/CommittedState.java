package com.api;

class CommittedState extends BaseState {

    private final State mNextState;

    CommittedState(GitFileManager gitFileManager) {
        super(gitFileManager);
        mNextState = new ModifiedState(gitFileManager);
    }

    @Override
    public void onFilesChanged() {
        mGitFileManager.setCurrentState(mNextState);
    }

    @Override
    public void onAddedToIndex() {
        System.err.println("Nothing to add to index");
    }

    @Override
    public void onCommitted() {
        System.err.println("Nothing to commit");
    }

}
