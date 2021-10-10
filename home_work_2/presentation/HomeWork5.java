package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимум:");
        int min = scan.nextInt();
        System.out.println("Введите максимум:");
        int max = scan.nextInt();
        System.out.println("Введите интервал:");
        int shag = scan.nextInt();
        for (int i = min; i <= max; i += shag) {
            System.out.print(i + " ");
        }
    }
}
