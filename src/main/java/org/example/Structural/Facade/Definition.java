package org.example.Structural.Facade;

public class Definition {
    void definitionFacade(){
        /*
        *
        *   The Facade Design Pattern provides a simplified interface to a complex subsystem for the client to interact with it seamlessly.
        *   Whenever we have to hide system complexity from the client, we use the Facade Design Pattern.
        *
        *   Real Life Example: Car
        *   Think of it like using accelerator() and brake() features in a Car . The Car conceals the intricate
        *   complexities of smaller hardware processes (subsystems), which are interconnected to sequentially manage the
        *   actions (speeding or slowing down) once the driver presses the pedals while driving.
        *
        *
        *   It is also important to note that the client doesn't need to use a facade to communicate with the subsystem
            components. It can always choose to communicate with the components and carry out the execution by itself.
        *
        *
        *   Scenario 1: Employee Operations
        *   Expose only a few methods/features the client is interested in using.
        *
        *   Client -> Facade -> Complex system of subclasses
        *
        *   ex: Client -> EmployeeFacade -> EmpployeeDAO
        *   EmployeeDAO acts as the complex system of subclasses responsible for doing multiple operations on employee object
        *   If Client wants to insert or getEmployeeDetails, then client is going to interact with EmployeeFacade and EmployeeFacade will use the
        *   actual methods of EmployeeDAO like as insert() or getEmployeeDetails()
        *
        *
        *   Scenario 2: Order Processing
        *   in the code
        *
        *
        *   The Problem(Without the Facade Pattern):
        *   1. The client has to talk to every subsystem directly and implement the proper sequence of execution order.
        *   2. No data hiding or encapsulation. The client has too much exposure to subsystems, making it tightly coupled with the internal structure.
        *   3. Hard to change/introduce new steps. If the order process changes (e.g., new DiscountService or different payment flow), you must update every client that uses       it.
        *   4. It would be more error-prone, e.g., the Client might forget a step (e.g., sendConfirmation() ). Or call it in the wrong order (payment before stock availability check).
        *
        *
        *   Scenario 3: Facade Using another Facade
        *   A facade can use another facade or a subsystem directly, depending on the requirement and complexity. The facade pattern provides a
        *   single entry point to the client for interaction.
        *
        *
        *   Facade vs Proxy Pattern:
        *   Facade and Proxy are both structural patterns, but they solve different problems.
        *   Intent:
        *   Facade Pattern: Provides a simplified interface to a complex subsystem to facilitate clients' interaction. The main
        *   purpose is to reduce complexity for clients. It is associated with references to many objects involved in the specific
        *   task.
        *
        *   Proxy Pattern: Acts as a surrogate/placeholder/substitute for another object to control access to it. It is used to add
        *   more control (security, logging, caching, lazy loading) and is associated with only ONE object directly.
        *
        *
        *   Facade vs Adapter Pattern:
        *   Facade and Adapter often look alike because both give a different interface to clients, but differ in the following:
        *   Intent:
        *   Facade Pattern: Provides a simplified interface to a complex subsystem to facilitate clients' interaction and hide the
        *   complexity.
        *   Adapter Pattern: Provides a way to use an existing incompatible interface that the client expects. Improves
        *   compatibility, making two interfaces work together.
        *
        * */
    }


}
