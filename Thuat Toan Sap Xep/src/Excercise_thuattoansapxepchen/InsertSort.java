package Excercise_thuattoansapxepchen;

public class InsertSort {
    public static void main(String[] args) {
        int arr[]={5,6,-4,-3,8};
        sort(arr);
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+",");
        }


    }
   static void sort(int arr[])
    {
       for (int i=0; i<arr.length;i++){
           int key= arr[i];
           int j=i-1;
           while (j>=0&&arr[j]>key){
               arr[j+1]=arr[j];
               j=j-1;
           }
           arr[j+1]=key;
       }

    }

}
