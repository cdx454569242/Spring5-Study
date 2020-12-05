package Spring5.DAO;

import Spring5.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @create 2020-10-02 15:45
 */
@Service
public interface BookDao {

    void add(Book book);

    void updateBook(Book book);

    void delete(int id);

    int selectCount();

    Book findBook(int id);

    List<Book> findBookAll();

    void batchAddBook(List<Object[]> batchArgs);
}
