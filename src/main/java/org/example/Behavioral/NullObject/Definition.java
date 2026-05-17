package org.example.Behavioral.NullObject;

public class Definition {
    void definitionNullObjectPattern(){
        /*
            The NULL Object Pattern is a behavioral design pattern that uses polymorphism to eliminate
            null checks. Instead of returning NULL and adding NULL checks wherever necessary, we
            return a special object called NULL OBJECT that implements the expected interface( or
            extends an abstract class) but does nothing (or provides default behavior).

            Key Points:-
            1. Instead of returning null, return an instance of a Null Object. A NULL Object replaces a NULL return type.
            2. This leads to clean code without redundant NULL checks everywhere.
            3. NULL Object reflects do Nothing or contains a Default behaviour.

            Benefits:-
            1. Makes code cleaner by eliminating repetitive null checks.
            2. Reduces NullPointerException risks.
            3. Increases code readability.

         */
    }
}
