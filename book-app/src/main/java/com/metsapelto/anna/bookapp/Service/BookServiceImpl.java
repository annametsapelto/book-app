import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.metsapelto.anna.bookapp.Object.Book;
import com.metsapelto.anna.bookapp.dao.BookDAO;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDao;

    @Transactional
    @Override
    public List<Book> get() {
        return bookDao.get();
    }

    @Transactional
    @Override
    public Book get(int id) {
        return bookDao.get(id);
    }

    @Transactional
    @Override
    public void save (Book book) {
        bookDao.save(book);
    }

    @Transactional
    @Override
    public void delete(int id) {
        bookDao.delete(id);
    }
}