--Íâ¼üÔ¼Êø
create table Category
(
	Id int primary key,
	CategoryName varchar(20) 
);
create table Product
(
	Id int primary key,
	CategoryId int foreign key references Category(Id),
	ProductName varchar(30),
	Price decimal(10,2)
);
