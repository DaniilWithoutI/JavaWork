package home_work_2.loops;

import java.util.Scanner;

public class HomeWork3 {
    /**
     * Последовательно перемножает все элементы массива
     * @param parts - массив цифр
     * @return Произведение
     * @throws IllegalArgumentException - если передано число, а не цифра
     */
    public long addAllParts(long... parts){
        long add = 1;

        for (int i = 0; i < parts.length; i++) {
            long part = parts[i];
            if(part > 9 || part < -9){
                throw new IllegalArgumentException("Передано число, а не цифра");
            }
            add *= part;
        }

        return add;
    }

    /**
     * Преобразует строку в число типа long
     * @param line - строка
     * @return число
     * @throws IllegalArgumentException - если введено не целое число
     *                                  - если введено не число
     */
    public long parseInput(String line){
        Scanner sc = new Scanner(line);

        if(sc.hasNextLong()){
            return sc.nextLong();
        } else if(sc.hasNextDouble()){
            throw new IllegalArgumentException("Введено не целое число");
        } else {
            throw new IllegalArgumentException("Введено не число");
        }
    }

    /**
     * Делит число на цифры и записывает в массив
     * @param number - число
     * @return массив цифр типа long[]
     */
    public long[] numberToParts(long number){
        int partsCount = 0 ;

        long tmp = number;
        do {
            tmp = tmp / 10;
            partsCount++;
        } while (tmp != 0);

        long[] parts = new long[partsCount];

        for (int i = parts.length - 1; i > -1; i--) {
            parts[i] = number % 10;
            number /= 10;
        }

        return parts;
    }

    /**
     * Преобразует полученные значения в строку
     * @param parts массив цифр
     * @param result произведение всех элементов массива
     * @return строку формата result = parts[0] + parts[1] + ... + parts[n]
     */
    public String format(long[] parts, long result){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            builder.append(parts[i]);
            if(i != parts.length - 1){
                builder.append(" * ");
            }
        }
        builder.append(" = ").append(result);
        return builder.toString();
    }
}
