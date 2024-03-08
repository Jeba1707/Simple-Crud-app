package com.example.myrokomari.Controller;

import com.example.myrokomari.DTO.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/my-rokomari")
public class MyController { private List<Book> books = new ArrayList<Book>();
 int id = 100;
//localhost:8090/my-rokomari/book-list
@GetMapping("/book-list")
    public List<Book> bookList(){
        return books;
    }

    //localhost:8090/my-rokomari/search-book/104
    @GetMapping("/search-book/{id}")
    public Book getBook(@PathVariable int id) {
        for (Book book : books) {
            if (book.getId() == id)
              return book;
        } return null;
    }

    //localhost:8090/my-rokomari/add-book
    @PostMapping("/add-book")
    public Book addbook(@RequestBody Book book){
        book.setId(++id);
        books.add(book);
        return book;
    }


    //localhost:8090/my-rokomari/delete-book/103
    @DeleteMapping("/delete-book/{id}")
    public void deleteBook(@PathVariable int id){
        books.removeIf(book -> book.getId() == id);
    }


    //localhost:8090/my-rokomari/update-book?id=104
    @PutMapping("/update-book")
    public String updateBook(@RequestParam("id") int id, @RequestBody Book b){
        for(Book book: books){
            if(book.getId() == id){
                book.setTitle(b.getTitle());
                book.setAuthor(b.getAuthor());
                book.setPublisher(b.getPublisher());
                book.setEdition(b.getEdition());
                book.setNumberOfPages(b.getNumberOfPages());
                book.setCountry(b.getCountry());
                book.setLanguage(b.getLanguage());
                break;
            }
        }

        return "Book updated";
    }
//     An example of a JSON
//    {
//            "title":"চল",
//            "author":"অন্তিক মাহমুদ",
//            "publisher":"অধ্যয়ন প্রকাশনী",
//            "edition":"10th Published, 2023",
//            "numberOfPages":160,
//            "country":"বাংলাদেশ",
//            "language":"বাংলা"
//    }
}
