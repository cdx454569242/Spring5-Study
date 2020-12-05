package AOPAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

/**
 *
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    @Before(value="execution(* AOPAnno.User.add(..))")
    public void before(){
        System.out.println("person before");
    }
}
