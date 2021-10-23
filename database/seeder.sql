USE adlister_db;

INSERT INTO users(username, email, password) VALUES
('joe', 'jocongdon@email.com', 'codeup');

INSERT INTO ads(user_id, title, description) VALUES
(1, 'Test Ad1', 'This is a description of test ad 1.'),
(1, 'Test Ad2', 'This is a description of test ad 2.'),
(1, 'Test Ad3', 'This is a description of test ad 3.'),
(1, 'Test Ad4', 'This is a description of test ad 4.'),
(1, 'Test Ad5', 'This is a description of test ad 5.');

