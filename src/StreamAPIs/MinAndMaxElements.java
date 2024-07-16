package StreamAPIs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxElements {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min: "+min);
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max: "+max);
    }
}
