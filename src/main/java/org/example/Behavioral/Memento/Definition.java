package org.example.Behavioral.Memento;

public class Definition {
    void definitionMemento(){
        /*
        *   The Memento pattern is a behavioral design pattern that allows you to capture and restore
        *   an object's internal state without violating encapsulation. It's widely used for implementing
        *   undo/redo functionality and checkpoints or versioning(systems that require restoring
        *   previous states when requested) in your application.
        *
        *   Memento pattern is made up 3 types of classes, each responsible for particular action:
        *   1. Originator
        *   It represents the object, for which state need to be saved and restored.
        *   Expose methods to save and restore its state using Memento object.
        *
        *   2. Memento
        *   It represents an Object which holds the state of the Originator.
        *
        *   3. Caretaker
        *   Manages the list of States (i.e. list of Memento Objects).
        *
        *   Structure of Memento Pattern
        *   Understanding the structure of Memento Pattern using an example of IDE application’s configuration that can be
        *   saved and restored:
        *   1. Memento ( ConfigurationMemento ):
        *   Immutable object that stores the configuration state.
        *   Only the Originator can access its internal data.
        *
        *   2. Originator ( ApplicationConfiguration ):
        *   Contains the actual configuration that changes over time.
        *   save() method → creates a memento capturing current state
        *   restore() method → brings back a previous state from a memento.
        *
        *   3. Caretaker ( ConfigurationManager ):
        *   Manages a history of mementos for undo functionality.
        *   Doesn't know about the internal structure of mementos.
        *   Provides clean interface to save and restore states.
        *
        *
        * */
    }
}
