package org.example.Behavioral.Iterator;

public class Definition {
    void definitionIteratorPattern(){
        /*
        *   The Iterator design pattern is one of the behavioral design patterns that provides a way to
        *   access elements of a Collection sequentially without exposing the underlying
        *   representation of the collection.
        *
        *   Real-world Usage:
        *   In the Java Collections Framework, the collection interface includes methods, such as iterator(), that allow a
        *   client to obtain an Iterator object from any collection that implements it. All collection classes have iterator
        *   implementation, e.g., ( ArrayList.iterator(), HashSet.iterator(), TreeSet.descendingIterator(), etc).
        *
        *   In the problem code:
        *   Problems with the above code are that:
        *   No data encapsulation allows the client can modify data and access hidden information.
        *   Tight coupling of traversal logic to data structure and client.
        *   Violates SOLID principles if we try to implement new traversal logic.
        *
        *   Structure of the Iterator Design Pattern:
        *   Iterator Interface( Iterator<T> ): Defines the contract for traversing a collection with hasNext() and next() methods.
        *
        *   Concrete Iterator: Implements the traversal logic for a specific collection type. It tracks the current position while traversing the collection.
        *   LibraryIterator → traverses books from first to last.
        *   DescendingLibraryIterator → traverses books from last to first by starting at numberOfBooks - 1 and decrementing the position.
        *
        *   Aggregate Interface( BookCollection ): Declares a method to create iterators ( createIterator() and createReverseIterator() ).
        *
        *   Concrete Aggregate( Library ): The actual collection of books ( Library class) that implements the
        *   aggregate interface(creates and returns Concrete Iterators LibraryIterator and DescendingLibraryIterator ).
        *
        *
        * */
    }
}
