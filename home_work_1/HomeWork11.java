package operators;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scan.nextLine();
      switch(name){
          case "Вася":
          case "Анастасия":
              System.out.println("Привет!\nЯ тебя так долго ждал.");
              break;
          default:
              System.out.println("Добрый день, а вы кто?");
      }
    }
}
