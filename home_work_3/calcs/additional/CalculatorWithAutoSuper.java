package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtend;

public class CalculatorWithAutoSuper extends CalculatorWithMathExtend {
    private long count = 0;

    @Override
    public double plus(double a, double b) {
        this.count++;
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        count++;
        return super.minus(a, b);
    }

    @Override
    public double add(double a, double b) {
        this.count++;
        return super.add(a, b);
    }

    @Override
    public double div(double a, double b) {
        this.count++;
        return super.div(a, b);
    }

    @Override
    public double pow(double a, int b) {
        this.count++;
        return super.pow(a, b);
    }

    @Override
    public double abs(double a) {
        this.count++;
        return super.abs(a);
    }

    @Override
    public double sqrt(double a) {
        this.count++;
        return super.sqrt(a);
    }

    public long getCountOperation(){
        return this.count;
    }

}
