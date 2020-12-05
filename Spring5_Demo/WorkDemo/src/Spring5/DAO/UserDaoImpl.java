package Spring5.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money-? where id=?";
        jdbcTemplate.update(sql,100,1);
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money+? where id=?";
        jdbcTemplate.update(sql,100,2);
    }
}
