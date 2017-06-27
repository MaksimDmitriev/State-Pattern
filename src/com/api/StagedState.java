package com.api;

class StagedState extends BaseState {

    StagedState(GitFileManager gitFileManager) {
        super(gitFileManager);
    }

    @Override
    public void onFilesChanged() {
        mGitFileManager.setCurrentState(mGitFileManager.getModifiedState());
    }

    @Override
    public void onAddedToIndex() {

    }

    @Override
    public void onCommitted() {
        mGitFileManager.setCurrentState(mGitFileManager.getCommittedState());
    }

}
