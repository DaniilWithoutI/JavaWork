package home_work_1.presentation;

import java.util.InputMismatchException;
import java.util.Scanner;
//перевод в байты или килобайты
public class HomeWork4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы хотите перевод в байты или в килобайты? Введите Байт или Килобайт соответственно: ");
        String a = scan.nextLine();
        System.out.println("Введите число: ");
        double b = scan.nextDouble();
        double c;
        if ("Байт".equals(a)){
            c = b * 1024;
        }else if("Килобайт".equals(a)) {
            c = b / 1024;
        } else{
            throw new InputMismatchException("Ты ввел что-то не то.");
        }
        System.out.println(c);
    }
}
