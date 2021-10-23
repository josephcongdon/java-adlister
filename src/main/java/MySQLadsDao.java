import com.mysql.cj.jdbc.Driver;
import dao.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLadsDao implements Ads{

    private Connection connection;


    public MySQLadsDao(Config config) {
        try {
        DriverManager.registerDriver(new Driver());
                this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
            List<Ad> ads = new ArrayList<>();
            String query = "SELECT * FROM ads";
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                );
                ads.add(ad);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return ads;
    }


    @Override
    public Long insert(Ad ad) {
        long lastInsertedId = 0L;
       try {
            Statement statement = connection.createStatement();
            String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
           ResultSet generatedKeys = statement.getGeneratedKeys();
            generatedKeys.next();
           lastInsertedId  = generatedKeys.getLong(1);

       }catch (SQLException throwables){
            throwables.printStackTrace();
        }
       return lastInsertedId;
    }

    public static void main(String[] args) {

        MySQLadsDao mySQLadsDao = new MySQLadsDao(new Config());

        Ad adToInsert = new Ad(
          1,
          "Test Insert Ad",
          "Test Insert Ad Description"
        );

        System.out.println(mySQLadsDao.insert(adToInsert));
    }

}
