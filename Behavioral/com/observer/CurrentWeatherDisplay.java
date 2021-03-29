package com.observer;

public class CurrentWeatherDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Publisher publisher;
	
	public CurrentWeatherDisplay(Publisher publisher) {
		this.publisher = publisher;
		publisher.subscribe(this);
	}
	
	@Override
	public boolean update(float temperature, float humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		return true;
	}
	
	@Override
	public void display() {
		System.out.println("Current Weather:");
		System.out.println("Temperature = " + temperature + " Humidity = " + humidity);		
	}	
	
	public void disconnectFromPublisher()
	{
		publisher.unsubscribe(this);
		System.out.println("Disconnected from weather publisher");
	}
}
