package Inhertance.Overloading;

public class Main {
    public static void main(String[] args) {

    }
}

class A{
    public int show(int a){
        return a;
    }
}

class B extends A{
    public int show(int a){
        System.out.println("Show B");
        return a;
    }
}
