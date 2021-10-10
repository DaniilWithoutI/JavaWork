package home_work_2.loops;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        if(scan.hasNextLong()){
            long value = scan.nextLong();
            long result = 1;
            long number = value;
            int i = 0 ;
            do {
                number = number / 10;
                i++;
            } while (number != 0);
            number = value;
            long[] array = new long[i];
            for (int j = array.length - 1; j > -1; j--) {
                array[j] = number % 10;
                number /= 10;
            }
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k]);
                if(k != array.length - 1){
                    System.out.print(" * ");
                }
                result *= array[k];
            }
            System.out.println(" = " + result);
        } else if(scan.hasNextDouble()){
            System.out.println("Введено не целое число");
        } else {
            System.out.println("Введено не число");
        }
    }
}
