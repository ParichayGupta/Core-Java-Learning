package Strings.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        String s = " World";

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(s);
        System.out.println(method(sb));

    }

    private static String method(StringBuilder sb) {
        return sb.toString();
    }
}
