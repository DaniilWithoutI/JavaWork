package home_work_5.comparators;

import home_work_5.Student;

import java.util.Comparator;
import java.util.Objects;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        } else if (Objects.equals(o1.getAge(), o2.getAge())){
            thenComparing(this);
            return 0;
        } else {
            return -1;
        }
    }
}
