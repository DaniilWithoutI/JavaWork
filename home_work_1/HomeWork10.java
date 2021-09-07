package operators;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String Name = scan.nextLine();
        boolean equals1 = Name.equals("Вася");
        boolean equals2 = Name.equals("Анастасия");
        if(equals1){
            System.out.println("Привет!\nЯ тебя так долго ждал.");
        } else if(equals2){
            System.out.println("Привет!\nЯ тебя так долго ждал.");
        } else{
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
