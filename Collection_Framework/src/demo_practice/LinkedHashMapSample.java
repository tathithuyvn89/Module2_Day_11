package demo_practice;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapSample {

    public static void main(String[] args) {
        TreeMap tm= new TreeMap();
        tm.put("Zara",3434.34);
        tm.put("Mahl",12.34);
        tm.put("mode",78.34);
        tm.put("chu",56.34);
        Set set= tm.entrySet();
        Iterator i= set.iterator();
        while (i.hasNext()){
            Map.Entry me =(Map.Entry)i.next();
            System.out.println(me.getKey()+ ": ");
            System.out.println(me.getValue());
        }





    }
}


