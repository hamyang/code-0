--like
--查找学生表中姓黄的同学
--a.一个%表示0个或多个任意字符
select * from student
select * from student where 姓名 like '黄%'

--查询学生表中名字是3个字的学生信息
--a.一个下划线_ 表示一个字符
select * from student where 姓名 like '西__'
--b.查询包含下划线的学生名称信息
--$符号是定义的转移字符，那么在$符号后面的下滑线不再是like中的特殊符号，而是一个普通的字符
select * from student where 姓名 like '%$_%'escape'$'




