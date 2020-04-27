package thuchanh_ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample= new ArrayExample();
       Integer []arr=arrayExample.creatRandom();
        Scanner scanner= new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua mot phan tu bat ky: ");
        int x= scanner.nextInt();

        try{
            System.out.println("Gia tri cua phan tu so:  "+x+ ", co gia tri la "+arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han cua mang ");
        }
    }
    public Integer[] creatRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i=0; i<arr.length;i++){
            arr[i]=random.nextInt(100);
            System.out.print(arr[i]+" ");
    }
        return arr;
    }
}
