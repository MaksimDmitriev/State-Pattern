package com.api;

abstract class BaseState implements State {

    final FileManager mFileManager;

    BaseState(FileManager fileManager) {
        mFileManager = fileManager;
    }

}
