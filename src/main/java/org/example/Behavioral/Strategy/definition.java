package org.example.Behavioral.Strategy;

public class definition {
    void definitionStrategy(){
        // The Strategy pattern is a behavioral design pattern that defines multiple algorithms,
        // encapsulates their logic in dedicated classes, and enables changing an algorithm's
        // behavior at runtime. It's particularly useful when you have multiple ways to perform a task
        // and want to choose the approach dynamically.

        // Popular Real-life Examples
        // 1. Courier Service → Shipping Cost Calculation - Discount for Premium members, Flat fee,
        // Distance-based based and weight-based computations.
        // 2. Shopping Cart → Payment Options - CrediCard, PayPal, UPI, Cash, etc.
        // 3. Vehicle Manufacturing → Different cars(like SUVs, EVs, etc) require different drive modes.

        // Problems without Strategy Pattern:
        // 1. Massive Conditional Blocks leading to bloated classes
        // 2. Violation of the Open/Closed Principle and Single Responsibility Violation
        // 3. Code Duplication
        // 4. Tight Coupling
        // 5. Testing Complexity
    }
}
