package com.api;

public interface State {

    void onFilesChanged();

    void onAddedToIndex();

    void onCommitted();

}
