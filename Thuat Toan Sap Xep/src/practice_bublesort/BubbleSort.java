package practice_bublesort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size : ");
        int size= scanner.nextInt();
        int []list=new int[size];
        System.out.println("Enter "+list.length+ "value: ");
        for (int i=0; i<list.length;i++){
            System.out.print("Enter a value "+i + " : ");
            list[i]=scanner.nextInt();
        }
        System.out.println("Your input list : ");
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);

    }
    static void bubbleSortByStep(int []list){
        boolean needNextPass=true;
        for (int i=1; i<list.length&&needNextPass;i++){
            needNextPass=false;
            for (int j=0; j<list.length-i;j++){
                if (list[j]>list[j+1]){
                    System.out.println("Swap"+list[j]+"with"+list[j+1]);
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    needNextPass=true;
                }
            }
           if (needNextPass==false) {
               System.out.println("Array may be sorted and next pass not needed");
               break;
           }
            System.out.print("List after the "+i+"'sort: ");
           for (int k=0; k<list.length;k++){
               System.out.print(list[k]+"\t");
           }
            System.out.println();

        }
    }
}
