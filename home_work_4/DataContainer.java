package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T>{
    private T[] data;

    public DataContainer(T[] data){
        this.data = data;
    }

    @Override
    public String toString() {
        if (this.data.length == 0){
            return "DataContainer = {}";
        }
        StringBuilder result = new StringBuilder();
        boolean needComma = false;
        for (T datum: this.data) {
            if (datum != null){
                if (!needComma){
                    needComma = true;
                } else{
                result.append(",");
                }
                result.append(datum);
            }
        }
        return "DataContainer = {" + result + "}";
    }

    int add(T item){
        if (item == null){
           return -1;
        }
        int index = 0;
        boolean check = false;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null){
                this.data[i] = item;
                index = i;
                check = true;
                break;
            }
        }
        if(!check) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
            index = add(item);
        }
        return index;
        }

        T get(int index){
        if(index < 0 || index > this.data.length - 1){
            return null;
        } else return this.data[index];
        }

        T[] getItems(){
            return this.data;
        }

        boolean delete(int index){
            if(index >= 0 && index < this.data.length){
                this.data[index] = null;
                for (int i = index; i < this.data.length - 1; i++) {
                    this.data[i] = this.data[i + 1];
                }
                this.data = Arrays.copyOf(this.data, this.data.length - 1);
                return true;
            } else {
                return false;
            }
        }

        boolean delete(T item){
            for (int i = 0; i < this.data.length - 1; i++) {
                if (this.data[i] == item){
                    this.data[i] = null;
                    int index = i;
                    for (int j = index; j < this.data.length - 1; j++) {
                        this.data[j] = this.data[j + 1];
                    }
                    this.data = Arrays.copyOf(this.data, this.data.length - 1);
                    return true;
                }
            }
            return false;
        }

        void sort(Comparator<T> comparator){
                boolean isSorted;
                do {
                    isSorted = true;
                    for (int i = 1; i < this.data.length; i++) {
                        int cmp = comparator.compare(this.data[i - 1], this.data[i]);
                        if (cmp > 0){
                            T tmp = this.data[i];
                            this.data[i] = this.data[i-1];
                            this.data[i - 1] = tmp;
                            isSorted = false;
                        }
                    }
                } while (!isSorted);
        }
    }
