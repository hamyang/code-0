create table A_4(
	a_name varchar(10),
	a_sex varchar(2) constraint ck_a check(a_sex = '男' or a_sex='女' )
)

insert into A_4 (a_name,a_sex)values('张三','男') 
insert into A_4 (a_name,a_sex)values('美女','女') 

select * from A_4