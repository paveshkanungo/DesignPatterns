package org.example.Creational.Builder;

public class Definition {
    void definitionBuilderPattern(){
        /* The Builder Pattern is a creational design pattern that constructs complex objects step by step.

         It's particularly useful when you need to create objects with many optional parameters
         or when the construction process should allow different representations of the same object.

        Here’s a list of problems and issues that typically arise when we create similar and multiple
        complex objects, the traditional way.

        -- When a class has many optional parameters, you end up with a large number of constructors.
        This is called Telescoping Constructors (Constructor Overload Explosion).

        -- It is difficult to maintain, read, and prone to errors when parameters are of the same type,
        particularly when constructors have identical signatures.

        -- Reduced readability and maintainability, as we can't tell what each parameter means unless we
         look at the constructor definition. Chances of wrong assignment of parameter values due to the same types.

        -- Clients should pass null for any optional parameters that they do not choose to set,
        which increases the risk of bugs.

        -- If you want to make a class immutable (i.e., its fields are final), you cannot use setters.

        -- Creating test objects becomes increasingly complex and verbose without builders,
        particularly when many fields are optional.

        -- Violates the Single Responsibility Principle (SRP) because the class manages both data storage
        and construction logic.


        ** Builder Pattern vs Decorator Pattern:
        -- If you're building complex objects: Use the Builder Pattern
        -- If you're extending behavior dynamically(layering enhancements): Use the Decorator Pattern


        */
    }
}
