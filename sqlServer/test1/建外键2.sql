--第二种，在创建表的同时，自定义外键的名称

create table b(
	b_no int primary key,
	b_name varchar(10)
)
--B VS C ==>1 : n
create table c(
	c_no int primary key,
	c_name varchar(10),
	b_no int,-- foreign key references b (b_no)
	constraint FK_C/*自定义外键名称*/ foreign key (b_no) references B (b_no)
)

--第三种，创建外键约束的方法

--D VS E ==>1 : n
create table D(
	d_no int primary key,
	d_name varchar(10)
)
create table E(
	e_no int primary key,
	e_name varchar(10),
	d_no int
)
alter table E add constraint FK_E
foreign key (d_no)
references D (d_no)

--总结外键的创建方式

--1，确立表之间的子夫关系
--2，外键一定是创建在子表当中的，而且与父表的主键扯上关系
--3，在创建表的时候就可以添加外键
alter table  表一 add constraint FK_XXX
foreign key (XXX)
references 表二 (XXX)