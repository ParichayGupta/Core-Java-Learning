package CodeHelp_OOPs_Tests;

public class Constructor {

    String s = "";
    Constructor(){
        this.s = "Constructor";
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println(obj.s);
    }
}
