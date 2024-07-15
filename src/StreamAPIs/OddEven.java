package StreamAPIs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors
                .partitioningBy(i -> i % 2 == 0));

        for(Map.Entry<Boolean, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }

        list.stream().filter(i -> i % 2 == 0).forEach(System.out::print);
        System.out.println();
        list.stream().filter(i -> i % 2 != 0).forEach(System.out::print);

    }
}
