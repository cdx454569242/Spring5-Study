package Spring5.Service;

import Spring5.DAO.UserDao;
import Spring5.DAO.UserDaoImpl;

/**
 *
 */
public class UserService {

    //创建userDao属性类型 生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add....");
        userDao.update();
    }
}
