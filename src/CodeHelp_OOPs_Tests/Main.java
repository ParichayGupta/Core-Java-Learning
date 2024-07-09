package CodeHelp_OOPs_Tests;

public class Main {
    int a = 10;
    static class A{
        int a = 20;
        void display(int a){
            System.out.println(this.a);
            System.out.println(a);

        }
    }

    public static void main(String[] args) {
        Main.A a = new Main.A();
        a.display(30);
    }

}
