package com.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherPublisher implements Publisher {
	private float temperature;
	private float humidity;
	private List<Observer> observers;

	public WeatherPublisher() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public boolean unsubscribe(Observer observer) {
		return observers.remove(observer);
	}

	@Override
	public void notifyAllSubscribers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity);
		}
		System.out.println("-------------------------------------------------");
	}

	public void setMeasurements(float temperature, float humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		notifyAllSubscribers();
	}
}
