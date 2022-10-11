--正常写法
select 语文,数学 from Student s,sc c
where s.年龄=c.年龄
--标准SQL  92/SQL99的写法 叫做内连接形式
select 语文,数学 from student s inner join sc c 
on s.年龄 =  c.年龄

