package sorts;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SortUtils2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();

        int[] container1 = arrayRandom(size, maxValueExclusion);
        bubbleSort(container1);
        System.out.println(Arrays.toString(container1));
        shakeSort(container1);
        System.out.println(Arrays.toString(container1));

        int[] container2 = arrayFromConsole();
        bubbleSort(container2);
        System.out.println(Arrays.toString(container2));
        shakeSort(container2);
        System.out.println(Arrays.toString(container2));
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = ThreadLocalRandom.current().nextInt(0, maxValueExclusion);
        }
        System.out.println(Arrays.toString(container));
        return container;
    }

    public static int[] arrayFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scan.nextInt();
        int[] container = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Значение " + i + "-ого элемента массива:");
            container[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(container));
        return container;
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted;
            do {
                isSorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]){
                        int tmp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tmp;
                        isSorted = false;
                    }
                }
            } while (!isSorted);
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
}
