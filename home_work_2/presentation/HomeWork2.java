package home_work_2.presentation;

import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите объем выборки:");
        int number = scan.nextInt();
        int max = 0;
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int randN = rand.nextInt();
            if (randN % 2 == 0) {
                max++;
            }
        }
        System.out.println("Вероятность выпадения четного числа: " + (float) max/number*100 + "%");
    }
}
