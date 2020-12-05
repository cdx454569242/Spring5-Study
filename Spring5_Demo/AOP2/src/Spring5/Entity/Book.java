package Spring5.Entity;

/**
 * @author
 * @create 2020-10-02 15:53
 */
public class Book {
    public Book() {
    }

    public Book(String username, String ustatus) {
        this.username = username;
        this.ustatus = ustatus;
    }

    public Book(int user_id, String username, String ustatus) {
        this.user_id = user_id;
        this.username = username;
        this.ustatus = ustatus;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    private int user_id;
    private String username;
    private String ustatus;
}
