--ɾ����
drop table teacher; 

create table teacher(
	tno varchar(10),          
	sname varchar(10),
	cno varchar(10),
	cname varchar(10)
	)
insert into teacher(tno,sname,cno,cname)
values ('t001','����','c003','ssh')
insert into teacher(tno,sname,cno,cname)
values ('t002','����','c004','oracle')
insert into teacher(tno,sname,cno,cname)
values ('t003','��ޱ','c005','sql server')
insert into teacher(tno,sname,cno,cname)
values ('t004','ŷ��','c006','c#')
insert into teacher(tno,sname,cno,cname)
values ('t005','���','c007','java')



create table sc(
	sname varchar(10),          
	sage varchar(10),
	cno varchar(10),
	score varchar(10)
	)
insert into sc(sname,sage,cno,score)
values ('����','23','c001','75.43')
insert into sc(sname,sage,cno,score)
values ('����','23','c002','53.6')
insert into sc(sname,sage,cno,score)
values ('����','23','c006','95.5')
insert into sc(sname,sage,cno,score)
values ('������','25','c009','86.5')
insert into sc(sname,sage,cno,score)
values ('����','28','c007','85.5')
