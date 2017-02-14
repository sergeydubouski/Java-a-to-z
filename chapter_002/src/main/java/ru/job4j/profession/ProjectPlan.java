package ru.job4j.profession;

/**
 * ProjectPlan class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class ProjectPlan {
    final String projectLead;
    final int teamMembers;
    final int budget;

    public ProjectPlan(String projectLead, int teamMembers, int budget) {
        this.projectLead = projectLead;
        this.teamMembers = teamMembers;
        this.budget = budget;
    }

    public final String projectSize() {
        String size;

        if (this.budget < 5000000) {
            size = "small";
        } else if (this.budget > 5000000 && this.budget < 10000000) {
            size = "middle";
        } else {
            size = "big";
        }
        return size;
    }

}
