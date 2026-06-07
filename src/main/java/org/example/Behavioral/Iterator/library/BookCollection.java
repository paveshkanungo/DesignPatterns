package org.example.Behavioral.Iterator.library;
import org.example.Behavioral.Iterator.library.Iterator;

// Aggregate interface
public interface BookCollection {
    Iterator<Book> createIterator();
    Iterator<Book> createReverseIterator();
}
