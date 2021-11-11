package home_work_2.loops;

public class HomeWork1 {
    /**
     * Находит факториал числа и выводит в виде строки
     * @param number - число
     * @return Строку вида 1 * 2 * 3 * 4 * 5 = 120
     */
    public String numberAdd(int number) {
        if (number == 1) {
            return "result = 1";
        } else if (number < 0){
            number = -number;
        }

        StringBuilder builder = new StringBuilder();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
            if (i < number) {
                builder.append(i).append(" * ");
            } else {
                builder.append(i);
            }
        }
        return builder + " = " + result;
    }
}
