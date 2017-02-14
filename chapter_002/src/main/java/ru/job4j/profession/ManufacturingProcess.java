package ru.job4j.profession;

/**
 * ManufacturingProcess class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class ManufacturingProcess {
    boolean[] processFlow;
    final int cycleTime;

    public ManufacturingProcess(boolean machine, boolean wash, boolean ecd, int cycleTime) {
        this.processFlow[0] = machine;
        this.processFlow[1] = wash;
        this.processFlow[2] = ecd;
        this.cycleTime = cycleTime;
    }

    public final int totalCycleTime() {
        int time = 0;
        for (boolean x : processFlow) {
            if (x = true) {
                time += 8;
            }
        }
        return time;
    }
}
