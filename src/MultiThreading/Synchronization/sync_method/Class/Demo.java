package MultiThreading.Synchronization.sync_method.Class;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        main();
        main(new String[]{"Hello", "World"});
    }

    public static void main(){
        System.out.println("Hello World from secondary main");
    }


}
