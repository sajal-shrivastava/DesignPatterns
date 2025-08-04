package org.example.creationalpatterns.singletonpattern.client;

import org.example.creationalpatterns.singletonpattern.scenarios.SingletonPattern;

public class Client {
    public static void main(String[] args) {
        SingletonPattern singletonInstance = SingletonPattern.getSingletonInstance();
        SingletonPattern singletonPatternWithSync = SingletonPattern.getSingletonInstance();

        SingletonPattern singletonInstanceCopy = SingletonPattern.getSingletonInstance();
        SingletonPattern singletonPatternWithSyncCopy = SingletonPattern.getSingletonInstance();

        System.out.println(singletonInstance);
        System.out.println(singletonPatternWithSync);
        System.out.println(singletonInstanceCopy);
        System.out.println(singletonPatternWithSyncCopy);

    }
}
