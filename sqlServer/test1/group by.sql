

select 性别,count(学号) from student group by 性别

--group by 语句执行原理
--（1）先分组 group by ssex
--（2）求男女生的总数 count（学号）---聚合函数

select * from sc
select * from student

select a.年龄,b.成绩, count(学号) from student a,sc b where a.年龄=b.年龄
group by a.年龄,b.成绩
having count(a.姓名)='何健'
--group by 子句经常和聚合函数一起使用
--在使用group by 的时候，如果查询的列没有包含在聚合函数中，那么该列一定要出现在group by子句后面