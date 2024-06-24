package DesginPatterns.SingletonDesignPattern;

public class ThreadSafeHighPerformanceSingleton {
    /**
     *  Instead of using Synchronized method, we are using double
     *  checked locking principle to reduce the overhead of synchronization.
     *  This will make the method faster as only the first call will be synchronized.
     *  This is the best way to create a thread safe singleton class.
     *  But this is only available in Java 1.5 and later.
     *
     */

    private static ThreadSafeHighPerformanceSingleton instance = null;

    private ThreadSafeHighPerformanceSingleton(){}

    public static ThreadSafeHighPerformanceSingleton getInstance(){
        if(instance == null){
            synchronized(ThreadSafeHighPerformanceSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeHighPerformanceSingleton();
                }
            }
        }
        return instance;
    }
}
