DROP TABLE IF EXISTS passengers;
DROP TABLE IF EXISTS bookings;

CREATE TABLE passengers (
  passenger_id CHAR(36) PRIMARY KEY,
  session_id VARCHAR(255) NOT NULL
);

CREATE TABLE bookings (
  session_id VARCHAR(255) PRIMARY KEY,
  reference VARCHAR(255) DEFAULT NULL,
  booking VARCHAR(1048576) DEFAULT NULL
);
