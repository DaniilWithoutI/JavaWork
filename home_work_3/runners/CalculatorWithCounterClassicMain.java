package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double result, a, b, c, d;
        a = calculator.add(15, 7);
        calculator.incrementCountOperation();
        b = calculator.plus(a, 4.1);
        calculator.incrementCountOperation();
        c = calculator.div(28, 5);
        calculator.incrementCountOperation();
        d = calculator.pow(c, 2);
        calculator.incrementCountOperation();
        result = calculator.plus(b, d);
        calculator.incrementCountOperation();
        System.out.println("Результат: " + result);
        System.out.println("Количество использований калькулятора: " + calculator.getCountOperation());
    }
}
