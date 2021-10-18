package home_work_5;

public class Student {
    private final int serialNumber;
    private final String name;
    private final int age;
    private final double mark;
    private final boolean olympiad;

    public Student(int serialNumber, String name, int age, double mark, boolean isOlympiad){
        this.serialNumber = serialNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.olympiad = isOlympiad;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public boolean olympiad() {
        return olympiad;
    }

    @Override
    public String toString() {
        return "Student " + serialNumber + ": {" + name + ", " + age + ", " + mark + ", " + olympiad + "}";
    }
}
