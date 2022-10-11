create table A_1(
	a_no float,
	a_name varchar(10)
)
insert into A_1(a_no,a_name)
values (3.14,'hy')

select * from A_1

--numeric(p,n)
--p 代表数字类型的精度，插入数字的最大长度
--n代表小数点后面的位数


--如：numeric（5，2）表示可以插入5位数字，包含2位小数 如：123.45

create table A_2(
	a_no numeric(5,2)
)
insert into A_2(a_no) 
values(44.411)

select * from A_2