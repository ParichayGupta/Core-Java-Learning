package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList {

    /*
    * Given a arraylist, make it immutable.
    * */

    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,4,5,6,7,8,9);
//        list.add(2);
//        list.add(4);
//        list.add(6);
//        list.add(8);
//        list.add(1);
//        list.add(3);
//        list.add(4);
//        list.add(9);
        makeListImmutable(list);
        System.out.println(list);
    }

    private static void makeListImmutable(List<Integer> list){
        try{
            list.add(11);
        }catch (UnsupportedOperationException e){
            System.out.println("List is immutable");
        }
    }
}
