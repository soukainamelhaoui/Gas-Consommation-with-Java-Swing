package ma.fstt.model;

import java.sql.SQLException;
import java.util.List;

public class CarburantTransaction extends BaseTransaction<Carburant>{

    public CarburantTransaction() throws SQLException {
    }

    @Override
    public void save(Carburant object) throws SQLException {

    }

    @Override
    public void update(Carburant object) throws SQLException {

    }

    @Override
    public void delete(Carburant object) throws SQLException {

    }

    @Override
    public Carburant getOne(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<Carburant> getAll() throws SQLException {
        return null;
    }
}
