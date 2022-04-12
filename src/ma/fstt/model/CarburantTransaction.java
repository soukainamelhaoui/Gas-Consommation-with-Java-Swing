package ma.fstt.model;

import java.sql.SQLException;
import java.util.List;

public class CarburantTransaction extends BaseTransaction<Carburant>{

    public CarburantTransaction() throws SQLException {
    }

    @Override
    public void save(Carburant object) throws SQLException {
        String request = "INSERT INTO  Carburant( libelle, pu, date, quantity, id_vehicule) VALUES(?,?,?,?,?)";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getLibelle());
        this.preparedStatement.setDouble(2,object.getPu());
        this.preparedStatement.setString(3,object.getDate());
        this.preparedStatement.setDouble(4,object.getQuantity());
        this.preparedStatement.setInt(5,object.getIdVehicule());

        this.preparedStatement.execute();

    }

    @Override
    public void update(Carburant object) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

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
