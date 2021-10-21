import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCIntro {
    public static void main(String[] args) {
        System.out.println("sup, world");

        //register driver
                try{


        DriverManager.registerDriver(new Driver());

                    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",                                     "root",
            "codeup"
                         );

                    Statement statement = connection.createStatement();

                    ResultSet resultSet = statement.executeQuery("SELECT * FROM albums");
                    List<Album> albums = new ArrayList<>();


                     while(resultSet.next()) {
                         Album album = new Album(resultSet.getLong("id"),
                            resultSet.getString("artist"),
                            resultSet.getString("name"),
                            resultSet.getInt("release_date"),
                            resultSet.getDouble("sales"),
                            resultSet.getString("genre")
                         );
                         albums.add(album);
                     }
                     for (Album album : albums) {
                         System.out.println(album);
                         System.out.println("===============================");
                     }
//
//                    // ======================== UPDATE A RECORD
//
//                     Album updateAlbum = new Album(
//                             2,
//                             "The Reign of Kindo",
//                             "This is what happens",
//                             2010,
//                             50,
//                             "alternative/indie, rock"
//                     );
//
//                    String updateQuery = String.format("UPDATE albums SET artist = '%s', name = '%s', release_date = %d, sales = %f, genre = '%s' WHERE id = %d",
//                                     updateAlbum.getArtist(),
//                                     updateAlbum.getName(),
//                                     updateAlbum.getReleaseDate(),
//                                     updateAlbum.getSales(),
//                                     updateAlbum.getGenre(),
//                                     updateAlbum.getId()
//                             );
//
//                    System.out.println(updateQuery);

                    Album brandNewAlbum = new Album(
                            30,"Steely Dan", "Donald Fagen", 1970, "jazz"
                    );


                    String insertQuery = String.format("INSERT INTO albums (artist, name, release_date, sales, genre) VALUES ('%s', '%s', %d, %f, '%s')",
                            brandNewAlbum.getArtist(),
                            brandNewAlbum.getName(),
                            brandNewAlbum.getReleaseDate(),
                            brandNewAlbum.getSales(),
                            brandNewAlbum.getGenre()
                    );

                    System.out.println(insertQuery);
                    statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);



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

                    System.out.println(albums);
        } catch (SQLException throwables){
                    throwables.printStackTrace();
        }
    }
}
