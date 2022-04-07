package ma.fstt.model;

import java.sql.SQLException;
import java.util.List;

public class MissionTransaction extends BaseTransaction<Mission>{

    public MissionTransaction() throws SQLException {
    }

    @Override
    public void save(Mission object) throws SQLException {

    }

    @Override
    public void update(Mission object) throws SQLException {

    }

    @Override
    public void delete(Mission object) throws SQLException {

    }

    @Override
    public Mission getOne(Integer id) throws SQLException {
        return null;
    }

    @Override
    public List<Mission> getAll() throws SQLException {
        return null;
    }
}
