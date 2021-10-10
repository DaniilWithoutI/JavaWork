package home_work_2.loops;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i < number) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }
        }
        System.out.println(factorial(number));
    }

    public static long factorial(int number){
        if (number < 0){
            return 0;
        } else if (number == 1){
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
