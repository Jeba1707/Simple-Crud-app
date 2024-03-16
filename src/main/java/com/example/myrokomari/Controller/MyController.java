package com.example.myrokomari.Controller;

import com.example.myrokomari.Entities.Book;
import com.example.myrokomari.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/my-rokomari")
public class MyController {
    @Autowired
    BookService bookService ;

//localhost:8090/my-rokomari/book-list
@GetMapping("/book-list")
    public List<Book> bookList(){
        return bookService.getBooks();
    }

    //localhost:8090/my-rokomari/search-book/104
    @GetMapping("/search-book/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    //localhost:8090/my-rokomari/add-book
    @PostMapping("/add-book")
    public Book addbook(@RequestBody Book book){
        return bookService.addBook(book);
    }


    //localhost:8090/my-rokomari/delete-book/103
    @DeleteMapping("/delete-book/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
    }


    //localhost:8090/my-rokomari/update-book?id=104
    @PutMapping("/update-book")
    public String updateBook(@RequestParam("id") int id, @RequestBody Book b){
        return bookService.updateBook(id,b);
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
