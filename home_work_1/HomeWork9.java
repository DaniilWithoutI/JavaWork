package operators;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scan.nextLine();
        if("Вася".equals(name) || "Анастасия".equals(name)){
            System.out.println("Привет!\nЯ тебя так долго ждал.");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
