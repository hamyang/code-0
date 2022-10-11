--where 为查询作筛选结果的一个过程（非常重要）

--1.比较操作>,<,=,><,<=,>=
select * from student where 数学>'80'
--2.逻辑操作and，or，not
select * from student
select * from sc

select* from student where 语文>'90' or 英语>'90' and 性别='男' --where

select 学号, 数学, 语文 from student a,sc b where a.年龄=b.年龄 and (数学>80 and 语文>90) --and

select*from student where 语文 not between 70 and 80   --not
select*from student where 数学 not in(98,90,87)






