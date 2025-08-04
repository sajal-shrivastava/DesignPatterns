package org.example.creationalpatterns.singletonpattern.scenarios;

public class SingletonPattern {
    private static SingletonPattern singleInstance = null;

    private SingletonPattern(){

    }

    public synchronized static SingletonPattern getSingletonInstance(){
        if(singleInstance == null){
            singleInstance = new SingletonPattern();
        }
        return singleInstance;
    }
}
