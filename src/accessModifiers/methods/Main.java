package accessModifiers.methods;

public class Main {
    public String s = "Hello";
    private String s1 = "World";
    protected String s2 = "World2";
    String s3 = "World3";
    final String s4 = "World4";
    static String s5 = "World5";
    private final static String s6 = "World6";
    String s7 = "World7";

    public static void main(String[] args) {
        final String s = "Hello";
        String s1 = "World!";
    }

    private void method(){}

    public void method1(){}

    void method2(){}

    static void method3(){}

    final void method4(){}

}
