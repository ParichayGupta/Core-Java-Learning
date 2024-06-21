package finalKeyword;

public class Main {
     static public void main(String[] args) {
         final String s = "Hello";
         System.out.println(s);
         main(s);
         System.out.println(s);

    }

    public static String main(String s){
        s = "World";
        System.out.println(s);
        return s;
    }
}
