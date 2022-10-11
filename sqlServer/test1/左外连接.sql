--左外连接
select * from R left outer join S on R.C=S.C
--left outer join除了满足查询条件的结果显示出来，还需要将left outer join左侧表中没有匹配的数据显示出来

select * from R
select * from S

create table R(
		A varchar(5),
		B varchar(5),
		C varchar(5)
)
insert into R values('A1','B1','C1')
insert into R values('A2','B2','C2')
insert into R values('A3','B3','C3')
insert into R values('A4','B4','C4')

create table S(
		C varchar(5),
		D varchar(5)
)
insert into S values('C1','D1')
insert into S values('C2','D2')
