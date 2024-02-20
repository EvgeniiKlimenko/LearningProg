package com.brokenhead.patterns;

public class SingletonExample {

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        public static final SingletonExample INSTANCE = new SingletonExample();
    }
}
