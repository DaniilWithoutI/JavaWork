package operators;

import java.util.Scanner;
//проверка кода символа
public class HomeWork5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите код символа:");
        int a = scan.nextInt();
        char b = (char) a;
        if (a >= 65 && a <= 90 || a >= 97 && a <= 122){
            System.out.println("Символ " + b + " принадлежит английскому алфавиту.");
        } else {
            System.out.println("Символ " + b + " не принадлежит английскому алфавиту.");
        }
    }
}
