package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysUtils2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println(Arrays.toString(container));
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = ThreadLocalRandom.current().nextInt(0, maxValueExclusion);
        }
        return container;
    }
}
