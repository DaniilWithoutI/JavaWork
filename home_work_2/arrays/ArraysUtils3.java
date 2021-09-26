package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysUtils3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < container.length; i += 2) {
            System.out.print(container[i] + " ");
        }
        System.out.println();
        for (int i = container.length - 1; i >= 0; i--) {
            System.out.print(container[i] + " ");
        }
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = ThreadLocalRandom.current().nextInt(0, maxValueExclusion + 1);
        }
        return container;
    }
}
