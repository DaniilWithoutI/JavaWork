package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtend;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtend {

    private long count = 0;

    public void incrementCountOperation(){
        this.count++;
    }

    public long getCountOperation(){
        return this.count;
    }
}
