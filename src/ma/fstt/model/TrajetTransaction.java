package ma.fstt.model;

import java.sql.SQLException;
import java.util.List;

public class TrajetTransaction extends BaseTransaction<Trajet>{
    public TrajetTransaction() throws SQLException {
    }

    @Override
    public void save(Trajet object) throws SQLException {

    }

    @Override
    public void update(Trajet object) throws SQLException {

    }

    @Override
    public void delete(Trajet object) throws SQLException {

    }

    @Override
    public Trajet getOne(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<Trajet> getAll() throws SQLException {
        return null;
    }
}
