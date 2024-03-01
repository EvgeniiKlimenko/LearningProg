package com.brokenhead.patterns.observer;

public interface Subject {

    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers();
}
