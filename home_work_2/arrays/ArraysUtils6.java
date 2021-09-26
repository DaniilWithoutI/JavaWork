package arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysUtils6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);

        int i = 0;
        while (i < container.length){
            System.out.print(container[i] + " ");
            i++;
        }

        System.out.println();
        i = 1;
        while (i < container.length){
            System.out.print(container[i] + " ");
            i += 2;
        }

        System.out.println();
        i = container.length - 1;
        while (i >= 0){
            System.out.print(container[i] + " ");
            i--;
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
