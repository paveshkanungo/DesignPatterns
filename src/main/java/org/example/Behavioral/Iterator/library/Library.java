package org.example.Behavioral.Iterator.library;

import java.util.List;

// Concrete Aggregate
public class Library implements BookCollection {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public org.example.Behavioral.Iterator.library.Iterator<Book> createIterator() {
        return new LibraryIterator(books);
    }

    @Override
    public Iterator<Book> createReverseIterator() {
        return new ReverseLibraryIterator(books);
    }
}
