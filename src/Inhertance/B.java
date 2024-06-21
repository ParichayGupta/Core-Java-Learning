package Inhertance;

public class B extends A{
    static final int randomVlaue = 20;

    public B(){
        System.out.println("Constructor of class B");
    }

    static {
        System.out.println("Static Block from Class B");
    }
    {
        System.out.println("Instance Block from class B");
    }
}
