package Inhertance.example4;

class A {
    public static void show() {
        System.out.println("In A");
    }
}
class B extends A {
    public static void show() {
        System.out.println("In B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.show();
    }
}
