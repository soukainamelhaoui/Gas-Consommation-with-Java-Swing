package ma.fstt.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehiculeTrasaction extends BaseTransaction<Vehicule>{

    public VehiculeTrasaction() throws SQLException {
    }

    @Override
    public void save(Vehicule object) throws SQLException {
       

    }

    @Override
    public void update(Vehicule object) throws SQLException {


    }

    @Override
    public void delete(int id) throws SQLException {


    }

    @Override
    public Vehicule getOne(Integer id) throws SQLException {
        String request = "SELECT * FROM Vehicule WHERE id = ?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,id);

        this.resultSet = this.preparedStatement.executeQuery();

        while (this.resultSet.next()){
            Vehicule temp = null;
            if (Objects.equals(this.resultSet.getString(8), "BUS")){
                temp = new Bus(
                        this.resultSet.getString(2),
                        this.resultSet.getString(3),
                        this.resultSet.getInt(4),
                        this.resultSet.getDouble(5),
                        this.resultSet.getInt(6)
                );
                temp.setIdVehicule(this.resultSet.getInt(1));
            }else if (Objects.equals(this.resultSet.getString(8), "CAMMION")){
                temp = new Cammion(
                        this.resultSet.getString(2),
                        this.resultSet.getString(3),
                        this.resultSet.getInt(4),
                        this.resultSet.getDouble(5),
                        this.resultSet.getInt(6)
                );
                temp.setIdVehicule(this.resultSet.getInt(1));
            }

            return temp;
        }
        return null;
    }

    @Override
    public List<Vehicule> getAll() throws SQLException {
        return null;
    }
}
