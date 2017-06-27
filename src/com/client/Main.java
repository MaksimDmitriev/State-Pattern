package com.client;

import com.api.GitFileManager;

class Main {

    public static void main(String[] args) {
        GitFileManager gitFileManager = GitFileManager.getInstance();
        gitFileManager.addFile();
        gitFileManager.commitFiles();
    }
}
