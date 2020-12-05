package Spring5.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;


/**
 * @author
 * @create 2020-10-07 15:21
 */
public class Userlog {
    private static final Logger log = LoggerFactory.getLogger(Userlog.class);

    public static void main(String[] args) {
        log.info("hello");
        log.warn("warm");
    }
}
