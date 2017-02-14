package ru.job4j.profession;

/**
 * ProductSpec class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class ProductSpec {

    int[] parameters;

    public ProductSpec(int hardness, int cleanliness, int surfaceFinish) {
        this.parameters[0] = hardness;
        this.parameters[1] = cleanliness;
        this.parameters[2] = surfaceFinish;
    }

    public final String productComplexity() {
        int total = 0;

        for (int x : parameters) {
            total += x;
        }
        if (total < 800) {
            return "Moderate";
        } else {
            return "Complex";
        }
    }
}
