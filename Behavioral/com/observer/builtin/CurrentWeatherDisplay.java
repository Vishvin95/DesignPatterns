package com.observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class CurrentWeatherDisplay implements Observer, DisplayElement {
	private int temperature;
	private int humidity;
	private Observable observable;

	public CurrentWeatherDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			temperature = weatherData.getTemperature();
			humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current Temperature: " + temperature + " Current Humidity: " + humidity);
	}

	public void unsubscribe() {
		observable.deleteObserver(this);
	}
}
