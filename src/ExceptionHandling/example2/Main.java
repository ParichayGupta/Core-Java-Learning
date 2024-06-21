package ExceptionHandling.example2;

import java.io.FileNotFoundException;


class A {
    public void method() throws FileNotFoundException {
        System.out.println("Hello World");
    }
}

class B extends A{
    public void method() throws FileNotFoundException {
        System.out.println("Hello World");
    }
}
public class Main {

}
