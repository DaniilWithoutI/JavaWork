package home_work_2.arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhileArrray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        System.out.println("Введите максимальное значение: ");
        int maxValueExclusion = scan.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);

        int i = 0;
       do{
           System.out.print(container[i] + " ");
           i++;
       } while (i < container.length);

        System.out.println();
        i = 1;
        do{
                System.out.print(container[i] + " ");
            i += 2;
        } while (i < container.length);

        System.out.println();
        i = container.length - 1;
        do{
                System.out.print(container[i] + " ");
            i--;
        } while (i >= 0);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = ThreadLocalRandom.current().nextInt(0, maxValueExclusion + 1);
        }
        return container;
    }
}
