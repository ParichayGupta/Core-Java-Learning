package interfaces.FunctionalInterface.DIamondProblemWithDefaultMethods;

public interface Interface1 {

    default void m1(){
        System.out.println("Method from interface 1");
    }
}
