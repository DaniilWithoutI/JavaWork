package home_work_2.presentation;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scan.nextInt();
        int max = 0;
        while (number > 0){
           int naturalNumber = number % 10;
           if (naturalNumber >= max){
               max = naturalNumber;
           }
           number /= 10;
        }
        System.out.println("Наибольшая цифра: " + max);
    }
}
