package ma.fstt.model;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class TrajetTransaction extends BaseTransaction<Trajet>{
    public TrajetTransaction() throws SQLException {
    }

    @Override
    public void save(Trajet object) throws SQLException, ParseException {
        String request = "INSERT INTO  Trajet( date_depart, date_arrive, consomation, id_mission, id_vehicule) VALUES(?,?,?,?,?)";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1, object.getDateDepart());
        this.preparedStatement.setString(2, object.getDateArrive());
        this.preparedStatement.setDouble(3,object.getConsommation());
        this.preparedStatement.setInt(4,object.getIdMission());
        this.preparedStatement.setInt(5,object.getIdVehicule());

        this.preparedStatement.execute();

    }

    @Override
    public void update(Trajet object) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

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
