package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtend;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterface {
    private  long count = 0;

    private final ICalculator calc;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calc) {
        this.calc = calc;
    }

    public double plus (double a, double b){
        incrementCountOperation();
        return this.calc.plus(a, b);
    }

    public double minus (double a, double b){
        incrementCountOperation();
        return this.calc.minus(a, b);
    }

    public double add (double a, double b){
        incrementCountOperation();
        return this.calc.add(a, b);
    }

    public double div (double a, double b){
        incrementCountOperation();
        return this.calc.div(a, b);
    }

    public double abs (double a){
        incrementCountOperation();
        return this.calc.abs(a);
    }

    public double pow (double a, int b){
        incrementCountOperation();
        return this.calc.pow(a, b);
    }

    public double sqrt (double a){
        incrementCountOperation();
        return this.calc.sqrt(a);
    }

    public void incrementCountOperation () {
        this.count++;
    }

    public long getCountOperation () {
        return this.count;
    }
}
