
create table ѧ���ɼ�(
	��� int primary key,
	���� varchar(10),
)
insert into ѧ���ɼ� (���,����)
values (11,'����')
insert into ѧ���ɼ� (���,����)
values (12,'����')
insert into ѧ���ɼ� (���,����)
values (21,'������')
insert into ѧ���ɼ� (���,����)
values (22,'����')
insert into ѧ���ɼ� (���,����)
values (22,'����')
create table �ɼ� (
	�꼶 varchar(20),
	�༶ varchar(10),
	��� int,
	constraint FK_A foreign key (���) references ѧ���ɼ� (���)
)
insert into �ɼ� (�꼶,�༶,���)
values ('��һ','һ��',11)
insert into �ɼ� (�꼶,�༶,���)
values ('��һ','����',12)
insert into �ɼ� (�꼶,�༶,���)
values ('�߶�','һ��',21)
insert into �ɼ� (�꼶,�༶,���)
values ('�߶�','����',22)

select * from ѧ���ɼ�
select * from �ɼ�


drop table ѧ���ɼ�; 




































