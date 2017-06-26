package com.api;

abstract class BaseState implements State {

    final GitFileManager mGitFileManager;

    BaseState(GitFileManager gitFileManager) {
        mGitFileManager = gitFileManager;
    }

}
