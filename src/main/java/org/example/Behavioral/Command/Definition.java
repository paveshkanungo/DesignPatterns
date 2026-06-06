package org.example.Behavioral.Command;

public class Definition {
    void definitionCommandPattern(){
        /*
        *
        *   The Command pattern is a behavioral design pattern that encapsulates a request as an
        *   object, allowing you to parameterize and queue them, which in turn helps in decoupling the
        *   sender and receiver. By storing the object's state, we can also implement undo/redo
        *   operations.
        *
        *
        *   Let’s consider an example of Remote controls for devices, like sending commands from an AC Remote to the actual
        *   AC (Air Conditioner) device set up in the room. The remote control doesn't need to know how the AC works internally -
        *   it just calls execute() upon a button press(command). We can introduce parameterization by having different
        *   buttons configured with different commands at runtime. The pattern separates the object that invokes the
        *   operation(sender) from the one that performs it(receiver), making the system more flexible and maintainable.
        *
        *
        *   The Problem: Traditional Approach
        *   The problems with the above implementation are:
        *   1. Lack of Abstraction: The remote control is directly dependent on specific device classes. Tomorrow, when we want
        *   to scale to a smart controller by adding new devices, we will need to modify the remote control code. This will lead
        *   to more redundant code, which is not a good design practice.
        *   2. Undo/Redo Functionality: What if we want to add the undo/redo capability? How it will be handled. If we provide
        *   the implementation in client code (without command objects storing previous state), implementing undo becomes
        *   clumsy, requiring the invoker to track state for all possible operations.
        *   3. Difficulty in Code Maintenance: What if in the future, we have to support more commands for more devices
        *   example Bulb. Supporting multiple device types leads to complex, monolithic, bloated remote control classes,
        *   leading to violation of SOLID Principles and difficulty in Testing.
        *   Without this pattern, you end up with tightly coupled, inflexible code that's hard to maintain, test, and extend.
        *
        *
        *   Structure of the Command Pattern
        *   Understanding the structure of the command design pattern using the AC Remote Control example.
        *
        *   Receiver ( AirConditioner ): The object that performs the actual work. It contains the business logic that will
        *   be triggered by a command.
        *   Command Interface: Declares execute() and undo() methods and introduces a layer of abstraction.
        *   Concrete Commands( TurnOnCommand , TurnOffCommand , SetTemperatureCommand ):
        *   Implement specific operations like turning on/off, changing temperature. Each receiver operation has a dedicated
        *   class.
        *   Invoker ( RemoteController ): Stores a reference to the Command object and executes commands upon
        *   receiving a request for an operation. Holds a data structure to track previous states that help implement undo/redo
        *   functionality.
        *   Client: Creates and configures commands and associates them with the right receiver, and configures the Invoker
        *   to execute the commands.
        *
        *   Implementation (Example: AC Remote with Undo Functionality)
        *   How does the Command design pattern solve the above issue?
        *   It separates the logic of:
        *   Receiver
        *   Invoker and
        *   Command
        *
        *
        * */
    }
}
