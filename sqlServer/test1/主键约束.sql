--主键约束

--第一种主键约束的定义
--a.在创建表的时候定义主键约束
create table A_1(
	a_no int primary key,--次定义方式系统会自动生成一个主键约束名称
	a_name varchar(10) 

)

--主键到底有什么用处
--1，一个列被定义成主键后，次列中的数据不能为null
--2，被定义成主键的列，其数据必须是唯一

insert into A_1 values (1,'张三')
insert into A_1 values (2,'李四')
insert into A_1 values (3,'李四')

select * from A_1

--第二种主键约束的定义，不会系统自定义
create table A_2(
	a_no int,
	a_name varchar(10),
	constraint PK_A_2 primary key (a_no)
)

insert into A_2 values (1,'张三')
insert into A_2 values (2,'李四')

select * from A_2

--第三种主键约束定义的方式
create table A_3(
	a_no int,
	a_name varchar(10)
)
--如果创建的表中某一列想定义为一个主键必须满足一个前提条件
--也就是说该列不能为空（null）

alter table A_3 alter column a_no int not null -- 定义为非空，后面会讲

alter table A_3 add constraint PK_A_3 primary key (a_no)

insert into A_3 values (1,'张三')
insert into A_3 values (2,'李四')

select * from A_3