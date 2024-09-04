show databases;
use bankmanagementsystem;
show tables;
select * from signup;
create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital_status varchar(20), address varchar(30), city varchar(20), state varchar(20), pin varchar(20));
CREATE TABLE signtwo (
    formno VARCHAR(20),
    religion VARCHAR(20),
    category VARCHAR(20),
    income VARCHAR(20),
    education VARCHAR(20),
    occupation VARCHAR(20),
    Pan_no VARCHAR(20),
    Adhaar_no VARCHAR(20),
    senior_citizen VARCHAR(20),
    existing_account VARCHAR(20)
);

select * from signtwo;

CREATE TABLE signthree (
    formno VARCHAR(20),
    AccountType VARCHAR(40),
    cardnumber VARCHAR(25),
    Pin VARCHAR(10),
    Facility VARCHAR(100)
);

select * from signthree;

CREATE TABLE login(
	formno varchar(20),
    cardnumber varchar(25),
    pin varchar(10)
);

select * from login;

select * from bank;

create table bank(
	pin varchar(10), 
	date varchar(50), 
	type varchar(20),
	amount varchar(20)
);

drop table bank;


