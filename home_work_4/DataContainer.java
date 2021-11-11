package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = Arrays.copyOf(data, data.length);
    }

    /**
     * Выводит массив в виде строки
     * @return строку типа DataContainer = {x, x, x, x, ...}
     */
    @Override
    public String toString() {
        if (this.data.length == 0) {
            return "DataContainer = {}";
        }
        StringBuilder result = new StringBuilder();
        boolean needComma = false;
        for (T datum : this.data) {
            if (datum != null) {
                if (!needComma) {
                    needComma = true;
                } else {
                    result.append(",");
                }
                result.append(datum);
            }
        }
        return "DataContainer = {" + result + "}";
    }

    /**
     * Добавляет элемент в массив, расширяя его, если все ячейки заполнены
     * @param item добавляемый элемент
     * @return индекс добавленного элемента
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }
        int index = 0;
        boolean check = false;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                index = i;
                check = true;
                break;
            }
        }
        if (!check) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
            index = add(item);
        }
        return index;
    }

    /**
     * Возвращает элемент по его индексу
     * @param index номер элемента
     * @return элемент
     */
    public T get(int index) {
        if (index < 0 || index > this.data.length - 1) {
            return null;
        } else {
            return this.data[index];
        }
    }

    /**
     * Возвращает массив
     * @return container[]
     */
    public T[] getItems() {
        return Arrays.copyOf(this.data, this.data.length);
    }

    /**
     * Удаляет элемент по индексу, сжимая массив
     * @param index номер элемента
     * @return true, если элемент был найден и удален
     */
    public boolean delete(int index) {
        if (index >= 0 && index < this.data.length) {
            this.data[index] = null;
            if (this.data.length - 1 - index >= 0)
                System.arraycopy(this.data, index + 1, this.data, index, this.data.length - 1 - index);
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Удаляет элемент по значению, сжимая массив
     * @param item значение элемента
     * @return true, если элемент был найден и удален
     */
    public boolean delete(T item) {
        for (int i = 0; i < this.data.length - 1; i++) {
            if (Objects.equals(this.data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Сортирует массив
     * @param comparator компаратор
     */
    public void sort(Comparator<T> comparator) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 1; i < this.data.length; i++) {
                int cmp = comparator.compare(this.data[i - 1], this.data[i]);
                if (cmp > 0) {
                    T tmp = this.data[i];
                    this.data[i] = this.data[i - 1];
                    this.data[i - 1] = tmp;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }
}
