package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + i + "-ого элемента массива:");
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("\nЭлементы, которые меньше среднего арифметического: ");
        for (int j : arr) {
            if (j < (float)sum / arr.length) {
                System.out.print(j + " ");
            }
        }
    }
}
