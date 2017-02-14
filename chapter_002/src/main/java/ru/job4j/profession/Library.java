package ru.job4j.profession;

/**
 * Library class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Library {
    final String subject;
    final String language;
    final int period;

    public Library(String subject, String language, int period) {
        this.subject = subject;
        this.language = language;
        this.period = period;
    }

    public final String borrowedBook() {
        return this.subject;
    }
}
