package Spring5;

/**
 * 使用set方法进行属性的注入
 */
public class Book {
    private String bkName;
    private String bkAuthor;
    private String bkAddress;

    //创建set方法
    public void setBkName(String bkName) {
        this.bkName = bkName;
    }

    public void setBkAuthor(String bkAuthor) {
        this.bkAuthor = bkAuthor;
    }

    public void setBkAddress(String bkAddress) {
        this.bkAddress = bkAddress;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bkName='" + bkName + '\'' +
                ", bkAuthor='" + bkAuthor + '\'' +
                ", bkAddress='" + bkAddress + '\'' +
                '}';
    }
}
