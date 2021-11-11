package home_work_1.presentation;

import java.util.Scanner;
//нахождение среднего числа
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число а:");
        int a = scan.nextInt();
        System.out.println("Введите число b:");
        int b = scan.nextInt();
        System.out.println("Введите число c:");
        int c = scan.nextInt();

        if(a == b || b == c || c ==a){
        throw new ArithmeticException("Невозможно определить среднее.");
        }

        if ((a > b && a < c) || (a < b && a > c)){
            System.out.println(a);
        } else if ((b > a && b < c) || (b < a && b > c)){
            System.out.println(b);
        } else{
            System.out.println(c);
        }
    }
}
