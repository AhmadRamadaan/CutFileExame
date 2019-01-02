package com.exame.cutfile;

public interface UiCallback {

    void onProcessStarted();

    void onProcessWork(int value);

    void onProcessEnd();
}
