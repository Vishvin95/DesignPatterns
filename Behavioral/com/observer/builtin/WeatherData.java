package com.observer.builtin;

import java.util.Observable;

public class WeatherData extends Observable {
	private int temperature;
	private int humidity;

	public void setMeasurements(int temperature, int humidity) {
		this.setTemperature(temperature);
		this.setHumidity(humidity);
		notifyAllObservers();
	}

	private void notifyAllObservers() {
		this.setChanged();
		this.notifyObservers();
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
