package com.example.hateoas.singleton;

public class SingletonThreadSecondDemo {

    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            SingletonDoubleCheck singletonSync1 = SingletonDoubleCheck.getInstance();
        };

        Runnable runnable2 = () -> {
            SingletonDoubleCheck singletonSync2 = SingletonDoubleCheck.getInstance();
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

    }
}



class SingletonDoubleCheck {

    public static SingletonDoubleCheck obj;

    private SingletonDoubleCheck() {
        System.out.println("Instance Created");
    }

    // double check locking, better than synchronized method because it locks only
    // if instance is null not every time. But its out-dated, its just a kind of
    // textbook implementation.
    public static SingletonDoubleCheck getInstance() {
        if(obj==null){
        synchronized (SingletonDoubleCheck.class) {
            if (obj == null)
                obj = new SingletonDoubleCheck();
        }
        }
        return obj;
    }

}

enum Abc{
    INSTANCE;

}