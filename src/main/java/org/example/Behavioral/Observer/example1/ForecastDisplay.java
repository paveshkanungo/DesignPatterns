package org.example.Behavioral.Observer.example1;

public class ForecastDisplay implements WeatherObserver {
    private final WeatherObservable weatherStation;

    public ForecastDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Updating weather data to do some analytics: " + weatherStation.toString());
        display();
    }

    void display(){
        System.out.println("Forecast Details: " + "xyz");
    }
}
