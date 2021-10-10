package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithAutoSuper;

public class CalculatorWithAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithAutoSuper calculator = new CalculatorWithAutoSuper();
        double result, a, b, c, d;
        a = calculator.add(15, 7);
        b = calculator.plus(a, 4.1);
        c = calculator.div(28, 5);
        d = calculator.pow(c, 2);
        result = calculator.plus(b, d);
        System.out.println("Результат: " + result);
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperation());
    }
}
