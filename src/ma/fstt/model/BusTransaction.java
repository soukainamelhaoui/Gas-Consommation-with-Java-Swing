package ma.fstt.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BusTransaction extends BaseTransaction<Bus>{
    public BusTransaction() throws SQLException {
    }

    @Override
    public void save(Bus object) throws SQLException {
        String request = "INSERT INTO  Vehicule( numero, model, capa_res, poids, nbr_siege, type) VALUES(?,?,?,?,?,?)";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getNumero());
        this.preparedStatement.setString(2,object.getModel());
        this.preparedStatement.setInt(3,object.getCapaRes());
        this.preparedStatement.setDouble(4,object.getPoids());
        this.preparedStatement.setInt(5,object.getNbrSiege());
        this.preparedStatement.setString(6,"BUS");

        this.preparedStatement.execute();

    }

    @Override
    public void update(Bus object) throws SQLException {
        String request = "UPDATE Vehicule SET numero=? , model=?, capa_res=? ,poids=?, nbr_siege=?, type='BUS' WHERE Vehicule.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getNumero());
        this.preparedStatement.setString(2,object.getModel());
        this.preparedStatement.setInt(3,object.getCapaRes());
        this.preparedStatement.setDouble(4,object.getPoids());
        this.preparedStatement.setInt(5,object.getNbrSiege());
        this.preparedStatement.setString(6,"CAMMION");

        this.preparedStatement.execute();

    }

    @Override
    public void delete(Bus object) throws SQLException {
        String request = "DELETE FROM Vehicule WHERE Vehicule.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,object.getIdVehicule());

        this.preparedStatement.execute();


    }

    @Override
    public Bus getOne(Integer id) throws SQLException {
        String request = "SELECT * FROM Vehicule WHERE id = ?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,id);

        this.resultSet = this.preparedStatement.executeQuery();

        while (this.resultSet.next()){
            Bus temp = new Bus(
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
    public List<Bus> getAll() throws SQLException {
        String request = "SELECT * FROM Vehicule WHERE type='BUS'";

        this.preparedStatement = this.connection.prepareStatement(request);


        this.resultSet = this.preparedStatement.executeQuery();

        List<Bus> busList = new ArrayList<Bus>();


        while (this.resultSet.next()){
            Bus temp = new Bus(
                    this.resultSet.getString(2),
                    this.resultSet.getString(3),
                    this.resultSet.getInt(4),
                    this.resultSet.getDouble(5),
                    this.resultSet.getInt(6)
            );
            temp.setIdVehicule(this.resultSet.getInt(1));

            busList.add(temp);
        }
        return busList;
    }
}
