package org.example.Behavioral.State;

public class Definition {
    void definitionStatePattern(){
        /* The State Pattern allows an object to change its behavior dynamically at runtime whenever
           there is a change in its internal state.

           Real Life Example: Traffic Signal
                        State                       Operations
                Red State (Stop)             action() -> Make Signal Red
                Green State (Go)             action() -> Make Signal Green
                Yellow State (Slow Down)     action() -> Make Signal Yellow

           This type of problems, where Object change the state after performing certain operation can be solved through : State Design Pattern


           Real Life Example: Vending Machine
           Different States and Operations
           Example: Vending Machine
                        State                       Operations
                     IdleState                 Press Insert Coin Button

                     HasMoney State             Insert Coin
                                                Select Product
                                                Cancel/Refund

                     Selection State            Choose Product
                                                Return Change
                                                Cancel/Refund full amount

                     Dispense Product State     Dispense Product

        */
    }
}
