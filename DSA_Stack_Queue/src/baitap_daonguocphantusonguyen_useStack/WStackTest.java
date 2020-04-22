package baitap_daonguocphantusonguyen_useStack;

import java.util.Arrays;

public class WStackTest {
    public static void main(String[] args) throws Exception {
        String arr[]={"AN","Hoang","Ngoc","Son","Hieu"};
        String newArr[] = new String[arr.length];
        WStack stack= new WStack(arr.length);
        //Push mang vao Stack
        for (int i=0; i<arr.length;i++){
            stack.push(arr[i]);
        }
        //In ra cac phan tu trong stack
        for (int j=0; j<stack.size();j++){
            System.out.print(stack.getElement(j)+"\t\n");
        }
        //lay phan tu ra khoi stack va push vao newArr[], mảng mới này có các phần tử giống hệt mảng ban đầu

        for (int j=stack.size()-1; j>=0;j--){
            newArr[j]=stack.pop();
        }
        System.out.println(Arrays.toString(newArr));
    }
}
