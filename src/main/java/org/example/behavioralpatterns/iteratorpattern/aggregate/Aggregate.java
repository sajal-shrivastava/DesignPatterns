package org.example.behavioralpatterns.iteratorpattern.aggregate;

import org.example.behavioralpatterns.iteratorpattern.iterator.BookIterator;

public interface Aggregate {
    BookIterator createIterator();
}
