package abstractClasses.example1;

public class Main {
    public static void main(String[] args) {
        System.out.println(AbstractClass.var1);
        System.out.println("Main Method");
        AbstractClass ab = new AbstractClass() {
            @Override
            void method() {
                System.out.println("Method from Inner Class constructor");
            }
        };
        ab.method();
        AbstractClass.method2();
    }
}
