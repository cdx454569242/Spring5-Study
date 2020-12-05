package AOPAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
@Component
@Aspect  //生成代理对象
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* AOPAnno.User.add(..))")
    public void pointdemo(){}


    //前置通知
    //@Before 注解表示作为前置通知
    @Before(value="pointdemo()")
    public void before(){
        System.out.println("before");
    }

    //环绕通知
    @Around(value="execution(* AOPAnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }

    //异常通知
    @AfterThrowing(value="execution(* AOPAnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //后置通知
    @AfterReturning(value="execution(* AOPAnno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //最终通知
    @After(value="execution(* AOPAnno.User.add(..))")
    public void after(){
        System.out.println("after");
    }




}
