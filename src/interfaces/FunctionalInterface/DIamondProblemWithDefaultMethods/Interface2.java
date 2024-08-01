package interfaces.FunctionalInterface.DIamondProblemWithDefaultMethods;

public interface Interface2 {

    default void m1(){
        System.out.println("Method from interface 2");
    }
}
