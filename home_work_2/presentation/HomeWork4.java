package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину ряда:");
        int number = scan.nextInt();
        int next = 1, previous = 0;

        for (int i = 0; i < number; i++) {
          int sum = previous + next;
          previous = next;
          next = sum;
            System.out.print(sum + " ");
        }
    }
}
