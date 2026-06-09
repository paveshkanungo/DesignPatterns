package org.example.Behavioral.Visitor;

public class Definition {
    void definitionVisitor(){
        /*
        *   Visitor Pattern
        *   The Visitor design pattern is a behavioral design pattern that allows you to add new
        *   operations to existing object structures without modifying those structures. It achieves this
        *   by separating the algorithm from the actual objects that it operates on. It uses Double
        *   Dispatch to implement this.
        *
        *   Double Dispatch is a method where the runtime type of the caller object (the receiver) and the runtime type of the
        *   argument object (the visitor) determine which method is invoked.
        *   In simple terms, Double Dispatch is the selection of a method based on the runtime types of two objects, the
        *   receiver and the argument.
        *   More on this later...
        *
        *
        *   The Key Problems Without Visitor Pattern
        *   1. Violates the Open/Closed Principle and the Single Responsibility Principle, making it unextensible.
        *   2. Scattered Operation Logic leading to redundant code.
        *   3. Difficult Testing
        *   4. Tight coupling & Poor Reusability of code
        *
        *
        *   Structure of Visitor Pattern
        *   Understanding the Structure of the Visitor Pattern using the Hotel Room example:
        *   - Element Interface( IRoom ): Declares a contract for all concrete element types to implement the
        *   accept(IRoomVisitor visitor) method, which allows visitors to perform operations on them.
        *   - Concrete Element( StandardRoom , DeluxeRoom , and SuiteRoom ): These concrete element types are
        *   actual objects on which the algorithm is applied. Inside the accept(IRoomVisitor visitor) method,
        *   they call the appropriate visitor method for their respective types.
        *   - Visitor Interface( IRoomVisitor ): Defines one visit(ConcreteElement e) method for each room
        *   type. This is the core logic of the pattern. The algorithm is executed on the object.
        *   - Concrete Visitor( HousekeepingVisitor , RoomServiceVisitor , PricingVisitor ): Each
        *   visitor service implements how to handle the particular operation on each element type differently.
        *
        *
        *   How does the Visitor Pattern achieve Double Dispatch?
        *   Single Dispatch
        *   Single dispatch means the method that gets executed is determined by the runtime type of only one object, typically
        *   the receiver of the method call.
        //  No visitors

        //  Just different types of rooms - IRoom - Standard, Deluxe, Suite
        //  each implementing its own version of accept

            IRoom roomObj = new DeluxeRoom();
            roomObj.accept();

        // At runtime we execute accept() method implementation of DeluxeRoom class
        // The method executed depends only on the runtime type of roomObj
        // (which is DeluxeRoom), not on any other factors.
        *
        *
        * Double Dispatch:
        *   Double Dispatch comes into the picture when you need behavior, i.e., actual method execution, to depend on multiple
        *   object types:
            1. The runtime type of the caller object (i.e., the receiver or element) → first dispatch
            2. The runtime type of the object passed as an argument (i.e., the visitor) → second dispatch
        *
        *    // Different types of Visitors - IRoomVisitor - HousekeepingVisitor,
             // RoomServiceVisitor and PricingVisitor

         // Different types of rooms - IRoom - Standard, Deluxe, Suite
         IRoom myroom = new StandardRoom("101");

         IRoomVisitor myvisitor = new HousekeepingVisitor();

         myroom.accept(myvisitor); // DOUBLE DISPATCH

         // The runtime type of the caller object - myroom is resolved at runtime &
         // StandardRoom.accept() is called ---> FIRST DISPATCH
         // The runtime type of the object passed as an argument - inside the accept() method
        // myvisitor is resolved at runtime & HousekeepingVisitor.visitStandardRoom()
        // is called ---> SECOND DISPATCH
        *
        *
        *   Visitor vs Strategy Design Pattern
        *   Strategy Pattern: Encapsulates alternative algorithms for a single operation.
        *   Allows swapping different behaviors at runtime.
        *   These algorithms are independent of the object they are applied.
        *   Here, we find Different ways to do ONE thing.
        *   Visitor Pattern: Adds new operations to an object structure without modifying it.
        *   Allows adding operations across multiple types.
        *   The new operations are tied to specific objects they are applied.
        *   Here we perform Different operations on MANY types.
        *
        *
        * */
    }
}
