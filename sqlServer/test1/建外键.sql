create table dep(--部门信息表 （父表）
	depno int primary key,--部门编号
	dname varchar(10)  --部门名称
)
--重点内容，如何建一个外键
--先执行父表再执行子表
create table emp( --员工信息（子表）
	empno int primary key,--员工编号
	ename varchar(10),    --员工姓名
	depno int foreign key references dep (depno)--部门编号
)

--如何建立外键，即外键到底建在那张表中才是正确的
--1，确立表之间的子夫关系
--2，外键一定是建在子表中的，且该外键是父表中的主键那一个列

insert into dep values (1,'财务部门')
insert into dep values (2,'总经办')

insert into emp values (1001,'张三',1)
insert into emp values (1002,'李四',1)
insert into emp values (1003,'王麻子',2)
insert into emp values (1004,'张三',2)

select * from emp
select * from dep

drop table emp;
drop table dep; 