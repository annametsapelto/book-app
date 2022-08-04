import java.util.List;

import com.metsapelto.anna.bookapp.Object.Book;

public interface BookDAO {
    List<Book> get();

    Book get(int id);

    void save(Book book);

    void delete(int id);
}