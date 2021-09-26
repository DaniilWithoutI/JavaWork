package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysUtils7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println(Arrays.toString(container));
        System.out.println(summaСhet(container));
        System.out.println(maxValue(container));
        lessMiddleArifmethic(container);
        twoSmallest(container);
        System.out.println(Arrays.toString(deleteInterval(container)));
        System.out.println(summArray(container, maxValueExclusion));
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = ThreadLocalRandom.current().nextInt(-maxValueExclusion, maxValueExclusion);
        }
        return container;
    }

    public static int summaСhet(int[] container){
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] >= 0 && container[i] % 2 == 0){
                sum += container[i];
            }
        }
        return sum;
    }

    public static int maxValue(int[] container){
        int max = 0;
        for (int i = 0; i < container.length; i += 2) {
            if (container[i] > max)
                max = container[i];
        }
        return max;
    }

    public static void lessMiddleArifmethic(int[] container){
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            sum += container[i];
        }
        for (int j : container) {
            if (j < (float)sum / container.length) {
                System.out.print(j + " ");
            }
        }
    }

    public static int twoSmallest(int[] container){
        int min1 = 0, min2 = 0, index = 0;
        for (int j : container) {
            System.out.print(j + " ");
        }
        System.out.print("\n2 наименьших элемента: ");
        for (int k = 0; k < container.length; k++) {
            if (container[k] <= container[0]){
                min1 = container[k];
                index = k;
            }
        }
        for (int k = 0; k < container.length; k++) {
            if (k != index && container[k] <= container[0]){
                min2 = container[k];
            }
        }
        System.out.println(min1 + " " + min2);
        return 0;
    }

    public static int[] deleteInterval(int[] container){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите нижнее значение интервала:");
        int a = scan.nextInt();
        System.out.println("Введите верхнее значение интервала:");
        int b = scan.nextInt();
        for (int i = 0; i < container.length; i++) {
            if (container[i] >= a && b >= container[i]){
                for (int j = i; j < container.length - 1; j++) {
                    container[j] = container[j + 1];
                    i = 0;
                }
                container[container.length - 1] = 0;
            }
        }
        return container;
    }

    public static int summArray(int[] container, int maxValueExclusion){
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] < 0){
                container[i] *= -1;
            }
            while (container[i] > 0){
                int naturalNumber = container[i] % 10;
                sum += naturalNumber;
                container[i] /= 10;
            }
        }
        return sum;
    }
}
