package loops;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        if (number < 1){
            System.out.println("Дурачок");
            return;
        } else if (number == 1){
            System.out.println(1);
            return;
        }
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
                if(i < number) {
                    System.out.print(i + " * ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.print(" = " + result);
    }
}
