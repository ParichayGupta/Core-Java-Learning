package accessModifiers.classes;

public class Test {

    private class InnerClass {
        int method(){
            return 1;
        }
    }

    protected class InnerClass2 {
         int method(){
            return 2;
        }
    }

    public class InnerClass3 {
         int method(){
            return 3;
        }
    }

    class InnerClass4 {
         int method(){
            return 4;
        }
    }

    final class InnerClass5{
        int method(){
            return 5;
        }
    }
    public void outerClassMethod(){
        System.out.println("outerClassMethod");
    }
    public static void main(String[] args) {
        Test.InnerClass innerClass = new Test().new InnerClass(){
            @Override
            public int method() {
                return 5;
            }
        };
        System.out.println(innerClass.method());
        Test.InnerClass2 innerClass2 = new Test().new InnerClass2();
        System.out.println(innerClass2.method());
        Test.InnerClass3 innerClass3 = new Test().new InnerClass3();
        System.out.println(innerClass3.method());
        Test.InnerClass4 innerClass4 = new Test().new InnerClass4();
        System.out.println(innerClass4.method());
    }
}
