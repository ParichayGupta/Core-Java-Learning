package superKeyword;

public class BaseClass {
    BaseClass(){
        System.out.println("BaseClass()");
    }

    BaseClass(String s){
        this();
        System.out.println("BaseClass(String s)");
    }


}
