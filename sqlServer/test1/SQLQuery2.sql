create table A_4(
	a_name varchar(10),
	a_sex varchar(2) constraint ck_a check(a_sex = '��' or a_sex='Ů' )
)

insert into A_4 (a_name,a_sex)values('����','��') 
insert into A_4 (a_name,a_sex)values('��Ů','Ů') 

--Լ��ʵ��
create table �ҵĻ�Ա(
	��Ա��� smallint not null constraint membernochk
	check(��Ա��� between 1 and 10000),
	���� nvarchar(20) not null,
	��ַ nvarchar(60) not null,
);
insert into �ҵĻ�Ա (��Ա���,����,��ַ)values(1001,'����','�Ĵ�üɽ') 
insert into �ҵĻ�Ա (��Ա���,����,��ַ)values(1002,'����','����') 

select*from �ҵĻ�Ա

--Լ������һ�ֶ��巽ʽ
create table �ҵĻ�Ա2(
	��Ա��� smallint not null,
	���� nvarchar(20) not null,
	��ַ nvarchar(60) not null,
	constraint chkmemberno
	check(��Ա��� between 1 and 10000)
); 
insert into �ҵĻ�Ա2 (��Ա���,����,��ַ)values(1001,'������','üɽ') 
insert into �ҵĻ�Ա2 (��Ա���,����,��ַ)values(1002,'����','�㶫') 

select*from �ҵĻ�Ա2