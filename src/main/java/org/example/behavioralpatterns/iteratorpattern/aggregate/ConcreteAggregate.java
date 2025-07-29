package org.example.behavioralpatterns.iteratorpattern.aggregate;

import org.example.behavioralpatterns.iteratorpattern.element.Book;
import org.example.behavioralpatterns.iteratorpattern.iterator.BookIterator;
import org.example.behavioralpatterns.iteratorpattern.iterator.ConcreteIterator;

import java.util.List;

public class ConcreteAggregate implements Aggregate {
    List<Book> books;

    public ConcreteAggregate(List<Book> books){
        this.books = books;
    }


    @Override
    public BookIterator createIterator() {
        return new ConcreteIterator(books);
    }
}
