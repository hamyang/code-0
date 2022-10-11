create table people(
	p_id int primary key,
	p_name varchar(10),
	p_sex varchar(2) default 'ÄĞ'
	constraint ck_people check (p_sex = 'ÄĞ' or p_sex = 'Å®')
)

select * from people

insert into people (p_id,p_name)values (1,'ÕÅÈı')