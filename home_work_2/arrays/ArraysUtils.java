package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));
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
        return container;
    }
}
