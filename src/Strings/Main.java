package Strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String s = "Hello";

        String s1 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");


        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s2 == s3);
    }
}
