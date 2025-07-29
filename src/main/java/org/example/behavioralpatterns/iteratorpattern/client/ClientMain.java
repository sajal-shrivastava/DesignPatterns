package org.example.behavioralpatterns.iteratorpattern.client;

import org.example.behavioralpatterns.iteratorpattern.aggregate.ConcreteAggregate;
import org.example.behavioralpatterns.iteratorpattern.element.Book;
import org.example.behavioralpatterns.iteratorpattern.iterator.BookIterator;

import java.util.ArrayList;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Design Patterns", "Erich Gamma"));
        books.add(new Book("The Pragmatic Programmer", "Andy Hunt"));
        books.add(new Book("Refactoring", "Martin Fowler"));
        books.add(new Book("Java Concurrency in Practice", "Brian Goetz"));
        books.add(new Book("Head First Design Patterns", "Eric Freeman"));
        books.add(new Book("Domain-Driven Design", "Eric Evans"));

        ConcreteAggregate aggregate = new ConcreteAggregate(books);
        BookIterator concreteIterator = aggregate.createIterator();
        while(concreteIterator.hasNext()){
            System.out.println(concreteIterator.next());
        }
    }
}
