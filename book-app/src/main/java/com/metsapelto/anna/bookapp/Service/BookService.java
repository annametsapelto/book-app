import java.util.List;

import com.metsapelto.anna.bookapp.Object.Book;

public interface BookService {

    List<Book> get();

    Book get(int id);

    void save (Book book);

    void delete(int id);
}