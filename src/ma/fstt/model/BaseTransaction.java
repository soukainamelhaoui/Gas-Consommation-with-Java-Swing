package ma.fstt.model;

import java.text.ParseException;
import java.util.*;
import java.sql.*;

public abstract class BaseTransaction<T> {
    protected Connection connection ;
    protected Statement statement ;

    protected PreparedStatement preparedStatement ;

    protected ResultSet resultSet ;

    private String url = "jdbc:mysql://localhost:3306/GConsommation";
    private String login ="root";
    private String password ="";

    public BaseTransaction () throws SQLException {
        this.connection = DriverManager.getConnection(url, login, password);
    }



    public abstract void save(T object) throws SQLException, ParseException;
    public abstract void update(T object) throws SQLException;
    public abstract void delete(int id) throws SQLException;


    public abstract T getOne(Integer id) throws SQLException;
    public abstract List<T> getAll() throws SQLException;

}
