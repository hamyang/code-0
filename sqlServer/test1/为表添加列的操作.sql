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
values (1004,'����',1)

--��ѯ���е�����
select * from emp

--Ϊemp����ӵ�ַ�ֶ�
alter table emp add
eaddress varchar(50) default '�ɶ�'
--ָ���ļ���
insert into emp (empno,ename,depno)
values (1005,'����',2)

--2.ɾ�����е��в���-������Ҫɾ�����е�Լ��
/*
alter table ���� drop column ����
*/

alter table emp drop column eaddress

--3.ɾ�����е�Լ��
/*
alter table ���� drop constraint Լ����
*/
alter table emp drop constraint DF__emp__eaddress__2E1BDC42


--4.�޸ı��е���������
/*
alter table ���� alter column ���� ��������
*/
alter table emp alter column ename varchar(25)

