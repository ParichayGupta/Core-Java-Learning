package Strings.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
//        String s = " World";
//
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(s);
//        System.out.println(method(sb));

        StringBuffer sb21 = new StringBuffer("abc");
        StringBuffer sb22 = sb21;
        sb21 = new StringBuffer("xyz");


        StringBuffer sb23 = new StringBuffer("abc");
        StringBuffer sb24 = sb23;
        sb23 = sb23.append("xyz");

        System.out.println(sb22);
        System.out.println(sb24);

    }

    private static String method(StringBuilder sb) {
        return sb.toString();
    }
}
