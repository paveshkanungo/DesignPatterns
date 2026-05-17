package org.example.Behavioral.State.example1_trafficLight;

public class GreenState implements TrafficLightState {
    @Override
    public void action(TrafficLight signal) {
        //GO behavior
        signal.setState(new YellowState()); // next state
        System.out.println("[ Changing Signal: Green State -> Yellow State ]");
    }
}
