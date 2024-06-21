package Inhertance;

public class A {
    static final int randomValue = 10;
    public A(){
        System.out.println("Constructor of Class A");
    }

    static {
        System.out.println("Static block from class A");
    }
    {
        System.out.println("Instance Block from class A");
    }
}

