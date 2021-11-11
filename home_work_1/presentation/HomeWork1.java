package home_work_1.presentation;
import java.util.Scanner;
// Проверка четности двух чисел
public class HomeWork1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число а:");
        int a = scan.nextInt();
        System.out.println("Введите число b:");
        int b = scan.nextInt();

        if (a % 2 == b % 2){
            throw new ArithmeticException("Числа с одинаковой четностью.");
        }

        if(a % 2 == 0){
            System.out.println(a + " четное");
        } else{
            System.out.println(b + " четное");
        }

    }
}