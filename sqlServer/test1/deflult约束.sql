create table people(
	p_id int primary key,
	p_name varchar(10),
	p_sex varchar(2) default '��'
	constraint ck_people check (p_sex = '��' or p_sex = 'Ů')
)

select * from people

insert into people (p_id,p_name)values (1,'����')