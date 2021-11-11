package home_work_1.presentation;

import java.util.Scanner;
//проверка на делимость
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите делимое число: ");
        int a = scan.nextInt();
        System.out.println("Введите делитель: ");
        int b = scan.nextInt();
        int c;
        if (a % b == 0){
            System.out.println("Делится");
            c = a / b;
        } else {
            System.out.println("Не делится");
            c = a / b;
            int d = a % b;
            System.out.println("Остаток: " + d);
        }
        System.out.println("Частное: " + c);
    }
}
