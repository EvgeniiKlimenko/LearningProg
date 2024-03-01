package com.brokenhead.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of observable class.
 */
public class PublishingHouse implements Subject {

    private int importantValue;
    private List<Observer> subscribers;

    public PublishingHouse() {
        this.subscribers = new ArrayList<Observer>();
        importantValue = 100;
    }

    // some other methods...

    public void setImportantValue(int value) {
        this.importantValue = value;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer: subscribers) {
            observer.update(this.importantValue);
        }
    }
}
