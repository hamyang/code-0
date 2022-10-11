--max : 求最大值
--min : 求最小值
--count：求记录数，也就是多少行
  --a.count(*):可以计算包含null列的记录数
  --b.count(列名)：计算总记录数，不去计算null
--avg ： 求平均值
--sum : 求总和

select * from teacher
select max(cno) from teacher
select min(cno) from teacher
select max(cno),min(cno) from teacher
select count(*)from teacher
select count(cno)from teacher
select avg(cno) from teacher--数据类型不对仅支持算数类型
select sum(cno)from teacher--同上





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
values(21,'戴军',98)
