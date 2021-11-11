package home_work_2.loops;

public class HomeWork2 {

    /**
     * Находит факториал
     * @param number - число
     * @return факториал числа
     */
    public static long factorial(int number){
        if (number < 0){
            return 0;
        } else if (number == 1){
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
