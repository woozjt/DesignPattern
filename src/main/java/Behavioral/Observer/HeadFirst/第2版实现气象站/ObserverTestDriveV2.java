package Behavioral.Observer.HeadFirst.第2版实现气象站;


import Behavioral.Observer.HeadFirst.第2版实现气象站.ConcreteClass.*;

/**
 * Created by sahoo on 16/4/26.
 */
public class ObserverTestDriveV2 {
    public static void start() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
