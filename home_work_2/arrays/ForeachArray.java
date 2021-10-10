package home_work_2.arrays;

import java.util.Scanner;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ForeachArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);
        for (int value: container) {
            System.out.print(value + " ");
        }
        System.out.println();
        int i = 0;
        for (int value: container) {
            if (i % 2 != 0) {
                System.out.print(value + " ");
            }
            i++;
        }
        System.out.println();
        i = 0;
        for (int value: container) {
            for (int index: container) {
                if (index == container[size - (i + 1)]) {
                    value = container[size - (i + 1)];
                    break;
                }
            }
            System.out.print(value + " ");
            i++;
        }
    }
}
