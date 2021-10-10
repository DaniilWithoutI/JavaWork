package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtend;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private  long count = 0;

    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtend calc3;

    public CalculatorWithCounterAutoComposite (CalculatorWithOperator calc) {
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy calc) {
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtend calc) {
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calc;
    }

    public double plus (double a, double b){
        incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.plus(a, b);
        } else if (this.calc2 != null){
            return this.calc2.plus(a, b);
        } else {
            return  this.calc3.plus(a, b);
        }
    }

    public double minus (double a, double b){
        incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.minus(a, b);
        } else if (this.calc2 != null){
            return this.calc2.minus(a, b);
        } else {
            return  this.calc3.minus(a, b);
        }
    }

    public double add (double a, double b){
        incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.add(a, b);
        } else if (this.calc2 != null){
            return this.calc2.add(a, b);
        } else {
            return  this.calc3.add(a, b);
        }
    }

    public double div (double a, double b){
        incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.div(a, b);
        } else if (this.calc2 != null){
            return this.calc2.div(a, b);
        } else {
            return  this.calc3.div(a, b);
        }
    }

    public double abs (double a){
        incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.abs(a);
        } else if (this.calc2 != null){
            return this.calc2.abs(a);
        } else {
            return  this.calc3.abs(a);
        }
    }

    public double pow (double a, int b){
        incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.pow(a, b);
        } else if (this.calc2 != null){
            return this.calc2.pow(a, b);
        } else {
            return  this.calc3.pow(a, b);
        }
    }

    public double sqrt (double a){
        incrementCountOperation();
        if (this.calc1 != null){
            return this.calc1.sqrt(a);
        } else if (this.calc2 != null){
            return this.calc2.sqrt(a);
        } else {
            return  this.calc3.sqrt(a);
        }
    }

    public void incrementCountOperation () {
        this.count++;
    }

    public long getCountOperation () {
        return this.count;
    }
}
