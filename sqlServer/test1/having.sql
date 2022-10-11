
--having子句的作用非常重要，他是对聚合函数的值可以进行比较操作

select * from sc
select * from student

select a.年龄,成绩, count(学号) 
from student a,sc b 
where a.年龄=b.年龄 group by a.年龄,成绩
having count(学号)>1001

