package Spring5.Service;

import Spring5.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
    @Autowired
    private UserDao userDao;

    public void accountMoney(){
//        try{
            userDao.addMoney();
            int i = 10/0;
            userDao.reduceMoney();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
