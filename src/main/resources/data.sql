-- select * from student, passport
-- where student.passport_id = passport.id
-- 
-- select s.id,s.name,s.passport_id,p.number as PASS_NUMBER from student s, passport p
-- where s.passport_id= p.id


-- Passport Insertion must be first because it is child table 
-- and unless you create a row in child table you can't create
-- a row in parent table in H2 Database since it is a file database

-- PASSPORT INSERTION
INSERT INTO Passport (id,number) values (201,'Ngp9791');
INSERT INTO Passport (id,number) values (202,'Pnp6483');
INSERT INTO Passport (id,number) values (203,'Yrt9876');
INSERT INTO Passport (id,number) values (204,'Rpb2345');
INSERT INTO Passport (id,number) values (205,'Mng8822');

-- STUDENT INSERTION
INSERT INTO Student (id,name,passport_id) values (101,'abhay',201);
INSERT INTO Student (id,name,passport_id) values (102,'bhagyashree',202);
INSERT INTO Student (id,name,passport_id) values (103,'viccky',203);
INSERT INTO Student (id,name,passport_id) values (104,'gopal',204);
INSERT INTO Student (id,name,passport_id) values (105,'uday',205);

-- COURSE INSERTION
INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (11,'JPA IN 50 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP() );
INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (12,'HIBERNATE IN 70 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (13,'BOOT IN 50 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (14,'JAVA IN 100 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());
INSERT INTO COURSE (ID, NAME,created_date, last_updated_date) values (15,'SPRING IN 1000 STEPS',CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());

-- REVIEW INSERTION
INSERT INTO Review (id,rating,description, course_id) values (301, 4,'Good Course',11);
INSERT INTO Review (id,rating,description, course_id) values (302, 2,'Average Course',12);
INSERT INTO Review (id,rating,description, course_id) values (303, 3,'SO SO COURSE',13);
INSERT INTO Review (id,rating,description, course_id) values (304, 5,'excellent Course',14);
INSERT INTO Review (id,rating,description, course_id) values (305, 3,'Faltu Course',15);

--  MANY TO MANY STUDENT_COURSE INSERTION
insert into student_course(student_id, course_id) values(101,13);
insert into student_course(student_id, course_id) values(101,11);
insert into student_course(student_id, course_id) values(104,14);
insert into student_course(student_id, course_id) values(102,12);
insert into student_course(student_id, course_id) values(105,11);




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