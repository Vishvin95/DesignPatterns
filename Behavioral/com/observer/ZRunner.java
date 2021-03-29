package com.observer;

public class ZRunner {
	public static void main(String[] args) throws InterruptedException {
		WeatherPublisher weatherPublisher = new WeatherPublisher();
		
		CurrentWeatherDisplay current = new CurrentWeatherDisplay(weatherPublisher);
		StatisticalWeatherDisplay statistics = new StatisticalWeatherDisplay(weatherPublisher);
		
		weatherPublisher.setMeasurements(23.2f, 13.6f);		
		Thread.sleep(5000);		
		weatherPublisher.setMeasurements(25.2f, 13.6f);		
		Thread.sleep(5000);
		
		current.disconnectFromPublisher();
		weatherPublisher.setMeasurements(23.2f, 33.6f);		
		statistics.disconnectFromPublisher();
	}
}
