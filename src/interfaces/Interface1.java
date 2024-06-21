package interfaces;

import java.util.ArrayList;

public interface Interface1 {

    boolean value = true;

    void method();

    static void method1(){
        System.out.println("Method from Interface 1");
    }

    static void main(String[] args) {
        System.out.println("Main method inside Interface");
        method1();
    }
}
