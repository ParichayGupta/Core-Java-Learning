package DesginPatterns.SingletonDesignPattern;

public class LazyInitializationSingleton {

    /*
    *   This is a Singleton Class for which only one object is created in the entire application.
    *   If someone tries to create another object of this class, the same object is returned.
    *
    *   But when the object is created, it is not thread safe. If two threads try to create the object at the same time,
    *   two objects will be created. This is not the desired behavior.
    * */
    private static LazyInitializationSingleton instance = null;

    private LazyInitializationSingleton() {

    }

    public static LazyInitializationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}
