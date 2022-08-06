import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metsapelto.anna.bookapp.Service.BookService;
import com.metsapelto.anna.bookapp.Object.Book;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> get() {
        return bookService.get();
    }

    @PostMapping("/book")
    public Book save(@RequestBody Book book) {
        bookService.save(book);
        return book;
    }

    @GetMapping("/book/{id}")
    public Book get(@PathVariable int id) {
        return bookService.get(id);
    }

    @DeleteMapping("/book/{id}")
    public String delete(@PathVariable int id) {
        bookService.delete(id);
        return "Book removed with id " + id;
    }

    @PutMapping("/book")
    public Book update(@RequestBody Book Book) {
        bookService.save(book);
        return book;
    }

}