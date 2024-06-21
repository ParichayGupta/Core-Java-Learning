package CollectionFramework.Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(12);
        list.add(33);
        list.add(33);
        list.add(4);
        list.add(9);

        System.out.println(findSecondLargestElementUsingStreams(list));

        System.out.println(findSecondLargestElement(list));
    }

    public static int findSecondLargestElementUsingStreams(List<Integer> list){
        return list.stream().limit(2).skip(1).findFirst().get();
    }

    public static int findSecondLargestElement(List<Integer> list){
        int max = list.get(0);
        int secondMax = list.get(0);

        for(int j : list){
            if(j > max){
                secondMax = max;
                max = j;
            }else if(j > secondMax && j != max){
                secondMax = j;
            }
        }
        return secondMax;
    }
}
