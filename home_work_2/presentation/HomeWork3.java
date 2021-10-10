package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        int chet = 0, nechet = 0;
        while (number > 0){
            int naturalNumber = number % 10;
            if (naturalNumber % 2 == 0){
                chet++;
            } else {
                nechet++;
            }
            number /= 10;
        }
        System.out.println("Кол-во четных цифр: " + chet);
        System.out.println("Кол-во нечетных цифр: " + nechet);
    }
}
