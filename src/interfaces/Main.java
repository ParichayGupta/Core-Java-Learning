package interfaces;

public class Main implements Interface1, Interface2{
    public static void main(String[] args) {
        Main main = new Main();
        main.method1();
        main.method();

    }

    public void method(){
        System.out.println("Method called");
    }

    public void method1() {
        System.out.println("Hello World !!");
    }
}
