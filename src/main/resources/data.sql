INSERT INTO student (id,name) values (101,'abhay');

INSERT INTO student (id,name) values (102,'bhagyashree');

INSERT INTO student (id,name) values (103,'viccky');

INSERT INTO student (id,name) values (104,'gopal');

INSERT INTO student (id,name) values (105,'uday');


INSERT INTO passport (id,number) values (201,'Ngp9791');

INSERT INTO passport (id,number) values (202,'Pnp6483');

INSERT INTO passport (id,number) values (203,'Yrt9876');

INSERT INTO passport (id,number) values (204,'Rpb2345');

INSERT INTO passport (id,number) values (205,'Mng8822');


INSERT INTO review (id,rating,description) 
values (301, 4,'Good Course');


INSERT INTO review (id,rating,description) 
values (302, 2,'Average Course');


INSERT INTO review (id,rating,description) 
values (303, 3,'SO SO COURSE');


INSERT INTO review (id,rating,description) 
values (304, 5,'excellent Course');


INSERT INTO review (id,rating,description) 
values (305, 3,'Faltu Course');



--#INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (101,'JPA IN 50 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP() );
--
--INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (102,'HIBERNATE IN 70 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
--
--INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (103,'BOOT IN 50 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
--
--INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (104,'JAVA IN 100 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
--
--INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (105,'SPRING IN 1000 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());



--create table person
--(
--   id integer not null,
--   name varchar(255) not null,
--   location varchar(255),
--   birth_date date,
--   primary key(id)
--);
--INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
--VALUES(101,  'Abhay', 'London',sysdate());
--INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
--VALUES(102,  'Anand', 'New York',sysdate());
--INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
--VALUES(103,  'Bhagyashree', 'Amsterdam',sysdate());