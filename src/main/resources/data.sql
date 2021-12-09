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

DROP TABLE IF EXISTS IQ_QUESTIONS;

CREATE TABLE IQ_QUESTIONS (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(20) NOT NULL,
  desc VARCHAR(250) NOT NULL,
  interview_session int NOT NULL
);

INSERT INTO IQ_QUESTIONS (title, desc, interview_session) VALUES
('What is inheritance ?', 'Describe inheritance with example'),
('What is Spring application context ?', 'Explain application context with DI life-cycle'),
('What is drop, delete & truncate ?', 'State key difference of these three keywords');

DROP TABLE IF EXISTS IQ_INTERVIEW_SESSIONS;

CREATE TABLE IQ_INTERVIEW_SESSIONS (
  id INT AUTO_INCREMENT PRIMARY KEY,
  createdBy INT NOT NULL,
  candidate VARCHAR(250) NOT NULL,
  employer VARCHAR(127) NOT NULL,
  role VARCHAR(31),
  sessionToken VARCHAR(250),
  status VARCHAR(31) NOT NULL,
  reason VARCHAR(250),
  data CLOB,
  createdOn TIMESTAMP NOT NULL,
  updatedOn TIMESTAMP
);

INSERT INTO IQ_INTERVIEW_SESSIONS (createdBy, candidate, employer, role, sessionToken, status, reason, data, createdOn, updatedOn) VALUES
('AXcHZ-ACBD', 'Sundar Pichai', 'Google', 'R1', 'Jim Carry', '15-AUG-2021', 'In-Person'),
('VccLO-PCTD', 'Satya Nadella', 'Microsoft', 'R2', 'Robert Jr', '15-SEP-2021', 'Telephonic'),
('NXcVZ-JHBD', 'Indra Nooyi', 'Pepsico', 'R1', 'Jonney Depp', '15-OCT-2021', 'Video');


DROP TABLE IF EXISTS IQ_INTERVIEWS;

CREATE TABLE IQ_INTERVIEWS (
  id INT AUTO_INCREMENT PRIMARY KEY,
  session_token VARCHAR(20) NOT NULL,
  candidate VARCHAR(250) NOT NULL,
  employer VARCHAR(127) NOT NULL,
  round VARCHAR(31),
  interviewer VARCHAR(250),
  date DATE NOT NULL,
  mode VARCHAR(31)
);

INSERT INTO IQ_INTERVIEWS (session_token, candidate, employer, round, interviewer, date, mode) VALUES
('AXcHZ-ACBD', 'Sundar Pichai', 'Google', 'R1', 'Jim Carry', '15-AUG-2021', 'In-Person'),
('VccLO-PCTD', 'Satya Nadella', 'Microsoft', 'R2', 'Robert Jr', '15-SEP-2021', 'Telephonic'),
('NXcVZ-JHBD', 'Indra Nooyi', 'Pepsico', 'R1', 'Jonney Depp', '15-OCT-2021', 'Video');
