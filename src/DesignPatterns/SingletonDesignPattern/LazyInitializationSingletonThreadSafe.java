package DesignPatterns.SingletonDesignPattern;

public class LazyInitializationSingletonThreadSafe {


    /*
    *   To make a Singleton class thread safe, we can make the getInstance() method synchronized.
    *
    *   this will make sure that only one thread can access the method at a time.
    *   But this will make the method slow as only one thread can access the method at a time.
    *   hence, it will hamper the performance of the application.
    * */
    private static LazyInitializationSingletonThreadSafe instance = null;

    private LazyInitializationSingletonThreadSafe() {

    }
    public static synchronized LazyInitializationSingletonThreadSafe getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingletonThreadSafe();
        }
        return instance;
    }
}
