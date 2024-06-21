package superKeyword;

public class DerivedClass extends BaseClass{
    DerivedClass(){
//        super("DerivedClass to BaseClass");
        System.out.println("DerivedClass()");
    }

    DerivedClass(String s){
        this();
        System.out.println("DerivedClass(String s)");
    }
}
