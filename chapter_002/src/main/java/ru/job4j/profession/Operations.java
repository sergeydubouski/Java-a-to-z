package ru.job4j.profession;

/**
 * Operations class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Operations {
    boolean[] operation;

    public Operations(boolean machining, boolean ecd, boolean grinding, boolean wash) {
        this.operation[0] = machining;
        this.operation[1] = ecd;
        this.operation[2] = grinding;
        this.operation[3] = wash;
    }

    public final int totalTime() {
        int time = 0;
        for (boolean x : operation) {
            if (x == true) time += 8;
        }
        return time;
    }
}
