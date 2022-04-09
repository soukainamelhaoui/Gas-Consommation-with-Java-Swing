package ma.fstt.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MissionTransaction extends BaseTransaction<Mission>{

    public MissionTransaction() throws SQLException {

    }

    @Override
    public void save(Mission object) throws SQLException {
        String request = "INSERT INTO  Mission( depart, arrive, kilometrage, consommation_theorique) VALUES(?,?,?,?)";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getDepart());
        this.preparedStatement.setString(2,object.getArrive());
        this.preparedStatement.setDouble(3,object.getKilometrage());
        this.preparedStatement.setDouble(4,object.getConsommationTheo());

        this.preparedStatement.execute();

    }

    @Override
    public void update(Mission object) throws SQLException {
        String request = "UPDATE Mission SET depart=? , arrive=?, kilometrage=? ,consommation_theorique=? WHERE Mission.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getDepart());
        this.preparedStatement.setString(2,object.getArrive());
        this.preparedStatement.setDouble(3,object.getKilometrage());
        this.preparedStatement.setDouble(4,object.getConsommationTheo());

        this.preparedStatement.execute();
    }

    @Override
    public void delete(Mission object) throws SQLException {
        String request = "DELETE FROM Mission WHERE Mission.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,object.getIdMission());

        this.preparedStatement.execute();

    }

    @Override
    public Mission getOne(Integer id) throws SQLException {
        String request = "SELECT * FROM Mission WHERE id = ?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,id);

        this.resultSet = this.preparedStatement.executeQuery();

        while (this.resultSet.next()){
            Mission temp = new Mission(
                    this.resultSet.getString(2),
                    this.resultSet.getString(3),
                    this.resultSet.getDouble(4),
                    this.resultSet.getDouble(5)
            );
            temp.setIdMission(this.resultSet.getInt(1));

            return temp;
        }
        return null;
    }

    @Override
    public List<Mission> getAll() throws SQLException {
        String request = "SELECT * FROM Mission";

        this.preparedStatement = this.connection.prepareStatement(request);


        this.resultSet = this.preparedStatement.executeQuery();

        List<Mission> missionList = new ArrayList<Mission>();


        while (this.resultSet.next()){
            Mission temp = new Mission(
                    this.resultSet.getString(2),
                    this.resultSet.getString(3),
                    this.resultSet.getDouble(4),
                    this.resultSet.getDouble(5)
            );
            temp.setIdMission(this.resultSet.getInt(1));

            missionList.add(temp);
        }
        return missionList;
    }
}
