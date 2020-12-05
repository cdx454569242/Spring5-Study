package Spring5.CollectionType;

import java.util.List;

/**
 * @author
 * @create 2020-09-15 21:11
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
