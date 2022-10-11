--1.为表添加列的操作
/*
	alter table 表名 add 列名 数据类型 约束
*/

create table emp(
	empno char(4),
	ename varchar(6),
	depno int 
)

--为表插入数据的命令
insert into emp (empno,ename,depno)
values (1001,'aa',1)
insert into emp (empno,ename,depno)
values (1002,'bb',1)
insert into emp (empno,ename,depno)
values (1003,'cc',1)
insert into emp (empno,ename,depno)
values (1004,N'黄洋',1)

--查询表中的数据
select * from emp

create table dep(
	depno char(4),
	dname varchar(6),
)
insert into dep(depno,dname) values (1,'财务部')
insert into dep(depno,dname) values (2,'总经办')
select * from dep

--外键约束的定义

--emp，员工表
--dep，部门表
--员工表 VS 部门表 ===> n ：1

--外键就是针对表与表的关系确立而设置的

select * from emp
select * from dep

insert into emp values (1006,'李潇',3)

--外键第一个作用，当插入数据时候，如果数据在父表当中找不到，
--那我们的外键就会阻止你插入操作，为了保存数据的一致性

update emp set depno = 2 where empno = 1006

--外键第二个作用，保持两张表数据的一致性


