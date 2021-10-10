package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtend;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
//        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
//        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathExtend calculatorWithOperator = new CalculatorWithMathExtend();

//        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(calculatorWithMathCopy);
//        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(calculatorWithOperator);
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(calculatorWithOperator);

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
