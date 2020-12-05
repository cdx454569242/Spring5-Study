package Spring5.Test;

import Spring5.Entity.Book;
import Spring5.Service.BookService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author
 * @create 2020-10-02 16:00
 */
public class TestBook {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //bookService.addBook(new Book(1,"ABook","AAA"));

//        bookService.update(new Book(1,"BBook","BBB"));

//        bookService.delete(1);

//        int count = bookService.findCount();
//        System.out.println(count);

//        Book book = bookService.findBook(2);
//        System.out.println(book);

        List<Book> bookAll = bookService.findBookAll();
        System.out.println(bookAll);
    }


}
