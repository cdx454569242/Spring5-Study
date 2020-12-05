package Spring5.Service;

import Spring5.DAO.BookDao;
import Spring5.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @create 2020-10-02 15:44
 */
@Service
public class BookService {
    //注入Dao
    @Autowired
    private BookDao bookDao;

    //添加方法
    public void addBook(Book book){
        bookDao.add(book);
    }
    
    public void update(Book book){
        bookDao.updateBook(book);
    }

    public void delete(int id){
        bookDao.delete(id);
    }

    public int findCount(){
        return bookDao.selectCount();
    }

    public Book findBook(int id){
        return bookDao.findBook(id);
    }

    public List<Book> findBookAll(){
        return bookDao.findBookAll();
    }

    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }
}
