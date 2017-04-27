package ru.job4j.tracker.start;

public interface UserAction {
	int key();
	void execute();
	String info();
}