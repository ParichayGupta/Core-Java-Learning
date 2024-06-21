package Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCards {

    public static Number add(List<? super Number> list) {
        return (Number) list.get(0);
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(10.00);
        System.out.println(add(list));
    }
}
