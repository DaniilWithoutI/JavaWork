package home_work_2.arrays.api;

public class DoWhileArrray implements IArraysOperation {
    @Override
    public String outInConsole(int[] container) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        do {
            result.append(container[i]).append(" ");
            i++;
        } while(i<container.length);
        return result.toString();
    }

    @Override
    public String everySecond(int[] container) {
        StringBuilder result = new StringBuilder();
        int i = 1;
        do {
            result.append(container[i]).append(" ");
            i += 2;
        } while(i<container.length);
        return result.toString();
    }

    @Override
    public String reverse(int[] container) {
        StringBuilder result = new StringBuilder();
        int i =container.length -1;
        do {
            result.append(container[i]).append(" ");
            i--;
        } while(i >=0);
        return result.toString();
    }
}
