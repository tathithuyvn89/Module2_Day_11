package baitap_daonguocphantusonguyen_useStack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray1StackTest {
    public static void main(String[] args) throws Exception {
        int arr[]={1,23,6,5,7};
        int newArr[] = new int[arr.length];
        MyArray1 stack= new MyArray1(arr.length);
        //Push mang vao Stack
     for (int i=0; i<arr.length;i++){
        stack.push(arr[i]);
     }
     //In ra cac phan tu trong stack
     for (int j=0; j<stack.size();j++){
         System.out.print(stack.getElement(j)+"\t");
     }
     //lay phan tu ra khoi stack va push vao newArr[], mảng mới này có các phần tử giống hệt mảng ban đầu
        System.out.println("==============");
        for (int j=stack.size()-1; j>=0;j--){
            newArr[j]=stack.pop();
        }
        System.out.println(Arrays.toString(newArr));




    }
}
