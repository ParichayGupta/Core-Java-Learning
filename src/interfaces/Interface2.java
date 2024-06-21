package interfaces;

interface Interface2 {
    void method();

    default void method1(){
        System.out.println("Method from interface 2");
    }
}
