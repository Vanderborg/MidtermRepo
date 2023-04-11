package datastructure;

import java.util.*;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
       Map<Integer, String> map = new HashMap<>();

        map.put(1, "Japan");
        map.put(2, "Bangladesh");
        map.put(3, "Mexico");
        map.put(4, "Egypt");
        map.put(5, "Iceland");
        map.put(6, "Algeria");

        Collection<String> countries = map.values();
                System.out.print("Collection view of Countries: "+ countries);
    }

}
