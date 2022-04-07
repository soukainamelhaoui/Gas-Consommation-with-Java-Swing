package ma.fstt.model;

import java.sql.SQLException;
import java.util.List;

public class CammionTrasaction extends BaseTransaction<Cammion>{

    public CammionTrasaction() throws SQLException {
    }

    @Override
    public void save(Cammion object) throws SQLException {

    }

    @Override
    public void update(Cammion object) throws SQLException {

    }

    @Override
    public void delete(Cammion object) throws SQLException {

    }

    @Override
    public Cammion getOne(Integer idCammion) throws SQLException {
        return null;
    }

    @Override
    public List<Cammion> getAll() throws SQLException {
        return null;
    }
}
