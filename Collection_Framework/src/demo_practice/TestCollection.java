package demo_practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList collection1= new ArrayList();
        collection1.add(1);
        collection1.add("me");
        collection1.add("bo");
        collection1.add("13");
        collection1.add("em");
        System.out.println("A list of cities in collection 1:");
        System.out.println(collection1);
        System.out.println(" At 3 in collection element is "+collection1.get(3));
        collection1.remove(0);
        System.out.println("New size : "+collection1.size());
        //Creat collection2
        ArrayList collection2= new ArrayList<>();
        collection2.add("I");
        collection2.add(" ");
        collection2.add("want");
        collection2.add(" ");
        collection2.add("to");
        collection2.add("");
        collection2.add("toilet");
        System.out.println("A list in collection 2 is ");
        System.out.println(collection2);
        ArrayList c1= (ArrayList)collection1.clone();
        System.out.println(c1);
        c1.addAll(collection2);
        System.out.println(c1);
//        c1=(ArrayList)(collection1.clone());
//        System.out.println(c1);
        c1.removeAll(collection2);
        System.out.println(c1);
    }
}
