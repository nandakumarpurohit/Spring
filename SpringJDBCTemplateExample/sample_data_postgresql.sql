create table people (
id int primary key auto_increment,
first_name varchar(20) not null,
last_name varchar(20) not null,
age int not null
);

insert into people (id, first_name, last_name, age) values
(1, 'Vlad', 'Boyarskiy', 21),
(2,'Oksi', ' Bahatskaya', 30),
(3,'Vadim', ' Vadimich', 32);

commit;