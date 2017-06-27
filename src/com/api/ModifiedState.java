package com.api;


class ModifiedState extends BaseState {

    ModifiedState(GitFileManager gitFileManager) {
        super(gitFileManager);
    }

    @Override
    public void onFilesChanged() {

    }

    @Override
    public void onAddedToIndex() {
        // TODO: if there are no files, we won't move anywhere.
        // But here for simplicity we ignore this
        mGitFileManager.setCurrentState(mGitFileManager.getStagedState());
    }

    @Override
    public void onCommitted() {
        System.err.println("Nothing to commit");
    }

}
