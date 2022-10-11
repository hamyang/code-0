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
values (1004,'黄洋',1)

--查询表中的数据
select * from emp

--为emp表添加地址字段
alter table emp add
eaddress varchar(50) default '成都'
--指定哪几列
insert into emp (empno,ename,depno)
values (1005,'黎明',2)

--2.删除表中的列操作-》首先要删除表中的约束
/*
alter table 表名 drop column 列名
*/

alter table emp drop column eaddress

--3.删除表中的约束
/*
alter table 表名 drop constraint 约束名
*/
alter table emp drop constraint DF__emp__eaddress__2E1BDC42


--4.修改表中的数据类型
/*
alter table 表名 alter column 列名 数据类型
*/
alter table emp alter column ename varchar(25)

