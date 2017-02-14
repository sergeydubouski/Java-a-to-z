package ru.job4j.profession;

/**
 * Student class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Student {
    final String name;
    final int age;
    final int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public final String doHomeWork() {

        return "Home work is done!";
    }

    public final String getName() {
        return this.name;
    }

}
