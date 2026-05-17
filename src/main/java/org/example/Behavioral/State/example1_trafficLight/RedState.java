package org.example.Behavioral.State.example1_trafficLight;

public class RedState implements TrafficLightState {
    @Override
    public void action(TrafficLight signal) {
        // STOP behavior
        signal.setState(new GreenState()); // next state
        System.out.println("[ Changing Signal: Red State -> Green State ]");
    }
}
