--����Լ��

--��һ������Լ���Ķ���
--a.�ڴ������ʱ��������Լ��
create table A_1(
	a_no int primary key,--�ζ��巽ʽϵͳ���Զ�����һ������Լ������
	a_name varchar(10) 

)

--����������ʲô�ô�
--1��һ���б�����������󣬴����е����ݲ���Ϊnull
--2����������������У������ݱ�����Ψһ

insert into A_1 values (1,'����')
insert into A_1 values (2,'����')
insert into A_1 values (3,'����')

select * from A_1

--�ڶ�������Լ���Ķ��壬����ϵͳ�Զ���
create table A_2(
	a_no int,
	a_name varchar(10),
	constraint PK_A_2 primary key (a_no)
)

insert into A_2 values (1,'����')
insert into A_2 values (2,'����')

select * from A_2

--����������Լ������ķ�ʽ
create table A_3(
	a_no int,
	a_name varchar(10)
)
--��������ı���ĳһ���붨��Ϊһ��������������һ��ǰ������
--Ҳ����˵���в���Ϊ�գ�null��

alter table A_3 alter column a_no int not null -- ����Ϊ�ǿգ�����ὲ

alter table A_3 add constraint PK_A_3 primary key (a_no)

insert into A_3 values (1,'����')
insert into A_3 values (2,'����')

select * from A_3