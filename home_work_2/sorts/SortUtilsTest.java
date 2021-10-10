package home_work_2.sorts;

import java.util.Arrays;
import java.util.Scanner;

import static home_work_2.sorts.SortUtils.bubbleSort;
import static home_work_2.sorts.SortUtils.shakeSort;
import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;

public class SortUtilsTest {
    public static void main(String[] args) {

        int[][] test1 = {{1, 2, 3, 4, 5, 6}, {1, 1, 1, 1, 1}, {9, 1, 5, 99, 9, 9}, {}};
        int[][] test2 = {{1, 2, 3, 4, 5, 6}, {1, 1, 1, 1, 1}, {9, 1, 5, 99, 9, 9}, {}};
        bubbleSort(test1);
        System.out.println(Arrays.deepToString(test1));
        shakeSort(test2);
        System.out.println(Arrays.deepToString(test2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();

        int[] container1 = arrayRandom(size, maxValueExclusion);
        bubbleSort(container1);
        System.out.println(Arrays.toString(container1));
        container1 = arrayRandom(size, maxValueExclusion);
        shakeSort(container1);
        System.out.println(Arrays.toString(container1));

        int[] container2 = arrayFromConsole();
        bubbleSort(container2);
        System.out.println(Arrays.toString(container2));
        container2 = arrayFromConsole();
        shakeSort(container2);
        System.out.println(Arrays.toString(container2));
    }
}
