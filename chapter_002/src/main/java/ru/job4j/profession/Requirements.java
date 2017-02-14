package ru.job4j.profession;

/**
 * Requirements class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Requirements {

    final int totalRequirements;
    final String productName;
    final String country;

    public Requirements(int totalRequirements, String productName, String country) {
        this.totalRequirements = totalRequirements;
        this.productName = productName;
        this.country = country;
    }

    public final int timeToDevelop() {
        if (this.totalRequirements > 100) {
            return 160; //hours
        } else return 80;
    }
}
