package home_work_3.calcs.simple;

public class CalculatorWithMathExtend extends CalculatorWithOperator{
    @Override
    public double pow (double a, int b){
        return Math.pow(a, b);
    }

    @Override
    public double sqrt (double a){
        return Math.sqrt(a);
    }

    @Override
    public double abs (double a){
        return Math.abs(a);
    }
}
