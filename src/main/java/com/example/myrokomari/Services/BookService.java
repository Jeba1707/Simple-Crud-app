package com.example.myrokomari.Services;

import com.example.myrokomari.Entities.Book;
import com.example.myrokomari.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class BookService {

  @Autowired
    BookRepo bookRepo;

  public List<Book> getBooks(){
      return bookRepo.findAll();
  }
  public Book getBook(long id){
      return bookRepo.findById(id).get();
  }

  public Book addBook(Book book){
      return bookRepo.save(book);
  }

  public void deleteBook(long id){
     bookRepo.deleteById(id);
  }

  public String updateBook(long id,Book b){
      return bookRepo.save(b).toString();
  }
   // int id = 100;

//    public List<Book> bookList(){
//        return books;
//    }
//
//    public Book getBook(int id) {
//        for (Book book : books) {
//            if (book.getId() == id)
//                return book;
//        } return null;
//    }
//
//    public Book addbook(Book book){
//        book.setId(++id);
//        books.add(book);
//        return book;
//    }
//
//    public String deleteBook(int id){
//        boolean deleted = false;
//       deleted =  books.removeIf(book -> book.getId() == id);
//        String result = deleted ? "Book deleted" : "Book not found";
//        return result;
//    }
//
//
//    public String updateBook(int id,Book b){
//        boolean updated = false;
//        for(int i = 0; i < books.size(); i++){
//           if(books.get(i).getId() == id)
//             {
//               books.set(i,b);
//               updated= true;
//             }
//        }
//        String result = updated ? "Book updated" : "Book not found";
//        return result;
//    }

}
