package org.example.behavioralpatterns.iteratorpattern.iterator;

import org.example.behavioralpatterns.iteratorpattern.element.Book;

public interface BookIterator {
    boolean hasNext();
    Book next();
}
