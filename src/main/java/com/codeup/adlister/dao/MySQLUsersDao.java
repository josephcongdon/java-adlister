package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements  Users{

    private Connection connection;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
            User user = null;
            String query = "SELECT * FROM users WHERE username =?";
            PreparedStatement ps;
            try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                user = new User(
                            rs.getLong("id"),
                            rs.getString("username"),
                            rs.getString("email"),
                            rs.getString("password")
                    );
                }
        } catch(SQLException throwables) {
            throwables.printStackTrace();
         }
            return user;
    }

    @Override
    public Long insert(User user) {
        String insertQuery = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }
    public static void main(String[] args) {
        Users usersDao = new MySQLUsersDao(new Config());
//        System.out.println(usersDao.findByUsername("bob123"));
//        System.out.println(usersDao.findByUsername("fred123"));

        User newUser = new User(
                "cathy123",
                "cathy@email.com",
                "letmein"
        );
        usersDao.insert(newUser);
    }
}


