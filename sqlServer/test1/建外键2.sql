--�ڶ��֣��ڴ������ͬʱ���Զ������������

create table b(
	b_no int primary key,
	b_name varchar(10)
)
--B VS C ==>1 : n
create table c(
	c_no int primary key,
	c_name varchar(10),
	b_no int,-- foreign key references b (b_no)
	constraint FK_C/*�Զ����������*/ foreign key (b_no) references B (b_no)
)

--�����֣��������Լ���ķ���

--D VS E ==>1 : n
create table D(
	d_no int primary key,
	d_name varchar(10)
)
create table E(
	e_no int primary key,
	e_name varchar(10),
	d_no int
)
alter table E add constraint FK_E
foreign key (d_no)
references D (d_no)

--�ܽ�����Ĵ�����ʽ

--1��ȷ����֮����ӷ��ϵ
--2�����һ���Ǵ������ӱ��еģ������븸����������Ϲ�ϵ
--3���ڴ������ʱ��Ϳ���������
alter table  ��һ add constraint FK_XXX
foreign key (XXX)
references ��� (XXX)