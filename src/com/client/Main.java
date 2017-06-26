package com.client;

import com.api.GitFileManager;

class Main {

    public static void main(String[] args) {
        GitFileManager gitFileManager = new GitFileManager();
        gitFileManager.addFile("1");
        gitFileManager.addFile("1");
        gitFileManager.addFile("1");
    }
}
