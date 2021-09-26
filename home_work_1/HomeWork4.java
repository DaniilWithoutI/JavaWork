package operators;

import java.util.Scanner;
//перевод в байты или килобайты
public class HomeWork4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы хотите перевод в байты или в килобайты? Введите Байт или Килобайт соответственно: ");
        String a = scan.nextLine();
        System.out.println("Введите число: ");
        double b = scan.nextDouble();
        double c = 0;
        if ("Байт".equals(a)){
            c = b * 1024;
        }
        if("Килобайт".equals(a)) {
            c = b / 1024;
        } else{
            System.out.println("Не понимаю, брат.");
            return;
        }
        System.out.println(c);
    }
}
