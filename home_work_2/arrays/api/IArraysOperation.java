package home_work_2.arrays.api;

public interface IArraysOperation {
    /**
     * Выводит все элементы массива
     * @param container массив интов
     * @return String
     */
    String outInConsole(int[] container);

    /**
     * Выводит каждый второй элемент массива
     * @param container массив интов
     * @return String
     */
    String everySecond(int[] container);

    /**
     * Выводит все элементы массива в инвертированном виде
     * @param container массив интов
     * @return String
     */
    String reverse(int[] container);
}
