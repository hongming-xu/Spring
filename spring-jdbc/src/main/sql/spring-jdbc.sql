create database spring_jdbc default character set=utf8;

create table t_user(
  id int(4) primary key not null auto_increment,
  user_name varchar(10) not null,
  password varchar(20) not null
);





