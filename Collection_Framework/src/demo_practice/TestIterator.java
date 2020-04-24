package demo_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

       Iterator<String> iterator= collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();
//        for (String e: collection){
//            System.out.print(e.toUpperCase()+ " ");
//        }


    }

}
