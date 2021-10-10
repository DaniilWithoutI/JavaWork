package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + i + "-ого элемента массива:");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("\nНаибольший элемент массива с четным индексом равен: " + max);
    }
}
