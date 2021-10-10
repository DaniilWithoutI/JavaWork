package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + (i + 1) + "-ого элемента массива:");
            arr[i] = scan.nextInt();
            if (arr[i] >= 0 && arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("Сумма четных и положительных элементов массива равна:" + sum);
    }
}
