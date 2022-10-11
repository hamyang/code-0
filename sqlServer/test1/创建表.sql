--创建表--people表


create table sc(
	姓名 varchar(6),
	年龄 int ,
	成绩 int
)
--为表插入数据的命令
insert into sc (姓名,年龄,成绩) values ('黄洋',19,89)
insert into sc (姓名,年龄,成绩) values ('林夕',22,79)
insert into sc (姓名,年龄,成绩) values ('奇虎',16,97)
insert into sc (姓名,年龄,成绩) values ('魔魁',30,67)
--查询表中的数据
select * from sc