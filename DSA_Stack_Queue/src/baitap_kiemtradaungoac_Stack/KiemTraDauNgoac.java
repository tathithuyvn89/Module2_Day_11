package baitap_kiemtradaungoac_Stack;

import java.util.LinkedList;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        //    LinkedList <String> bStack= new LinkedList<String>();

        String [] a={"s * (s – a) * (s – b) * (s – c) ","(– b + (b2 – 4*a*c)^0.5) / 2*a"
            ,"s * (s – a) * (s – b * (s – c)","s * (s – a) * s – b) * (s – c)","(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"};
        for (int i=0; i<a.length;i++){
            System.out.println(" Voi mang la a= {"+ a[i]+"}");
            if (isWell(a[i])){
                System.out.println("Dau ngoac phu hop");
            } else {
                System.out.println("Dau ngoac khong phu hop");
            }
        }



    }
    private static boolean isWell(String a){
        Stack<String> bStack = new Stack<String>();
       for (int i=0; i<a.length();i++){
           if (Character.toString(a.charAt(i)).equals(Character.toString('('))){
               bStack.add(String.valueOf(a.charAt(i)));
           }
       }
        // Đếm các ký tự ngoạc phải trong
       Object[] left= bStack.toArray();
       int count =0; // biến đếm dấu ngoạc phải
        for (int i=0; i<a.length();i++){
            if (Character.toString(a.charAt(i)).equals(Character.toString(')'))){
               count++;
            }
        }
        if (left.length==count){
            return true;
        } else {
            return false;
        }

    }


}
