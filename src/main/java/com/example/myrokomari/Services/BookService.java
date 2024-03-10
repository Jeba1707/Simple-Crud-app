package com.example.myrokomari.Services;

import com.example.myrokomari.Domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class BookService {

    private List<Book> books = new ArrayList<Book>();
    int id = 100;

    public List<Book> bookList(){
        return books;
    }

    public Book getBook(int id) {
        for (Book book : books) {
            if (book.getId() == id)
                return book;
        } return null;
    }

    public Book addbook(Book book){
        book.setId(++id);
        books.add(book);
        return book;
    }

    public String deleteBook(int id){
        boolean deleted = false;
       deleted =  books.removeIf(book -> book.getId() == id);
        String result = deleted ? "Book deleted" : "Book not found";
        return result;
    }


    public String updateBook(int id,Book b){
        boolean updated = false;
        for(int i = 0; i < books.size(); i++){
           if(books.get(i).getId() == id)
             {
               books.set(i,b);
               updated= true;
             }
        }
        String result = updated ? "Book updated" : "Book not found";
        return result;
    }

}
