package home_work_4.comparators;

import java.util.Comparator;

public class DataContainerNumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
