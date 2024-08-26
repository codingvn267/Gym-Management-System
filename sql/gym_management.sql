create database gym;
use gym;
create table member (
	name varchar(70), 
    mobile bigint, 
    gender varchar(10), 
    weight float(5, 2), 
    height float(5, 2), 
    duration varchar(20), 
    packages varchar(50)
);

INSERT INTO member (name, mobile, gender, weight, height, duration, packages)
VALUES 
	('Tung Nguyen', 2626262626, 'Male', 70, 5.9, '1 year', 'Weight-Lifting'),
  ('John Doe', 9876543210, 'Male', 75, 6.0, '6 months', 'Bulking'),
	('Alice Johnson', 1234567890, 'Female', 55, 5.0, '3 months', 'Cardio');