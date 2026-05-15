package org.example.Structural.Proxy;

public class Definition {
    void definitionProxy(){
        // The Proxy Design Pattern provides a representative or placeholder for another object(real
        // complex object) to control access to it.
        /*
        * Use cases of the Proxy Pattern:
        * 1. Access Control: Restricts access to sensitive operations based on user permissions.
        * 2. Performance Optimization: Delays resource-intensive operations like expensive object creation until necessary
            (lazy loading).
        * 3. Pre/post processing: Performs additional operations before and after forwarding the request to the actual object,
            like adding cross-cutting concerns like audit traces (logging & monitoring), without modifying core business logic.
        * 4. Pre/post processing: Performs additional operations before and after forwarding the request to the actual object,
            like adding cross-cutting concerns like audit traces (logging & monitoring), without modifying core business logic.
        * 5. Caching: Can cache results to improve performance.
        *
        *   Structure of Proxy Pattern:
        *   1. Subject Interface ( EmployeeDao )
                Defines the common interface for both EmployeeDaoImpl and EmployeeDaoProxy .
                Ensures the proxy can be used anywhere the real object is expected
        *   2. Real Subject ( EmployeeDaoImpl )
        *       Contains the actual business logic and data. Handles core employee operations.
        *       Performs expensive operations like database loading.
        *   3. Proxy Object ( EmployeeDaoProxy )
        *       Maintains a reference to the Real Subject( EmployeeDaoImpl ).
        *       Controls access through permission checks.
        *       Can be modified further to implement lazy loading, logging and etc.
        *   4. Client ( EmployeeManagement )
        *       Client is performing operations on the subject without being aware of whether it's a Real/Proxy object
        *
        *   The Proxy pattern is particularly useful in enterprise applications where security, performance, and monitoring are
            critical concerns.

        * */
    }
}
