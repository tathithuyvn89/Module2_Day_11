package baitap_tochucdulieuhoply_Demerging;

import baitap_lienketvong_queue.Queue_Link;

public class Main {
    public static void main(String[] args) {
        Queue_Link<String> queue= new Queue_Link<>();
        queue.enQueue("nhe");
        queue.enQueue("me");
        queue.enQueue("bo");
        queue.deQueue();
        queue.enQueue("chau");
       for (int i=0; i<queue.getSize();i++){
           System.out.println(" Phan tu thu " +i + " co gia tri la: " + queue.get(i));
       }
    }
}
