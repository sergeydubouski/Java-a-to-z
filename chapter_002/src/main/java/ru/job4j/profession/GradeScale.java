package ru.job4j.profession;

/**
 * GradeScale class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class GradeScale {
    int[] grade;

    public GradeScale(int elementaryGrade, int highSchoolGrade, int universityGrade) {
        this.grade[0] = elementaryGrade;
        this.grade[1] = highSchoolGrade;
        this.grade[2] = universityGrade;
    }

    public final int scale(int i) {
        return grade[i];
    }
}
