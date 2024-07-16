package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithDelimiter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String s = strings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(s);
    }
}
