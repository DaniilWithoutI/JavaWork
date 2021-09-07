package operators;

import java.util.Scanner;
//перевод в байты или килобайты
public class HomeWork4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы хотите перевод в байты или в килобайты? Введите Байт или Килобайт соответственно: ");
        String a = scan.nextLine();
        boolean equals1 = a.equals("Байт");
        boolean equals2 = a.equals("Килобайт");
        System.out.println("Введите число: ");
        double b = scan.nextDouble();
        double c = 0;
        if (equals1){
            c = b * 1024;
        }
        if(equals2)
        {
            c = b / 1024;
        }
        System.out.println(c);
    }
}
