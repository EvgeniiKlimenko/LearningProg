package com.brokenhead.patterns.observer;

public class MagazineReader implements Observer {

    private int importantValue;

    public MagazineReader() {
        this.importantValue = 50;
    }

    // some other methods...

    @Override
    public void subscribeTo(Subject subject) {
        subject.addSubscriber(this);
    }

    @Override
    public void unsubscribe(Subject subject) {
        subject.removeSubscriber(this);
    }

    @Override
    public void update(int value) {
        importantValue = value;
    }
}
