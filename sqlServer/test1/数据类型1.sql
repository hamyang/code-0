create table A_1(
	a_no float,
	a_name varchar(10)
)
insert into A_1(a_no,a_name)
values (3.14,'hy')

select * from A_1

--numeric(p,n)
--p �����������͵ľ��ȣ��������ֵ���󳤶�
--n����С��������λ��


--�磺numeric��5��2����ʾ���Բ���5λ���֣�����2λС�� �磺123.45

create table A_2(
	a_no numeric(5,2)
)
insert into A_2(a_no) 
values(44.411)

select * from A_2