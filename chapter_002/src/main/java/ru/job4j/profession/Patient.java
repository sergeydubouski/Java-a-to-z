package ru.job4j.profession;

/**
 * Patient class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Patient {
    final String name;
    final String gender;
    final int age;

    public Patient(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public final int importanceOfCheckUp() {
        if (age > 65) {
            return 1;
        } else {
            return 0;
        }
    }
}
