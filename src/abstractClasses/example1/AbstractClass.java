package abstractClasses.example1;

public abstract class AbstractClass {
    public static int var1= 10;

    public AbstractClass(){
        System.out.println("Constructor inside abstract class");
    }

    abstract void method();

    static void method2(){
        System.out.println("Static method inside Abstract class");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        StringBuffer sb21 = new StringBuffer("abc");
        StringBuffer sb22 = sb21;
        sb21 = new StringBuffer("xyz");

        StringBuffer sb23 = new StringBuffer("abc");
        StringBuffer sb24 = sb23;
        sb23 = sb23.append("xyz");

        System.out.println(sb22);
        System.out.println(sb24);
    }
    static {
        System.out.println("Static block from AbstractClass");
    }
}
