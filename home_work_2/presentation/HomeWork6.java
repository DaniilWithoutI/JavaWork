package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        int invNumber = 0;
        while (number > 0){
            invNumber *= 10;
            int naturalNumber = number % 10;
            invNumber += naturalNumber;
            number /= 10;
        }
        System.out.println("Инвертированный результат: " + invNumber);
    }
}
