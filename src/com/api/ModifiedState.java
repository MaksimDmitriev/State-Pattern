package com.api;


class ModifiedState extends BaseState {

    private final State mStagedState;

    ModifiedState(GitFileManager gitFileManager) {
        super(gitFileManager);
        mStagedState = new StagedState(gitFileManager);
    }

    @Override
    public void onFilesChanged() {

    }

    @Override
    public void onAddedToIndex() {
        // TODO: if there are no files, we won't move anywhere.
        // But here for simplicity we ignore this
        mGitFileManager.setCurrentState(mStagedState);
    }

    @Override
    public void onCommitted() {
        System.err.println("Nothing to commit");
    }

}
