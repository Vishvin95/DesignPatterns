package com.observer.builtin;

public class ZRunner {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentWeatherDisplay cwd = new CurrentWeatherDisplay(weatherData);
		StatisticalWeatherDisplay swd = new StatisticalWeatherDisplay(weatherData);
		
		weatherData.setMeasurements(21, 45);
		weatherData.setMeasurements(32, 47);
		weatherData.setMeasurements(26, 34);
		
		swd.unsubscribe();
		weatherData.setMeasurements(25, 50);
	}

}
