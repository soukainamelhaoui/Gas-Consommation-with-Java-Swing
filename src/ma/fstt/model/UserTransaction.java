package ma.fstt.model;

import java.sql.SQLException;
import java.util.List;

public class UserTransaction extends BaseTransaction<User> {

    public UserTransaction() throws SQLException {
    }

    @Override
    public void save(User object) throws SQLException {

    }

    @Override
    public void update(User object) throws SQLException {

    }

    @Override
    public void delete(User object) throws SQLException {

    }

    @Override
    public User getOne(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<User> getAll() throws SQLException {
        return null;
    }
}
