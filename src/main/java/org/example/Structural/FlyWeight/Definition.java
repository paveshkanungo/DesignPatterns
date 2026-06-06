package org.example.Structural.FlyWeight;

public class Definition {
    void definitionFlyWeight(){
        /*
        *   The Flyweight Design Pattern is a structural pattern that helps reduce memory usage by
        *   efficiently sharing data that is common to multiple similar objects. This pattern is widely
        *   used in applications where it is required to generate a large number of similar objects.
        *
        *   When do we use this?
        *   When Memory is Limited.
        *   When Objects share data.
        *   Intrinsic data: Data that is shared among objects and remains the same once it is set.
        *   Extrinsic data: This data changes based on client input and differs from one object to another.
        *   Creation of an Object is expensive.
        *
        *
        *   Example 1: Robotic Game
        *   Let's look at the naive approach in creating a game where we usually tend to create a lot of similar objects.
        *   A total of 10 lakh robots created will result in 10 lakh Sprite objects created, which will consume a lot of memory(let's
        *   say each robot is 40 KB, 40 kilobytes * 10 lakh = 40 gigabytes ), and if it exceeds the system's
        *   capacity(32 GB RAM), the application might become unresponsive or most probably crash leading to bad user
        *   experience and unavailability.
        *   Robotic Game: Flyweight Implementation as a Solution
        *   Let’s see how we can solve the issue:
        *   From the above Robot object, remove all the extrinsic data and keep the intrinsic data; it will result in a flyweight
        *   object.
        *   This Flyweight Class can be immutable. Provide getter methods only.
        *   Extrinsic Data can be passed to the Flyweight class as a method parameter.
        *   Once the Flyweight Object is created, it is cached and reused whenever required.
        *   Here, we created a total of 4 objects(2 humanoids and 2 robotic dogs), but with the flyweight pattern approach, we are
        *   consuming 50% less memory(only 2 objects created) by reusing the objects.
        *
        *
        *   Example 2: Word Processor
        *   Word Processor: Issue
        *   A real document may have millions of characters. Implementing a word processor using a naive approach, i.e., without
        *   flyweight → we would store "A" object 5000 times → memory heavy. This would result in excessive memory usage,
        *   causing our application to crash as discussed above.
        *   Word Processor: Flyweight Implementation as a Solution
        *   A real document may have millions of characters. Using the flyweight pattern, we store "A" just once and reuse it
        *   with extrinsic state (position or formatting). This approach proves to be a memory saver, reuses shared data, and
        *   passes varying context(extrinsic state) separately.
        *
        *
        * */
    }
}
