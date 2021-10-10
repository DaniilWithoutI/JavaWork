package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtend;

public class CalculatorWithMathExtendMain {
    public static void main(String[] args) {
        CalculatorWithMathExtend calculator = new CalculatorWithMathExtend();
        double result = calculator.plus(4.1, calculator.add(15, 7));
        result = calculator.plus(result, calculator.pow(calculator.div(28, 5), 2));
        System.out.println(result);
    }
}
