package operators;
import java.util.Scanner;
// Проверка четности двух чисел
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("Оба числа четные");
        } else if (a % 2 != 0 && b % 2 != 0){
            System.out.println("Оба числа нечетные");
        } else if(a % 2 == 0 && b % 2 != 0){
            System.out.println(a + " четное");
        } else if (b % 2 == 0 && a % 2 != 0){
            System.out.println(b + " четное");
        }

    }
}