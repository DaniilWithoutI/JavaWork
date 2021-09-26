package presentation;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + i + "-ого элемента массива:");
            arr[i] = scan.nextInt();
        }
        System.out.println("Исходный массив: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0){
                int naturalNumber = arr[i] % 10;
                sum += naturalNumber;
                arr[i] /= 10;
            }
        }
        System.out.print("\nСумма цифр массива: " + sum);
    }
}
