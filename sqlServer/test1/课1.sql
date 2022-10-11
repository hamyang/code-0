alter table class drop constraint [PK_class_75743806AAc04810]

alter table student drop constraint [FK_class_departmen_2C3393D]

alter table student add constraint pk_stu_spk primary key(学号)


create table student2(
sno char(10) not null,
sname char(8) not null,
ssex char(2) null,
sbirthday date null,
classno char(10) not null
)
--数据插入
insert into student2 (sno,sname,ssex,sbirthday,classno) 
values('563','孙龙','男','2019-9-18','0711')

select * from student2

--增加字段
alter table student2 add y char(2)

--z增加一个主键约束
alter table student2 add constraint newpk primary key(sno)

--删除主键

--创建一个course表
create table course(
cno char(5) not null,
cname varchar(30) not null,
credit tinyint null
)


