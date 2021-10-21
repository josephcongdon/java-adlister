import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JDBCEmployees {

        public static void main(String[] args) {
            System.out.println("sup, world");

            //register driver
            try{


                DriverManager.registerDriver(new Driver());

                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",                                     "root",
                        "codeup"
                );

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM employees LIMIT 10");

                List<String> firstNames = new ArrayList<>();



                //                    resultSet.next();// look at first result
//                    resultSet.next();
//                    resultSet.next();
//                    if (resultSet.next()) {
//
//                        String firstArtist = resultSet.getString("artist");
//                        String firstAlbum = resultSet.getString("name");
//
//                        System.out.println(firstArtist);
//                        System.out.println(firstAlbum);
//                    }

                while(resultSet.next()){
                    String firstName = resultSet.getString("first_name");
                    firstNames.add(firstName);
//                    System.out.println(resultSet.getString("first_name"));
                }
//                System.out.println(firstNames);

            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }

