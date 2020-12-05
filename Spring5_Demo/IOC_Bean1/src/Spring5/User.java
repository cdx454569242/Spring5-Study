package Spring5;

/**
 * @author
 * @create 2020-09-15 14:07
 */
public class User {

    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void add(){
        System.out.println("add");
    }
}
