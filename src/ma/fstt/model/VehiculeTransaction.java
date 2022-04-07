package ma.fstt.model;

import java.sql.SQLException;
import java.util.List;

public class VehiculeTransaction extends BaseTransaction<Vehicule>{
    public VehiculeTransaction() throws SQLException {
    }

    @Override
    public void save(Vehicule object) throws SQLException {

    }

    @Override
    public void update(Vehicule object) throws SQLException {

    }

    @Override
    public void delete(Vehicule object) throws SQLException {

    }

    @Override
    public Vehicule getOne(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<Vehicule> getAll() throws SQLException {
        return null;
    }
}
