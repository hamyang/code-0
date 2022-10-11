create table A_4(
	a_name varchar(10),
	a_sex varchar(2) constraint ck_a check(a_sex = '男' or a_sex='女' )
)

insert into A_4 (a_name,a_sex)values('张三','男') 
insert into A_4 (a_name,a_sex)values('美女','女') 

--约束实列
create table 我的会员(
	会员编号 smallint not null constraint membernochk
	check(会员编号 between 1 and 10000),
	姓名 nvarchar(20) not null,
	地址 nvarchar(60) not null,
);
insert into 我的会员 (会员编号,姓名,地址)values(1001,'张三','四川眉山') 
insert into 我的会员 (会员编号,姓名,地址)values(1002,'李四','重庆') 

select*from 我的会员

--约束的另一种定义方式
create table 我的会员2(
	会员编号 smallint not null,
	姓名 nvarchar(20) not null,
	地址 nvarchar(60) not null,
	constraint chkmemberno
	check(会员编号 between 1 and 10000)
); 
insert into 我的会员2 (会员编号,姓名,地址)values(1001,'王麻子','眉山') 
insert into 我的会员2 (会员编号,姓名,地址)values(1002,'李潇','广东') 

select*from 我的会员2