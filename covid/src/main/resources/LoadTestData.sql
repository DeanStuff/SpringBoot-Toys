-- This script loads the provided sample data into the MYSQL DB.


drop table covidnetwork;
create table covidnetwork(id int NOT NULL, catchment varchar(255) NULL,network varchar(255) NULL,year int NULL, mmwrYear int NULL,mmwrWeek int NULL,ageCategory varchar(255) NULL,cumulativeRate real NULL,weeklyRate real NULL);
LOAD DATA LOCAL INFILE  'src/main/resources/TestData/covid-network.csv' INTO TABLE covidnetwork FIELDS TERMINATED BY ','  ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES (id, catchment,network,year, mmwrYear,mmwrWeek,ageCategory,cumulativeRate,weeklyRate);
commit;

drop table mock_person;
create table mock_person(id int NOT NULL, first_name varchar(255) NOT NULL,last_name varchar(255) NOT NULL, email varchar(255) NULL, gender varchar(10) NULL, ip_address varchar(255) NULL, state varchar(255) NULL, state_abbrev varchar(2) NULL);
LOAD DATA LOCAL INFILE  'src/main/resources/TestData/person-state-test.csv' INTO TABLE mock_person FIELDS TERMINATED BY ','  ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES (id,first_name,last_name,email,gender,ip_address,state,state_abbrev);
commit;

drop table mock_state;
create table mock_state(id int NOT NULL, state varchar(255), state_abbrev varchar(2), animal varchar(255), movie varchar(255));
LOAD DATA LOCAL INFILE  'src/main/resources/TestData/state-stuff-test.csv' INTO TABLE mock_state FIELDS TERMINATED BY ','  ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES (id,state,state_abbrev,animal,movie);
commit;
