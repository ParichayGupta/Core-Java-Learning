package interfaces.FunctionalInterface.DIamondProblemWithDefaultMethods;

public class ImplementingClass implements Interface1, Interface2{
    @Override
    public void m1() {
        Interface1.super.m1();
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.m1();
    }
}
