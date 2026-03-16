package org.example.Structural.Decorator;

public class Definition {
    void definitionDecorator(){
        // Decorator pattern allows you to add new functionality to objects dynamically without
        // altering their original structure.

        // Use cases:
        // Example 1: Pizza Shop
        // What we have:
        // Basic Pizza: Margherita (Crust + Cheese)
        // Available Toppings: Extra Cheese, Olives, Jalapenos, Pepperoni, Veggies, Spicy Red Pepper, etc.
        // Pizzas:
        // Type 1: Margherita + Extra Cheese
        // Type 2: Margherita + Olives + Jalapenos
        // Type 3: Margherita + Olives + Jalapenos + Veggies + Extra Cheese
        // Type 4: Margherita + Pepperoni + Spicy Red Pepper

        // Example 2: Coffee Cafe
        // What we have:
        // Espresso: A strong shot of pure coffee.
        // Available add-ons: Sugar, Hot water, Cold Water, Ice, Steamed Milk, Milk Foam, Cold Milk, Chocolate Syrup,
        // Vanilla ice cream, etc.
        // Coffee Beverages:
        // Type 1: Doppio → A double shot of espresso.
        // Type 2: Americano → Espresso + Hot water.
        // Type 3: Cappuccino → Espresso + Steamed Milk + Milk Foam.
        // Type 4: Mocha → Espresso + Steamed Milk + Chocolate Syrup.
        // Type 5: Cold Coffee → Espresso + Cold Water + Cold Milk + Ice.
        // Type 6: MakeYourOwnCoffee → Espresso + Cold Water + Cold Milk + Ice + Vanilla Ice Cream + Chocolate
        //  Syrup.

        // Why do we need the Decorator Pattern?
        // Issues without Decorator Pattern:
        // Class explosion refers to a situation where the number of classes in your system grows rapidly and uncontrollably,
        // making the codebase hard to navigate, maintain, and understand.
        // This happens when every combination of additional behavior requires a new decorator class(if implemented in a
        //  naive way).
        // To support all combinations of these decorators, we need to either manually chain them(which doesn’t allow
        //  changes at runtime) or create new classes for every common combination,
        // That’s where class explosion kicks in; we begin to have too many classes(extreme subclassing) to represent all
        //  possible combinations of features/behaviours.
    }
}
