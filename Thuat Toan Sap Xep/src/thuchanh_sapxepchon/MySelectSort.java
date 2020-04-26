package thuchanh_sapxepchon;

public class MySelectSort {
    public static void main(String[] args) {
        int [] list={3,4,8,0,2,1,89,12,34};
        selectSortByWay(list);

    }

    private static void selectSortByWay(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            int minValue = arr[i];
            int minValueIndex = i;
            int loopTime=0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minValueIndex = j;
                   loopTime++;
                    System.out.println("Gia tri "+minValue+" duoc tim thay");
                }

            }
            System.out.println("Number of loop : "+loopTime);

            if (minValueIndex != i) {
                arr[minValueIndex] = arr[i];
                arr[i] = minValue;
                System.out.println("Tim duoc gia nho nhat" + minValue + " tai vi tri index= " + minValueIndex);
            }


            System.out.println("List after the   " + i + " sort");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + "\t");
            }
            System.out.println();

        }

    }
}
