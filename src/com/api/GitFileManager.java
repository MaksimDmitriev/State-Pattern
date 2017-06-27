package com.api;

public class GitFileManager {

    private static GitFileManager sInstance;

    private final State mCommittedState;
    private final State mStagedState;
    private final State mModifiedState;

    private State mCurrentState;

    public static GitFileManager getInstance() {
        if (sInstance == null) {
            sInstance = new GitFileManager();
        }
        return sInstance;
    }


    private GitFileManager() {
        mCommittedState = new CommittedState(this);
        mModifiedState = new ModifiedState(this);
        mStagedState = new StagedState(this);

        mCurrentState = mCommittedState;
    }

    void setCurrentState(State state) {
        mCurrentState = state;
        System.out.println("new state: " + mCurrentState);
    }

    public void addFile() {
        System.out.println("addFile");
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
        mCurrentState.onCommitted();
    }

    State getCommittedState() {
        return mCommittedState;
    }

    State getModifiedState() {
        return mModifiedState;
    }

    State getStagedState() {
        return mStagedState;
    }
}
