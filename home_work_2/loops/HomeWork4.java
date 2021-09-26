package loops;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number1 = scan.nextDouble();
        System.out.println("Введите степень: ");
        double number2 = scan.nextDouble();
        if (number2 < 0 || number2 % 1 != 0){
    System.out.println("Глупенький");
    return;
}
        double result = number1;
        for (int i = 0; i < number2 - 1; i++) {
 result *= number1;
        }
        System.out.println(number1 + " ^ " + number2 + " = " + result);
    }
}
