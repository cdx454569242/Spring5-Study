package Spring5.Bean;

/**
 * @author
 * @create 2020-09-16 14:15
 */
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步 无参数构造器创建");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用set方法设置值");
    }

    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("第三步 执行的初始化方法");
    }

    //创建执行的销毁方法
    public void destoryMethod(){
        System.out.println("第五步 执行销毁对象方法");
    }
}
