package ru.job4j.profession;

/**
 * TestResult class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class TestResult {
    final int redBloodCells;
    final int whiteBloodCells;
    final int plateletsCells;

    public TestResult(int redBloodCells, int whiteBloodCells, int plateletsCells) {
        this.redBloodCells = redBloodCells;
        this.whiteBloodCells = whiteBloodCells;
        this.plateletsCells = plateletsCells;
    }

    public final long totalQtyOfCells() {
        return redBloodCells * whiteBloodCells * plateletsCells / 1000000000;
    }

}
