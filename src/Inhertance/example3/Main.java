package Inhertance.example3;

class A{
    A(){
        System.out.println("inside A");
    }
}

class B extends A{
    B(int i){
        System.out.println("inside B");
    }
}
public class Main {

    public static void main(String[] args) {
        B b = new B(10);
    }
}
