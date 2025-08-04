package org.example.creationalpatterns.singletonpattern.scenarios;

public class SingletonWithSynchronizedBlock {
    private static SingletonWithSynchronizedBlock singletonInstance = null;

    private SingletonWithSynchronizedBlock(){

    }

    public static SingletonWithSynchronizedBlock getSingletonInstance(){
       if(singletonInstance == null){
           synchronized (SingletonWithSynchronizedBlock.class){
               if(singletonInstance == null){
                   singletonInstance = new SingletonWithSynchronizedBlock();
               }
           }
       }
       return singletonInstance;
    }
}
