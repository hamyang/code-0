
create table 学生成绩(
	序号 int primary key,
	姓名 varchar(10),
)
insert into 学生成绩 (序号,姓名)
values (11,'张三')
insert into 学生成绩 (序号,姓名)
values (12,'李四')
insert into 学生成绩 (序号,姓名)
values (21,'王麻子')
insert into 学生成绩 (序号,姓名)
values (22,'李潇')
insert into 学生成绩 (序号,姓名)
values (22,'李潇')
create table 成绩 (
	年级 varchar(20),
	班级 varchar(10),
	序号 int,
	constraint FK_A foreign key (序号) references 学生成绩 (序号)
)
insert into 成绩 (年级,班级,序号)
values ('高一','一班',11)
insert into 成绩 (年级,班级,序号)
values ('高一','二班',12)
insert into 成绩 (年级,班级,序号)
values ('高二','一班',21)
insert into 成绩 (年级,班级,序号)
values ('高二','二班',22)

select * from 学生成绩
select * from 成绩


drop table 学生成绩; 




































