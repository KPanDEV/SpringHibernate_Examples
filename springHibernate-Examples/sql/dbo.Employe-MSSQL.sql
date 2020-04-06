---For Micorsoft Sql server
CREATE TABLE EMPLOYEE (
    id int IDENTITY(1,1) PRIMARY KEY,
   EmployeeName varchar(50) NOT NULL,
    salary float NOT NULL,
    ssn VARCHAR(30) NOT NULL UNIQUE
);

Select * from employee