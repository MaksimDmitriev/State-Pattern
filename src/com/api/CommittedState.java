package com.api;

class CommittedState extends BaseState {

    CommittedState(GitFileManager gitFileManager) {
        super(gitFileManager);
    }

    @Override
    public void onFilesChanged() {
        mGitFileManager.setCurrentState(mGitFileManager.getModifiedState());
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
