package sorts;

import java.util.Arrays;

public class SortUtils1 {
    public static void main(String[] args) {
        int[][] test1 = {{1, 2, 3, 4, 5, 6},  {1, 1, 1, 1}, {9, 1, 5, 99, 9, 9}, {}};
        int[][] test2 = {{1, 2, 3, 4, 5, 6},  {1, 1, 1, 1}, {9, 1, 5, 99, 9, 9}, {}};


        System.out.println(Arrays.deepToString(test1));
        shakeSort(test1);
        bubbleSort(test2);
    }

    public static void bubbleSort(int[][] array) {
        boolean isSorted;
        for (int i = 0; i < 4; i++) {
            do {
                isSorted = true;
                for (int j = 1; j < array[i].length; j++) {
                    if (array[i][j - 1] > array[i][j]){
                        int tmp = array[i][j];
                        array[i][j] = array[i][j-1];
                        array[i][j - 1] = tmp;
                        isSorted = false;
                    }
                }
            } while (!isSorted);
            System.out.println("Сортировка пузырьком, тест " + (i + 1));
            System.out.println(Arrays.deepToString(array));
        }
    }

    public static void shakeSort(int[][] array){
        for (int i = 0; i < 4; i++) {
            int left = 1;
            int right = array[i].length;
            do {
                for (int j = left; j < right; j++) {
                    if (array[i][j - 1] > array[i][j]){
                        int tmp = array[i][j];
                        array[i][j] = array[i][j-1];
                        array[i][j - 1] = tmp;
                    }
                }
                left++;
                for (int j = right - 1; j > left; j--) {
                    if (array[i][j] < array[i][j - 1]){
                        int tmp = array[i][j - 1];
                        array[i][j - 1] = array[i][j];
                        array[i][j] = tmp;
                    }
                }
                right--;
            } while (left <= right);
            System.out.println("Шейкерная сортировка, тест " + (i + 1));
            System.out.println(Arrays.deepToString(array));
        }
    }
}
