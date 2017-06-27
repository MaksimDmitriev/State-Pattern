package com.api;

abstract class BaseState implements State {

    final GitFileManager mGitFileManager;

    BaseState(GitFileManager gitFileManager) {
        mGitFileManager = gitFileManager;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
