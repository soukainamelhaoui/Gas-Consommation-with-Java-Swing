package ma.fstt.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChauffeurTransaction extends BaseTransaction<Chauffeur> {
    public ChauffeurTransaction() throws SQLException {
    }

    @Override
    public void save(Chauffeur object) throws SQLException {
        String request = "INSERT INTO  User( nom, prenom, type, code) VALUES(?,?,?,?)";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getNom());
        this.preparedStatement.setString(2,object.getPrenom());
        this.preparedStatement.setString(3,"CHAUFFEUR");
        this.preparedStatement.setString(4,object.getCode());

        this.preparedStatement.execute();
    }

    @Override
    public void update(Chauffeur object) throws SQLException {

        String request = "UPDATE User SET nom=? , prenom=?, type=? ,code=? WHERE User.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setString(1,object.getNom());
        this.preparedStatement.setString(2,object.getPrenom());
        this.preparedStatement.setString(3,"CHAUFFEUR");
        this.preparedStatement.setString(4,object.getCode());
        this.preparedStatement.setInt(5,object.getId());

        this.preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {
        String request = "DELETE FROM User WHERE User.id=?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,id);

        this.preparedStatement.execute();
    }

    @Override
    public Chauffeur getOne(Integer id) throws SQLException {
        String request = "SELECT * FROM User WHERE id = ?";

        this.preparedStatement = this.connection.prepareStatement(request);

        this.preparedStatement.setInt(1,id);

        this.resultSet = this.preparedStatement.executeQuery();

        while (this.resultSet.next()){
            Chauffeur temp = new Chauffeur(
                    this.resultSet.getString(2),
                    this.resultSet.getString(3),
                    this.resultSet.getString(5)
            );
            temp.setId(this.resultSet.getInt(1));

            return temp;
        }

        return null;
    }

    @Override
    public List<Chauffeur> getAll() throws SQLException {

        String request = "SELECT * FROM User WHERE type='CHAUFFEUR'";

        this.preparedStatement = this.connection.prepareStatement(request);


        this.resultSet = this.preparedStatement.executeQuery();

        List<Chauffeur> chauffeurList = new ArrayList<Chauffeur>();


        while (this.resultSet.next()){
            Chauffeur temp = new Chauffeur(
                    this.resultSet.getString(2),
                    this.resultSet.getString(3),
                    this.resultSet.getString(5)
            );
            temp.setId(this.resultSet.getInt(1));

            chauffeurList.add(temp);
        }
        return chauffeurList;
    }

}
