package home_work_1;

import java.util.List;

public class Methods {
    /**
     * Метод отвечает на вопрос, можно ли спать
     * @param weekday - переменная определяющая рабочий ли сейчас день
     * @param vacation - переменная определяющая выходной ли сейчас день
     * @return true or false
     * @Throws:
     * IllegalArgumentException – Если оба переданных параметра true.
     */
    public boolean sleepln(boolean weekday, boolean vacation) {
        if (weekday && vacation) {
            throw new IllegalArgumentException("Так отпуск или рабочий день?");
        }
        boolean sleep;
        if (vacation) {
            sleep = true;
        } else {
            sleep = !weekday;
        }
        return sleep;
    }

    /**
     * Преобразует коллекцию в строку типа (XXX)XXXX-XXX
     * @param phoneNumber- коллекция цифр
     * @param <T>- тип переданной коллекции
     * @return String
     * @throws IllegalArgumentException если в коллекции не хватает элементов
     *                                  если в элементе больше 2 цифр
     */
    public <T> String createPhoneNumber(List<T> phoneNumber) {
        if (phoneNumber.size() != 10) {
            throw new IllegalArgumentException("Не хватает цифр");
        }

//        for (T number : phoneNumber) {
//            if (number.toString().toCharArray().length != 1) {
//                throw new IllegalArgumentException("Неправильные значения");
//            }
//        }

        phoneNumber.stream().forEach(number -> {
            if (number.toString().length() != 1) {
                throw new IllegalArgumentException("Неправильные значения");
            }
        });

        StringBuilder builder = new StringBuilder();

        builder.append("(");
        for (T aNative : phoneNumber) {
            builder.append(aNative);
            if (phoneNumber.indexOf(aNative) == 2) {
                builder.append(")");
            } else if (phoneNumber.indexOf(aNative) == 6) {
                builder.append("-");
            }
        }
        return builder.toString();
    }

    /**
     * Преобразует число из десятичного в двоичный код.
     * @param number- число в десятичном виде
     * @return двоичное представление number
     */
    public String toBinaryString(byte number) {
        byte simpleNumber;
        StringBuilder builder = new StringBuilder();
        boolean isNegative = false;

        while (number != 0) {
            if (number < 0) {
                number = (byte) (~number);
                isNegative = true;
            }
            simpleNumber = (byte) (number % 2);
            builder.append(simpleNumber);
            number = (byte) (number / 2);
        }

        while (builder.length() < 8) {
            builder.append("0");
        }

        if (isNegative) {
            char[] sub = builder.toString().toCharArray();
            for (int i = 0; i < sub.length; i++) {
                if (sub[i] == '0') {
                    sub[i] = '1';
                } else {
                    sub[i] = '0';
                }
                builder.replace(i, i + 1, String.valueOf(sub[i]));
            }
        }

        return builder.reverse().toString();
    }
}
