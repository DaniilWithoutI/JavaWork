package home_work_2.loops;

public class HomeWork4 {
    /**
     * Возводит число в степень
     * @param number1 возводимое число
     * @param number2 значение степени
     * @return полученное значение типа double
     */
    public double abs(double number1, double number2) {
        if (number2 < 0 || number2 % 1 != 0) {
            throw new IllegalArgumentException("Глупый");
        }
        double result = number1;
        for (int i = 0; i < number2 - 1; i++) {
            result *= number1;
        }
        return result;
    }
}
