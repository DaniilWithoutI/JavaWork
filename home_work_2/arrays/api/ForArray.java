package home_work_2.arrays.api;

public class ForArray implements IArraysOperation {
    @Override
    public String outInConsole(int[] container) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < container.length; i++) {
            result.append(container[i]).append(" ");
        }
        return result.toString();
    }

    @Override
    public String everySecond(int[] container) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < container.length; i += 2) {
            result.append(container[i]).append(" ");
        }
        return result.toString();
    }

    @Override
    public String reverse(int[] container) {
        StringBuilder result = new StringBuilder();
        for (int i = container.length - 1; i >= 0; i--) {
            result.append(container[i]).append(" ");
        }
        return result.toString();
    }
}

