package Spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author
 * @create 2020-09-16 19:43
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        String abc = dao.update("abc");
        System.out.println(add);
        System.out.println(abc);

    }
}

//创建代理对象代码

class UserDaoProxy implements InvocationHandler{

    //1.把创建的是谁的代理对象,把谁传递过来

    private Object userDao;

    //有参数构造器
    public UserDaoProxy(Object userDao){
        this.userDao = userDao;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法执行之前..."+method.getName()+" : 传递参数..." + Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(userDao, args);

        //方法之后
        System.out.println("方法执行之后..." + res);
        return res;
    }
}
