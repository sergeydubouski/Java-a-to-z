package ru.job4j.profession;

/**
 * Teacher class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Teacher extends Profession {
    final String specialty;
    private final int preferedGrade;
    final boolean provideHomeSchooling;


    public Teacher(int yearsOfExperience, String university, String specialty, int preferedGrade, boolean provideHomeSchooling) {
        super(yearsOfExperience = yearsOfExperience, university = university);
        this.specialty = specialty;
        this.preferedGrade = preferedGrade;
        this.provideHomeSchooling = provideHomeSchooling;
    }

    public final int getPreferedGrade() {

        return preferedGrade;
    }

    public final String prepareClass(Library lib) {
        return lib.borrowedBook();
    }

    public final void assignHomeWork(HomeWork homeWork, Student student) {
    }

    public final void checkHomeWork(HomeWork homeWork, Student student) {
    }

    public final String conductExam(Student student) {
        return "Exam is set for " + student.getName();
    }

    public final String evaluateStudent(Student student) {
        return student.doHomeWork();
    }

    public final String tutorStudent(Student student, GradeScale grade, Library lib) {
        if (this.mentorJuniors()) {
            return "Ok";
        } else {
            return "Service is not provided!";
        }
    }


}

