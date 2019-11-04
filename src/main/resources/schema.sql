CREATE TABLE member (
memberId varchar(30) NOT NULL,
name varchar(30) NOT NULL,
nic varchar(30) NOT NULL,
address varchar(200),
email varchar(30),
contactNo varchar(30),
numberOfBookIssued varchar(30),
status varchar(30),
description varchar(100),
PRIMARY KEY (memberId)
);