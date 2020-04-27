package baitap_minhhoathuattoanchen;

public class MyInsertSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, -4, -3, 8};
        sort(arr);

    }

    static void sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                System.out.println("Swap " + arr[j] + " for " + arr[j + 1]);
                arr[j + 1] = arr[j];
                j = j - 1;

            }

            arr[j + 1] = key;
            System.out.println("Gia tri cua " + (j + 1) + " la " + arr[j + 1]);
            System.out.print("List after the " + i + "'sort: ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + ",");
            }
            System.out.println();
        }


    }

}
