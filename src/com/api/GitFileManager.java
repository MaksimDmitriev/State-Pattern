package com.api;

public class GitFileManager {

    private static GitFileManager sInstance;

    private State mCurrentState;

    public static GitFileManager getInstance() {
        if (sInstance == null) {
            sInstance = new GitFileManager();
        }
        return sInstance;
    }


    private GitFileManager() {
        mCurrentState = new CommittedState(this);
    }

    void setCurrentState(State state) {
        mCurrentState = state;
        System.out.println("new state: " + mCurrentState);
    }

    public void addFile() {
        System.out.println("onFilesChanged");
        mCurrentState.onFilesChanged();
        // TODO: are you modifying mCurrentState on which you just called onFilesChanged()?
    }

    public void editFile() {
        System.out.println("editFile");
        mCurrentState.onFilesChanged();
    }

    public void removeFile() {
        System.out.println("removeFile");
        mCurrentState.onFilesChanged();
    }

    public void addToIndex() {
        System.out.println("addToIndex");
        mCurrentState.onAddedToIndex();
    }

    public void commitFiles() {
        System.out.println("commitFiles");
        mCurrentState.onCommitted();
    }

}
