package Behavioral.Observer.HeadFirst.第1版气象监测应错误示范;

/**
 * Created by sahoo on 16/4/26.
 */
public class WeatherData {

    CurrentConditionsDisplay currentConditionsDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;

    private float getHumidity() {
        return 0;
    }

    public float getTemperature() {
        return 0;
    }

    public float getPressure() {
        return 0;
    }

    public WeatherData(CurrentConditionsDisplay currentConditionsDisplay, StatisticsDisplay statisticsDisplay, ForecastDisplay forecastDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    public void measurementsChanged(){
        float temp=getTemperature();
        float humidity=getHumidity();
        float pressure=getPressure();

        currentConditionsDisplay.update(temp,humidity,pressure);
        statisticsDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);
    }
}
