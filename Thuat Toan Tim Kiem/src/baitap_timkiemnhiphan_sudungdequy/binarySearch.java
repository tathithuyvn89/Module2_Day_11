package baitap_timkiemnhiphan_sudungdequy;

import java.lang.reflect.Array;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n-1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

    }
    static int binarySearch(int[] arr, int low, int high, int value){
        while (high>=low){
            int mid= low+(high-low)/2;
            if (arr[mid]==value){
                return mid;
            } else if (arr[mid]>value){
                return binarySearch(arr, low, mid-1,value);
            } else {
                return binarySearch(arr,mid+1,high,value);
            }
        }
        return -1;
    }
}
