package ru.job4j.profession;

/**
 * ActionPlan class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class ActionPlan {
    final String item;
    final int teamMembers;
    final int stepsToImplement;

    public ActionPlan(String item, int teamMembers, int stepsToImplement) {
        this.item = item;
        this.teamMembers = teamMembers;
        this.stepsToImplement = stepsToImplement;
    }

    public final int timeToImplement() {
        return this.stepsToImplement * 8; //hours
    }

}
