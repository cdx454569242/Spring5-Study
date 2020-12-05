package Spring5.Service;

import Spring5.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//注解中value属性值可以省略不写
//如果不写 默认值为类的名字,首字母小写
//UserService  --> userService
@Service(value = "userService") //<bean id=userService class="...">
public class UserService {
    @Value(value = "abc")
    private String name;

    //不需要添加set方法
//    @Autowired  //根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")
//    private UserDao userDao;


    //根据类型进行注入
    @Resource(name = "userDaoImpl1")   //根据名称进行注入
    private UserDao userDao;



    public void add(){
        System.out.println("Service add....");
        userDao.add();
        System.out.println(name);
    }
}
