package operators;

import java.util.Scanner;
//нахождение среднего числа
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
if ((a > b && a < c) || (a < b && a > c)){
    System.out.println(a);
} else if ((b > a && b < c) || (b < a && b > c)){
    System.out.println(b);
} else if(a == b || b == c || a == c){
    System.out.println("Error!");
} else{
    System.out.println(c);
}
    }
}
