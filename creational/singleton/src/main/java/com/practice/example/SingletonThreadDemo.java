package com.example.hateoas.singleton;

public class SingletonThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Runnable target1 = new Runnable() {
            @Override
            public void run() {
                SingletonSync singletonSync1 = SingletonSync.getInstance();
            }
        };

        Runnable target2 = new Runnable() {
            @Override
            public void run() {
                SingletonSync singletonSync2 = SingletonSync.getInstance();
            }
        };

        Thread thread1 = new Thread(target1);
        Thread thread2 = new Thread(target2);

        thread1.start();
        thread2.start();

    }
}

class SingletonSync {

    public static SingletonSync singletonSync;

    private SingletonSync() {
        System.out.println("Instance Created");
    }

    public static synchronized SingletonSync getInstance() {
        if (singletonSync == null)
            singletonSync = new SingletonSync();
        return singletonSync;
    }

}