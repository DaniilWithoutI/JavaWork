package home_work_5;

import home_work_5.Student;
import home_work_5.comparators.StudentAgeComparator;
import home_work_5.comparators.StudentMarkComparator;
import home_work_5.comparators.StudentNameComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StudentWithUglyNameMain {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<Student> filteredStudents = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            char[] nameChar = new char[ThreadLocalRandom.current().nextInt(3, 10)];
            for (int j = 0; j < nameChar.length; j++) {
                nameChar[j] = (char)ThreadLocalRandom.current().nextInt(65, 122);
            }
            String name = new String(nameChar);
            int age = ThreadLocalRandom.current().nextInt(7, 17 + 1);
            double mark = ThreadLocalRandom.current().nextDouble(0.0, 10.0);
            boolean isOlympiad = ThreadLocalRandom.current().nextBoolean();
            students.add(new Student(i, name, age, mark, isOlympiad));
            if (students.get(i).getMark() > 8 || students.get(i).getAge() >= 12){
                filteredStudents.add(students.get(i));
            }
        }

        StudentMarkComparator markComparator = new StudentMarkComparator();
        StudentAgeComparator ageComparator = new StudentAgeComparator();
        StudentNameComparator nameComparator = new StudentNameComparator();

//        От меньшего к большему по имени.
        System.out.println("Сортировка по имени:");
        filteredStudents.sort(nameComparator);
        for (int i = 0; i < 10; i++) {
            System.out.println(filteredStudents.get(i).toString());
        }

//          От большего к меньшему по оценке.
        System.out.println();
        System.out.println("Сортировка по оценкам:");
        filteredStudents.sort(markComparator);
        for (int i = filteredStudents.size() - 1; i > filteredStudents.size() - 11; i--) {
            System.out.println(filteredStudents.get(i).toString());
        }

        System.out.println();
        System.out.println("Сортировка по возрасту и оценкам:");
        filteredStudents.sort(ageComparator.thenComparing(markComparator));
        for (int i = 7; i <= 17; i++) {
            System.out.println();
            System.out.println("Tоп 10 для " + i + "-летних студентов: ");
            for (int j = filteredStudents.size() - 1; j >= 0; j--) {
                if (filteredStudents.get(j).getAge() == i){
                    for (int k = j; k > j - 10; k--) {
                        System.out.println(filteredStudents.get(k).toString());
                    }
                    break;
                }
            }
        }
    }
}
