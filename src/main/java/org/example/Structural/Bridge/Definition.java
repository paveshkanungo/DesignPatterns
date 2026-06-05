package org.example.Structural.Bridge;

public class Definition {
    void definitionBuilder(){
        /*
        *   The Bridge Design Pattern decouples an abstraction(high-level logic defines the "what")
        *   from its implementation(low-level details that define the "how") so that the two can evolve
        *   independently.
        *
        *   The Problem:
        *   Let's consider an example of different living things with different respiratory mechanisms.
        *   The naive approach of this implementation would be to introduce an abstraction for the respiratory mechanism, i.e.
        *   breathing process, and extend it to define the breathing process for each new type of living thing we introduce.
        *
        *   Problems Here:
        *   1. Code Duplication: Both Dog and Whale breathe through lungs → same logic repeated in multiple classes.
        *   2. Tight Coupling: Breathing logic is tied to each animal class. You can’t easily reuse breathing behavior for another animal or introduce a new type independently.
        *   3. Class Explosion: Without Bridge, you might end up making separate classes for every combination: DogWithLungs , WhaleWithLungs , FishWithGills, etc.
        *
        *
        *   Solution: Bridge Design Pattern
        *   With the Bridge Pattern, Living Things (Dog, Fish, Whale, Tree) don’t care how breathing is done.
        *   Breathing strategies (LungBreathing, GillBreathing, SkinBreathing) are separate.
        *   You can mix & match at runtime.
        *   Add a new breathing type? Just implement the Breathing Process.
        *   Add a new animal? Just extend Animal and plug in a breathing process.
        *
        *
        *   Abstraction ( LivingThings ): High-level concept of a living thing and its operations.
        *   Refined Abstraction ( Dog , Fish , Whale , Tree ): Concrete types of living things with more refined functions.
        *   Implementor ( BreatheProcess ): Defines "how" breathing happens, the low-level details.
        *   Concrete Implementors ( LungBreathing , GillBreathing ): Actual breathing mechanisms defining reusable methods for respiratory mechanisms.
        *
        *   The Bridge Pattern allows for the independent addition of new LivingThings (e.g., Frog ) or new Breathing types (e.g., SkinBreathing for amphibians).
        *   This enables a flexible and extensible design through mixing and matching.
        *
        *
        *   Bridge Pattern vs Strategy Pattern:
        *   The patterns are mostly similar but differ in the intent:
        *   Bridge: Focuses on handling two hierarchies independently (abstraction & implementation). Like a LivingThings (abstraction) that has
        *   different Respiratory Mechanisms (implementation). LivingThings and Respiratory Mechanisms evolve independently.
        *
        *   Strategy: Focuses on handling different behaviors dynamically. Like choosing the driving route on Google Maps,
        *   you can switch between "fastest", "shortest", or "avoid tolls" at runtime.
        *
        *
        * */
    }
}
