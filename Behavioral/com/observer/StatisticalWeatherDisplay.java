package com.observer;

public class StatisticalWeatherDisplay implements Observer, DisplayElement {
	private float maxTemperature;
	private float minTemperature;
	private float maxHumidity;
	private float minHumidity;

	private Publisher publisher;

	public StatisticalWeatherDisplay(Publisher publisher) {
		this.publisher = publisher;
		this.maxTemperature = Float.MIN_VALUE;
		this.minTemperature = Float.MAX_VALUE;
		this.maxHumidity = Float.MIN_VALUE;
		this.minHumidity = Float.MAX_VALUE;
		publisher.subscribe(this);
	}

	@Override
	public boolean update(float temperature, float humidity) {
		this.maxTemperature = Math.max(temperature, maxTemperature);
		this.minTemperature = Math.min(temperature, minTemperature);
		this.maxHumidity = Math.max(humidity, maxHumidity);
		this.minHumidity = Math.min(humidity, minHumidity);
		display();
		return true;
	}

	@Override
	public void display() {
		System.out.println("Weather Statistics:");
		System.out.println("Temperature  Max: " + maxTemperature + " Min: " + minTemperature);
		System.out.println("Humidity  Max: " + maxHumidity + " Min: " + minHumidity);
	}

	public void disconnectFromPublisher() {
		publisher.unsubscribe(this);
		System.out.println("Disconnected from weather publisher");
	}
}
