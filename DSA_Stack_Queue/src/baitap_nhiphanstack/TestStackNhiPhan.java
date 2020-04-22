package baitap_nhiphanstack;

import java.util.LinkedList;

public class TestStackNhiPhan {
    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();
        int number = 99;


        while (number!=0) {
            int phanDu = number% 2;
            int phanChiaHet = number/2;
            number = phanChiaHet;
          stack.push(phanDu);
            if (number==1)
                break;

        }
        System.out.println(stack.toString());



    }
}



