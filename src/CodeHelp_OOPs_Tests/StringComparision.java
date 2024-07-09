package CodeHelp_OOPs_Tests;

public class StringComparision {
    String s = "";
    void set(String s){
        this.s = s;
    }
    void compare(){
        System.out.println(this.s.equals("Hello"));
    }
    public static void main(String[] args) {
            StringComparision obj = new StringComparision();
            StringComparision obj2 = new StringComparision();
            obj.set("Hello");
            obj2.compare();
        }
}
