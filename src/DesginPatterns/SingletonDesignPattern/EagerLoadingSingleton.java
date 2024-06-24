package DesginPatterns.SingletonDesignPattern;

public class EagerLoadingSingleton {

    /*
     * Eager loading is a design pattern in which data initialization occurs at the time of class loading.
     * In eager loading, the instance of the class is created at the time of class loading,
     * this is the easiest method to create a singleton class
     * but it has a drawback that instance is created even though client application might not be using it.
     *
    * */
    private static EagerLoadingSingleton instance = new EagerLoadingSingleton();

    private EagerLoadingSingleton() {

    }

    public static EagerLoadingSingleton getInstance(){
        return instance;
    }
}
