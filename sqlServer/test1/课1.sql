alter table class drop constraint [PK_class_75743806AAc04810]

alter table student drop constraint [FK_class_departmen_2C3393D]

alter table student add constraint pk_stu_spk primary key(ѧ��)


create table student2(
sno char(10) not null,
sname char(8) not null,
ssex char(2) null,
sbirthday date null,
classno char(10) not null
)
--���ݲ���
insert into student2 (sno,sname,ssex,sbirthday,classno) 
values('563','����','��','2019-9-18','0711')

select * from student2

--�����ֶ�
alter table student2 add y char(2)

--z����һ������Լ��
alter table student2 add constraint newpk primary key(sno)

--ɾ������

--����һ��course��
create table course(
cno char(5) not null,
cname varchar(30) not null,
credit tinyint null
)


