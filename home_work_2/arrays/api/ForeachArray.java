package home_work_2.arrays.api;

public class ForeachArray implements IArraysOperation {
    @Override
    public String outInConsole(int[] container) {
        StringBuilder result = new StringBuilder();
        for (int value : container) {
            result.append(value).append(" ");
        }
        return result.toString();
    }

    @Override
    public String everySecond(int[] container) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        for (int value : container) {
            if (i % 2 != 0) {
                result.append(value).append(" ");
            }
            i++;
        }
        return result.toString();
    }

    @Override
    public String reverse(int[] container) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (int value : container) {
            for (int index : container) {
                if (index == container[container.length - (i + 1)]) {
                    value = container[container.length - (i + 1)];
                    break;
                }
            }
            result.append(value).append(" ");
            i++;
        }
        return result.toString();
    }
}
