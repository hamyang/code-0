create table A_4(
	a_name varchar(10),
	a_sex varchar(2) constraint ck_a check(a_sex = '��' or a_sex='Ů' )
)

insert into A_4 (a_name,a_sex)values('����','��') 
insert into A_4 (a_name,a_sex)values('��Ů','Ů') 

select * from A_4