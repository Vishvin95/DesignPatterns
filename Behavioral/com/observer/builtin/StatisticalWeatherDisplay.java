package com.observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class StatisticalWeatherDisplay implements Observer, DisplayElement {
	private int maxTemperature = Integer.MIN_VALUE;
	private int minTemperature = Integer.MAX_VALUE;
	private int maxHumidity = Integer.MIN_VALUE;
	private int minHumidity = Integer.MAX_VALUE;
	private Observable observable;

	public StatisticalWeatherDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("max temp = " + maxTemperature + " min temp = " + minTemperature);
		System.out.println("max hum = " + maxHumidity + "min hum = " + minHumidity);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			maxTemperature = Integer.max(maxTemperature, weatherData.getTemperature());
			minTemperature = Integer.min(minTemperature, weatherData.getTemperature());
			maxHumidity = Integer.max(maxHumidity, weatherData.getHumidity());
			minHumidity = Integer.min(minHumidity, weatherData.getHumidity());
			display();
		}
	}

	public void unsubscribe() {
		observable.deleteObserver(this);
	}
}
