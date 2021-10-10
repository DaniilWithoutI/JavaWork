package home_work_2.sorts;

public class SortUtils {

    public static void bubbleSort(int[] array) {
        boolean isSorted;
            do {
                isSorted = true;
                for (int j = 1; j < array.length; j++) {
                    if (array[j - 1] > array[j]){
                        int tmp = array[j];
                        array[j] = array[j-1];
                        array[j - 1] = tmp;
                        isSorted = false;
                    }
                }
            } while (!isSorted);
    }

    public static void bubbleSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            bubbleSort(array[i]);
        }
    }

    public static void shakeSort(int[] array){
            int left = 1;
            int right = array.length;
            do {
                for (int j = left; j < right; j++) {
                    if (array[j - 1] > array[j]){
                        int tmp = array[j];
                        array[j] = array[j-1];
                        array[j - 1] = tmp;
                    }
                }
                left++;
                for (int j = right - 1; j > left; j--) {
                    if (array[j] < array[j - 1]){
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
                right--;
            } while (left <= right);
    }
    public static void shakeSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            shakeSort(array[i]);
        }
    }
}
