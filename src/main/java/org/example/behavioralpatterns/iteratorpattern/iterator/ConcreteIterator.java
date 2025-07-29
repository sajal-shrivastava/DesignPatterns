package org.example.behavioralpatterns.iteratorpattern.iterator;

import org.example.behavioralpatterns.iteratorpattern.element.Book;

import java.util.List;

public class ConcreteIterator implements BookIterator {
    List<Book> books;
    int index = 0;
    public ConcreteIterator(List<Book> books){
     this.books = books;
    }
    @Override
    public boolean hasNext() {
       return index < books.size();
    }

    @Override
    public Book next() {
      if(this.hasNext()){
          return books.get(index++);
      }
      return null;
    }
}
