package StreamAPIs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        String s = "abcbcshhdekkekpp";

        Map<Character, Long> charCount = s.chars()
                .mapToObj(c -> (char) c).collect(Collectors
                        .groupingBy(c -> c, Collectors.counting()));
        System.out.println(charCount);
    }
}

