--�������ݿ�-
create table student(
ѧ�� int default 0000 not null,
���� varchar(10),
���� int default 0,
�Ա� varchar(2) default '��' --deflultԼ��
constraint ckm_a check(�Ա� = '��' or �Ա�='Ů' ),--cheakԼ��
�꼶 varchar(10) default 'δ֪',
�༶ varchar(10) default 'δ֪',
���� int default 0,
��ѧ int default 0,
Ӣ�� int default 0,
���� int default 0
)
--���Լ��-����3
alter table student alter column ѧ�� int not null  -- ����Ϊ�ǿ�
--һ��һ������
alter table student add constraint PK_A_5 primary key (ѧ��)
--���Լ��-����2
create table student_1(
	ѧ�� int primary key,--�ζ��巽ʽϵͳ���Զ�����һ������Լ������
	���� varchar(10) 
)
--���Լ��-����1
create table student_2(
	ѧ�� int,
	���� varchar(10),
	constraint PK_A_2 primary key (ѧ��)
)
insert into A_2 values (1,'����')
insert into A_2 values (2,'����')

--Ϊ���������
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1001,'����',19,'��','��һ','һ��',98,87,97,236)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1002,'���',18,'Ů','��һ','һ��',87,84,86,286)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1003,'����',20,'��','���','����',86,97,89,298)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1004,'�׼�˹',21,'��','����','�İ�',86,78,86,276
)insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1005,'��ѩ',17,'Ů','��һ','���',88,64,96,266)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1006,'С�',19,'Ů','���','����',86,84,89,286)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1007,'�Ƽ���',18,'��','��һ','����',87,83,87,266)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1008,'����',22,'��','����','����',97,94,86,256)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(1009,'���',23,'��','����','�İ�',85,88,85,246)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(10010,'�ŵ�',19,'Ů','��һ','����',85,74,86,246)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(10011,'����',20,'Ů','���','����',77,84,76,246)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(10012,'˹��',22,'��','����','����',97,64,86,286)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(10013,'ɳ���',23,'��','����','һ��',86,89,84,289)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(10014,'��_��',23,'��','����','����',96,89,84,289)
insert into student (ѧ��,����,����,�Ա�,�꼶,�༶,����,��ѧ,Ӣ��,����)
values(10015,'��_��',23,'��','����','����',96,89,84,289)



--��2
create table sc(
���� int ,
���� varchar(10),
�ɼ� int
)
insert into sc (����,����,�ɼ�)
values(19,'�μ�',89)
insert into sc (����,����,�ɼ�)
values(23,'����',78)
insert into sc (����,����,�ɼ�)
values(23,'����',98)
insert into sc (����,����,�ɼ�)
values(19,'Ф��',88)
insert into sc (����,����,�ɼ�)
values(21,'���',89)



--��ѯ���е�����
select * from student
select * from sc
--in�ؼ���ָ����ѯ
--��һ��
select * from student where �Ա� in ('��')
--�ڶ���
select * from student while ���� in 
(select ���� from sc where ���� >=20)


--like�ؼ��ֲ���
--a.һ��%��ʾ0�����������ַ�
select * from student where ���� like '��%'
--b.һ���»���_ ��ʾһ���ַ�
select * from student where ���� like '��_'
--c.��ѯ�����»��ߵ�ѧ��������Ϣ,$�����Ƕ����ת���ַ�����ô��$���ź�����»��߲�����like�е�������ţ�����һ����ͨ���ַ�
select * from student where ���� like '%$_%'escape'$'

--where�ؼ���ɸѡ���ǳ���Ҫ��
--a.�Ƚϲ���>,<,=,><,<=,>=
select * from student where ����>280
--b.�߼�����and��or��not
select ѧ��,����,�Ա�,�༶,��ѧ,�ɼ� from 
student a,sc b
where a.��ѧ = b.�ɼ�
and (��ѧ >80 and �ɼ�>80)



--�ۺϺ���
--max : �����ֵ
select max(cno) from teacher
--min : ����Сֵ
select min(cno) from teacher
select max(cno),min(cno) from teacher
--count�����¼����Ҳ���Ƕ�����
  --a.count(*):���Լ������null�еļ�¼��
select count(*)from teacher
  --b.count(����)�������ܼ�¼������ȥ����null
select count(cno)from teacher
--avg �� ��ƽ��ֵ
select avg(cno) from teacher--�������Ͳ��Խ�֧����������
--sum : ���ܺ�
select sum(cno)from teacher--ͬ��

--ɾ����
drop table student

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

