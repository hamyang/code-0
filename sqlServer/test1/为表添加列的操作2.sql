--1.Ϊ������еĲ���
/*
	alter table ���� add ���� �������� Լ��
*/

create table emp(
	empno char(4),
	ename varchar(6),
	depno int 
)

--Ϊ��������ݵ�����
insert into emp (empno,ename,depno)
values (1001,'aa',1)
insert into emp (empno,ename,depno)
values (1002,'bb',1)
insert into emp (empno,ename,depno)
values (1003,'cc',1)
insert into emp (empno,ename,depno)
values (1004,N'����',1)

--��ѯ���е�����
select * from emp

create table dep(
	depno char(4),
	dname varchar(6),
)
insert into dep(depno,dname) values (1,'����')
insert into dep(depno,dname) values (2,'�ܾ���')
select * from dep

--���Լ���Ķ���

--emp��Ա����
--dep�����ű�
--Ա���� VS ���ű� ===> n ��1

--���������Ա����Ĺ�ϵȷ�������õ�

select * from emp
select * from dep

insert into emp values (1006,'����',3)

--�����һ�����ã�����������ʱ����������ڸ������Ҳ�����
--�����ǵ�����ͻ���ֹ����������Ϊ�˱������ݵ�һ����

update emp set depno = 2 where empno = 1006

--����ڶ������ã��������ű����ݵ�һ����


