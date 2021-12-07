DROP TABLE IF EXISTS IQ_TAGS;

CREATE TABLE IQ_TAGS (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(20) NOT NULL,
  desc VARCHAR(250) NOT NULL
);

INSERT INTO IQ_TAGS (name, desc) VALUES
  ('JAVA', 'Java, Java8, J2EE'),
('Spring', 'Spring, Spring Boot'),
('SQL', 'Database, Oracle, MySql, Query');

