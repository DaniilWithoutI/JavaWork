package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double plus (double a, double b){
        return a + b;
    }

    public double minus (double a, double b){
        return a - b;
    }

    public double add (double a, double b){
        return a * b;
    }

    public double div (double a, double b){
        return a / b;
    }

    public double pow (double a, int b){
        double result = 1;

        for (int i = 0; i < abs(b); i++) {
            result *= a;
        }

        if (b >= 0){
            return result;
        } else {
            return 1 / result;
        }
    }

    public double sqrt (double a){
        return Math.sqrt(a);
    }

    public double abs (double a){
        return a < 0 ? -a : a;
    }
}
