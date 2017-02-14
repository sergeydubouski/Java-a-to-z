package ru.job4j.profession;

/**
 * Profession class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Profession {

   final int yearsOfExperience;
   final String university;

   public Profession(int yearsOfExperience, String university){
       this.yearsOfExperience = yearsOfExperience;
       this.university = university;
   }

    public final boolean mentorJuniors() {
        return yearsOfExperience > 5;
    }
}
