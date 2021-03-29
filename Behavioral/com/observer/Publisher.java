package com.observer;

public interface Publisher {
	void subscribe(Observer observer);

	boolean unsubscribe(Observer observer);

	void notifyAllSubscribers();
}
