package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import home_work_3.calcs.simple.CalculatorWithMathExtend;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
//        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
//        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathExtend calculatorWithMathExtend = new CalculatorWithMathExtend();

//        CalculatorWithCounterAutoCompositeInterface calc = new CalculatorWithCounterAutoCompositeInterface(calculatorWithMathCopy);
//        CalculatorWithCounterAutoCompositeInterface calc = new CalculatorWithCounterAutoCompositeInterface(calculatorWithOperator);
        CalculatorWithCounterAutoCompositeInterface calc = new CalculatorWithCounterAutoCompositeInterface(calculatorWithMathExtend);

        double result, a, b, c, d;
        a = calc.add(15, 7);
        b = calc.plus(a, 4.1);
        c = calc.div(28, 5);
        d = calc.pow(c, 2);
        result = calc.plus(b, d);
        System.out.println("Результат: " + result);
        System.out.println("Количество использований калькулятора: " + calc.getCountOperation());
    }
}
