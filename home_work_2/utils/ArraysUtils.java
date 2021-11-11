package home_work_2.utils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysUtils {
    /**
     * Заполняет массив из консоли
     * @return заполненный массив
     */
    public static int[] arrayFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int length = scan.nextInt();
        int[] container = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Значение " + i + "-ого элемента массива:");
            container[i] = scan.nextInt();
        }
        return container;
    }

    /**
     * заполняет массив рандомными значениями
     * @param size размер массива
     * @param maxValueExclusion максимальное значение элемента
     * @return заполненный массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] container = new int[size];
        for (int i = 0; i < size; i++) {
            container[i] = ThreadLocalRandom.current().nextInt(0, maxValueExclusion);
        }
        return container;
    }
}
