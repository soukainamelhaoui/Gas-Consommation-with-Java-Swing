package ma.fstt.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CammionTrasaction extends BaseTransaction<Cammion>{

    public CammionTrasaction() throws SQLException {
    }

    @Override
    public void save(Cammion object) throws SQLException {
        String request = "INSERT INTO  Vehicule( numero, model, capa_res, poids, capacite, type) VALUES(?,?,?,?,?,?)";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getNumero());
        this.preparedStatement.setString(2,object.getModel());
        this.preparedStatement.setInt(3,object.getCapaRes());
        this.preparedStatement.setDouble(4,object.getPoids());
        this.preparedStatement.setInt(5,object.getCapacite());
        this.preparedStatement.setString(6,"CAMMION");

        this.preparedStatement.execute();

    }

    @Override
    public void update(Cammion object) throws SQLException {
        String request = "UPDATE Vehicule SET numero=? , model=?, capa_res=? ,poids=?, capacite=?, type='CAMMION' WHERE Vehicule.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getNumero());
        this.preparedStatement.setString(2,object.getModel());
        this.preparedStatement.setInt(3,object.getCapaRes());
        this.preparedStatement.setDouble(4,object.getPoids());
        this.preparedStatement.setInt(5,object.getCapacite());
        this.preparedStatement.setInt(6,object.getIdVehicule());

        this.preparedStatement.execute();

    }

    @Override
    public void delete(int id) throws SQLException {
        String request = "DELETE FROM Vehicule WHERE Vehicule.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,id);

        this.preparedStatement.execute();

    }

    @Override
    public Cammion getOne(Integer id) throws SQLException {
        String request = "SELECT * FROM Vehicule WHERE id = ?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,id);

        this.resultSet = this.preparedStatement.executeQuery();

        while (this.resultSet.next()){
            Cammion temp = new Cammion(
                    this.resultSet.getString(2),
                    this.resultSet.getString(3),
                    this.resultSet.getInt(4),
                    this.resultSet.getDouble(5),
                    this.resultSet.getInt(6)
            );
            temp.setIdVehicule(this.resultSet.getInt(1));

            return temp;
        }
        return null;
    }

    @Override
    public List<Cammion> getAll() throws SQLException {
        String request = "SELECT * FROM Vehicule WHERE type='CAMMION'";

        this.preparedStatement = this.connection.prepareStatement(request);


        this.resultSet = this.preparedStatement.executeQuery();

        List<Cammion> cammionList = new ArrayList<Cammion>();


        while (this.resultSet.next()){
            Cammion temp = new Cammion(
                    this.resultSet.getString(2),
                    this.resultSet.getString(3),
                    this.resultSet.getInt(4),
                    this.resultSet.getDouble(5),
                    this.resultSet.getInt(6)
            );
            temp.setIdVehicule(this.resultSet.getInt(1));

            cammionList.add(temp);
        }
        return cammionList;
    }
}
