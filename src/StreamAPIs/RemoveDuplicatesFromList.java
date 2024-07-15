package StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3,2,44);

        List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);
    }
}
