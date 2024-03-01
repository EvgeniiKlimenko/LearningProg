package com.brokenhead.patterns.observer;

public interface Observer {

    void subscribeTo(Subject subject);
    void unsubscribe(Subject subject);
    void update(int value);
}
