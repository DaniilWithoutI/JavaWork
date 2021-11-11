package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * Складывет два числа
     * @param a первое число
     * @param b второе число
     * @return сумму
     */
    double plus (double a, double b);

    /**
     * Находит разность двух чисел
     * @param a То, откуда вычитаем
     * @param b то, что вычитаем
     * @return разность
     */
    double minus (double a, double b);

    /**
     * Умножает два числа
     * @param a первое число
     * @param b второе число
     * @return произведение
     */
    double add (double a, double b);

    /**
     * Делит два числа
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    double div (double a, double b);

    /**
     * находит модуль числа
     * @param a число
     * @return модуль числа
     */
    double abs (double a);

    /**
     * возводит число в степень
     * @param a число
     * @param b степень
     * @return искомое значение
     */
    double pow (double a, int b);

    /**
     * Находит корень числа
     * @param a число
     * @return корень
     */
    double sqrt (double a);
}
