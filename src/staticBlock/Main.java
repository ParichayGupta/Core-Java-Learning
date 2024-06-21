package staticBlock;

import interfaces.Interface1;

public class Main {
    public static void main(String[] args) {
       Test t = new Test();
       Test t2 = new Test();
       Test.main(new String[]{"Hello", "world"});
    }

    static {
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    {
        System.out.println("Instance Block");
    }
}

class Test {

    public static void main(String a){
        System.out.println("main from test called");
    }

    public static void main(String a[]){
        Main m = new Main();
        System.out.println("Main from Test called");
    }
}
