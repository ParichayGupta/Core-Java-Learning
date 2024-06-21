package Immutablity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hell");
        HashMap<StringBuilder, Boolean> map = new HashMap<>();

        map.put(sb, true);
        map.put(sb2, true);

        sb2.append("o");

        //System.out.println(sb);

//        for(Map.Entry val :map.entrySet()){
//            System.out.println(val.getKey() + " " + val.getValue());
//        }
        Iterator<Map.Entry<StringBuilder,Boolean>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<StringBuilder,Boolean> entry = it.next();
            if(entry.getKey().toString().equals("Hello")){
                System.out.println(entry.getKey());
            }

        }

    }
}
