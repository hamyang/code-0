--insert 语句插入数据
select * from A_1

insert into A_1(a_no,a_name)values(4,'李潇')

insert into A_1 values(5,'胡斯')

--update 语句修改表数据

update A_1 set a_name ='李琦' where a_no = '3'

--delete 语句可以删除表中的一行或者多行语句

delete from A_1 where a_no=2

delete from A_1 where a_no>=5  --删除多行语句
