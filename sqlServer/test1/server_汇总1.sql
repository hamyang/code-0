--创建数据库-
create table student(
学号 int default 0000 not null,
姓名 varchar(10),
年龄 int default 0,
性别 varchar(2) default '男' --deflult约束
constraint ckm_a check(性别 = '男' or 性别='女' ),--cheak约束
年级 varchar(10) default '未知',
班级 varchar(10) default '未知',
语文 int default 0,
数学 int default 0,
英语 int default 0,
理综 int default 0
)
--添加约束-方法3
alter table student alter column 学号 int not null  -- 定义为非空
--一行一行运行
alter table student add constraint PK_A_5 primary key (学号)
--添加约束-方法2
create table student_1(
	学号 int primary key,--次定义方式系统会自动生成一个主键约束名称
	姓名 varchar(10) 
)
--添加约束-方法1
create table student_2(
	学号 int,
	姓名 varchar(10),
	constraint PK_A_2 primary key (学号)
)
insert into A_2 values (1,'张三')
insert into A_2 values (2,'李四')

--为表添加数据
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1001,'李潇',19,'男','大一','一班',98,87,97,236)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1002,'韩瑾',18,'女','大一','一班',87,84,86,286)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1003,'李琦',20,'男','大二','三班',86,97,89,298)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1004,'雷吉斯',21,'男','大三','四班',86,78,86,276
)insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1005,'米雪',17,'女','大一','五班',88,64,96,266)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1006,'小憩',19,'女','大二','三班',86,84,89,286)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1007,'黄吉里',18,'男','大一','二班',87,83,87,266)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1008,'阿甘',22,'男','大四','二班',97,94,86,256)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(1009,'瑞金',23,'男','大四','四班',85,88,85,246)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(10010,'雅典',19,'女','大一','二班',85,74,86,246)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(10011,'阿娇',20,'女','大二','三班',77,84,76,246)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(10012,'斯基',22,'男','大三','二班',97,64,86,286)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(10013,'沙家浜',23,'男','大四','一班',86,89,84,289)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(10014,'黄_力',23,'男','大三','二班',96,89,84,289)
insert into student (学号,姓名,年龄,性别,年级,班级,语文,数学,英语,理综)
values(10015,'黄_力',23,'男','大三','二班',96,89,84,289)



--表2
create table sc(
年龄 int ,
姓名 varchar(10),
成绩 int
)
insert into sc (年龄,姓名,成绩)
values(19,'何键',89)
insert into sc (年龄,姓名,成绩)
values(23,'霍克',78)
insert into sc (年龄,姓名,成绩)
values(23,'戴军',98)
insert into sc (年龄,姓名,成绩)
values(19,'肖恩',88)
insert into sc (年龄,姓名,成绩)
values(21,'李国',89)



--查询表中的数据
select * from student
select * from sc
--in关键字指定查询
--第一种
select * from student where 性别 in ('男')
--第二种
select * from student while 年龄 in 
(select 年龄 from sc where 年龄 >=20)


--like关键字查找
--a.一个%表示0个或多个任意字符
select * from student where 姓名 like '黄%'
--b.一个下划线_ 表示一个字符
select * from student where 姓名 like '李_'
--c.查询包含下划线的学生名称信息,$符号是定义的转移字符，那么在$符号后面的下滑线不再是like中的特殊符号，而是一个普通的字符
select * from student where 姓名 like '%$_%'escape'$'

--where关键字筛选（非常重要）
--a.比较操作>,<,=,><,<=,>=
select * from student where 理综>280
--b.逻辑操作and，or，not
select 学号,理综,性别,班级,数学,成绩 from 
student a,sc b
where a.数学 = b.成绩
and (数学 >80 and 成绩>80)



--聚合函数
--max : 求最大值
select max(cno) from teacher
--min : 求最小值
select min(cno) from teacher
select max(cno),min(cno) from teacher
--count：求记录数，也就是多少行
  --a.count(*):可以计算包含null列的记录数
select count(*)from teacher
  --b.count(列名)：计算总记录数，不去计算null
select count(cno)from teacher
--avg ： 求平均值
select avg(cno) from teacher--数据类型不对仅支持算数类型
--sum : 求总和
select sum(cno)from teacher--同上

--删除表
drop table student

--2.删除表中的列操作-》首先要删除表中的约束
/*
alter table 表名 drop column 列名
*/

alter table emp drop column eaddress

--3.删除表中的约束
/*
alter table 表名 drop constraint 约束名
*/
alter table emp drop constraint DF__emp__eaddress__2E1BDC42


--4.修改表中的数据类型
/*
alter table 表名 alter column 列名 数据类型
*/
alter table emp alter column ename varchar(25)

