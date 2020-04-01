package com.example.hateoas.singleton;

public class SingletonDemo {

    public static void main(String[] args) {


        SingletonEarly singletonEarly = SingletonEarly.getInstance();
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
    }

}

class SingletonLazy {

    private static SingletonLazy singleton;

    private SingletonLazy() {
        System.out.println("Lazy Instance Created");
    }

    static SingletonLazy getInstance() {
        if (singleton == null)
            singleton = new SingletonLazy();
        return singleton;
    }
}

class SingletonEarly {

   private static SingletonEarly singleton = new SingletonEarly();

    private SingletonEarly() {
        System.out.println("Early Instance Created");
    }

    static SingletonEarly getInstance() {
        return singleton;
    }
}
