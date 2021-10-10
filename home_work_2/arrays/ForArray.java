package home_work_2.arrays;

import java.util.Scanner;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ForArray {
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
}
