package interfaces.FunctionalInterface.ExtendingFunctionalInteface;

@FunctionalInterface
public interface ChildFunctionalInterface extends ParentFunctionalInterface {
//    void m2(); // gives error as it violates the functionality of Functional Interface
    String toString();
}
