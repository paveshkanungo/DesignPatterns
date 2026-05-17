package org.example.Behavioral.State.example1_trafficLight;

public class YellowState implements TrafficLightState {
    @Override
    public void action(TrafficLight signal) {
        //Slow Down behavior
        signal.setState(new RedState()); // next state
        System.out.println("[ Changing Signal: Yellow State -> Red State ]");
    }
}
