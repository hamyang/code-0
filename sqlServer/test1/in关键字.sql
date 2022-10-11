--in关键字：是要求查询的结果在几个值里面
--查询课程('c001','c002','c005')
select * from student
select * from student where 学号 in (1001,1002,1005)
--in还可以运用到子查询中

select * from sc where 年龄 int 
(select 年龄 from student where 年龄 >=18)


