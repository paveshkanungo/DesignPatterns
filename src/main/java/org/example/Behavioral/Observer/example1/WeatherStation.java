package org.example.Behavioral.Observer.example1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
    private final List<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
        System.out.println("[+] Observer registered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
        System.out.println("[-] Observer removed: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer: observers){
            observer.update();
        }
    }

    @Override
    public void setWeatherReadings(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    @Override
    public String toString() {
        return "WeatherStation{" + ", temperature=" + temperature + ", humidity=" + humidity
                                + ", pressure=" + pressure + '}';
    }
}
