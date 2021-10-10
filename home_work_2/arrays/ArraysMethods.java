package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ArraysMethods {
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
        lessMiddleArithmetic(container);
        twoSmallest(container);
        System.out.println(Arrays.toString(deleteInterval(container)));
        System.out.println(summArray(container));
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
        int max = container[0];
        for (int i = 0; i < container.length; i ++) {
            if (container[i] >= max)
                max = container[i];
        }
        return max;
    }

    public static void lessMiddleArithmetic(int[] container){
        double sum = 0.0;
        for (int i = 0; i < container.length; i++) {
            sum += container[i];
        }
        double middleArithmetic = sum/container.length;
        for (int j : container) {
            if (j < middleArithmetic) {
                System.out.print(j + " ");
            }
        }
    }

    public static void twoSmallest(int[] container){
        int min1 = 0;
        int min2 = 0;
        System.out.print("\n2 наименьших элемента: ");
        for (int k = 0; k < container.length; k++) {
            if (container[k] <= container[0]){
                min1 = container[k];
            }
        }
        for (int k = 0; k < container.length; k++) {
            if (container[k] <= container[0] && container[k] != min1){
                min2 = container[k];
            }
        }
        System.out.println(min1 + " " + min2);
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
                }
                container[container.length - 1] = 0;
            }
        }
        return container;
    }

    public static int summArray(int[] container){
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
