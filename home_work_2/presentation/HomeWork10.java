package presentation;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + i + "-ого элемента массива:");
            arr[i] = scan.nextInt();
        }
        int min1 = 0, min2 = 0, index = 0;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("\n2 наименьших элемента: ");
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] <= arr[0]){
                min1 = arr[k];
                index = k;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (k != index && arr[k] <= arr[0]){
                min2 = arr[k];
            }
        }
        System.out.print(min1 + ", " + min2);
    }
}
