package thuchanh_sapxepchon;

public class SelectSort {
    static double[] list = {1.4, 5.6, 7.8, -9.7, 3.4, 2.3};

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinindex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    currentMinindex = j;
                }
            }
            if (currentMin != i) {
                list[currentMinindex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}
