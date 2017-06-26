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
    }

    public void addFile() {
        mCurrentState.addFile();
        // TODO: are you modifying mCurrentState on which you just called addFile()?
    }

    public void editFile() {
        mCurrentState.addFile();
    }

    public void remove() {

    }
}
