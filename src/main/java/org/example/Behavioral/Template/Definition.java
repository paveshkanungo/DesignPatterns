package org.example.Behavioral.Template;

public class Definition {
    void definitionTemplatePattern(){
        /*
        *   The Template Method pattern is a behavioral design pattern that defines the
        *   skeleton/structure of an algorithm(common workflow) in a base class and allows subclasses
        *   to override specific steps and provide custom implementation without changing the
        *   algorithm's core workflow.
        *
        *   Structure of the Template Method Pattern
        *   Let’s understand the Structure of the Template Method Pattern using the Payment Workflows example:
        *   1. Abstract Structure Class (e.g., PaymentFlow ):
        *   Has a template method: Defines the sequence of steps for the algorithm (the skeleton of the payment processing
        *   workflow). Calls both abstract methods and hook methods in a specific sequence
        *   Declares one or more abstract methods that must be implemented by each subclass. These define the varying
        *   parts(specific implementation) of the algorithm.
        *   May contain hook methods: have default implementations. Subclasses can choose to override these for further
        *   customization if needed.
        *   May also contain common methods: They are implemented once in the base class, and all subclasses share this
        *   common functionality.
        *   2. Concrete Structure Classes (e.g., BankTransfer , MerchantPayment )
        *   These classes extend the abstract base class and provide specific implementations for the abstract methods
        *   defined in the template.
        *   They also optionally override hook methods to provide customization of business workflows. Improves flexibility.
        *
        * */
    }
}
