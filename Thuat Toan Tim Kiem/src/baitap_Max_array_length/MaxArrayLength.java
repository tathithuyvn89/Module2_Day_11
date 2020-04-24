package baitap_Max_array_length;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxArrayLength {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        LinkedList<Character> max= new LinkedList<>();
        LinkedList<Character> list= new LinkedList<>();
//        max.push('m');
//        max.add('n');
//        max.add('e');
//        max.add('c');
//        max.add('a');
//        max.add('b');
//        list.add('h');
//        list.add('b');
//        list.add('m');
//        list.add('o');
//        list.add('a');
//        Collections.sort(list);
//        Collections.sort(max);
//        System.out.println(max);
//        System.out.println(list);

        System.out.println("Enter a string : ");
        String string = scanner.nextLine();
        for (int i=0; i<string.length();i++){
            if (list.size()>1&&string.charAt(i)<=list.getLast()&&list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }

        }
        for (Character c:max){
            System.out.print(c);
        }
        System.out.println();

    }
}
