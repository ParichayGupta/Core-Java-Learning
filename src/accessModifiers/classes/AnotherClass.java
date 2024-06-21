package accessModifiers.classes;

public class AnotherClass {
    public static void main(String[] args) {
//        Test.InnerClass innerClass = new Test().new InnerClass();
//        System.out.println(innerClass.method());
        Test.InnerClass2 innerClass2 = new Test().new InnerClass2();
        System.out.println(innerClass2.method());
        Test.InnerClass3 innerClass3 = new Test().new InnerClass3();
        System.out.println(innerClass3.method());
        Test.InnerClass4 innerClass4 = new Test().new InnerClass4();
        System.out.println(innerClass4.method());
    }
}
