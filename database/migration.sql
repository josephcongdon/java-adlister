DROP DATABASE  IF EXISTS  adlister_db;

CREATE DATABASE IF NOT EXISTS adlister_db;

USE adlister_db;

CREATE TABLE users(
                      id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                      username VARCHAR(80) NOT NULL,
                      email VARCHAR(100),
                      password VARCHAR(120) NOT NULL,
                      PRIMARY KEY(id)
);


CREATE TABLE ads(
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    user_id INT UNSIGNED NOT NULL,
                    title VARCHAR(120) NOT NULL,
                    description TEXT,
                    FOREIGN KEY(user_id) REFERENCES users(id),
                    PRIMARY KEY(id)
);
