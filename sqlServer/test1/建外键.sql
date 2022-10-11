create table dep(--������Ϣ�� ������
	depno int primary key,--���ű��
	dname varchar(10)  --��������
)
--�ص����ݣ���ν�һ�����
--��ִ�и�����ִ���ӱ�
create table emp( --Ա����Ϣ���ӱ�
	empno int primary key,--Ա�����
	ename varchar(10),    --Ա������
	depno int foreign key references dep (depno)--���ű��
)

--��ν����������������׽������ű��в�����ȷ��
--1��ȷ����֮����ӷ��ϵ
--2�����һ���ǽ����ӱ��еģ��Ҹ�����Ǹ����е�������һ����

insert into dep values (1,'������')
insert into dep values (2,'�ܾ���')

insert into emp values (1001,'����',1)
insert into emp values (1002,'����',1)
insert into emp values (1003,'������',2)
insert into emp values (1004,'����',2)

select * from emp
select * from dep

drop table emp;
drop table dep; 