import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.metsapelto.anna.bookapp.Object.Book;

@Repository
public class BookDAOImp implements BookDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Book> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Book> query = currentSession.createQuery("from book", Book.class);
        List<Book> bookList = query.getResultList();
        return bookList;
    }
    @Override
    public Book get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Book book = currentSession.get(Book.class, id);
        return book;
    }

    @Override
    public void save(Book book) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(book);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Book book = currentSession.get(Book.class, id);
        currentSession.delete(book);
    }
}