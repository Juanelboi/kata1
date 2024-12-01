package software.ulpgc;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;
    private final int DaysInYear=365;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                '}';
    }

    private int getAge() {
        return toYears(LocalDate.now().toEpochDay()-birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/DaysInYear);
    }
}
