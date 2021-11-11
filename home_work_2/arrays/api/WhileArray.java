package home_work_2.arrays.api;

public class WhileArray implements IArraysOperation {
    @Override
    public String outInConsole(int[] container) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < container.length) {
            result.append(container[i]).append(" ");
            i++;
        }
        return result.toString();
    }

    @Override
    public String everySecond(int[] container) {
        StringBuilder result = new StringBuilder();
        int i = 1;
        while (i < container.length) {
            result.append(container[i]).append(" ");
            i += 2;
        }
        return result.toString();
    }

    @Override
    public String reverse(int[] container) {
        StringBuilder result = new StringBuilder();
        int i = container.length - 1;
        while (i >= 0) {
            result.append(container[i]).append(" ");
            i--;
        }
        return result.toString();
    }
}
