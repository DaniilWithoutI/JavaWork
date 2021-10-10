package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scan.nextInt();
        System.out.println("Введите нижнее значение интервала:");
        int a = scan.nextInt();
        System.out.println("Введите верхнее значение интервала:");
        int b = scan.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + i + "-ого элемента массива:");
            arr[i] = scan.nextInt();
        }
        System.out.println("Исходный массив: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && b >= arr[i]){
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                    i = 0;
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println("\nСжатый массив: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
