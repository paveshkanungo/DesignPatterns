package org.example.Behavioral.State.example1_trafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight (); //initial signal state is RED

        trafficLight.change(); // RED → GREEN
        trafficLight.change(); // GREEN → YELLOW
        trafficLight.change(); // YELLOW → RED
    }
}
