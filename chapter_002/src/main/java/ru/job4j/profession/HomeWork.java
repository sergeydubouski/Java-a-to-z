package ru.job4j.profession;

/**
 * HomeWork class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class HomeWork {
    final String subject;
    final boolean isWriting;

    public HomeWork(String subject, boolean isWriting) {
        this.subject = subject;
        this.isWriting = isWriting;
    }

    public final int submitType() {
        return isWriting == true ? 1 : 0;
    }

}
