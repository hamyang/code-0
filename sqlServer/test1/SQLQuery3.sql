use xkgl
select * from  student
select * from grade
--统计女生个数
select count(HomeAddr) 女生个数 from student where sex='女'
--查询学生平均分
select avg(grade) 平均分 from grade 
--查询dp010001的平均分
select avg(grade) 平均分 from grade where Courseid='dp010001'
--查询最低分
select min(Grade) from grade
--求技能总分
select sun(*) from grade
--distinct去重查询有多少个id
select count(distinct Courseid) from grade
--exists 如果存在大于2010的查询结果
select SchoolYear from grade where exists
(select * from grade where SchoolYear>2010)
--查询每门课程的平均分
select CourseID, avg(grade) as 平均分 from grade group by CourseID
                                                                                                                                                                                                                                                                                                                                                                                                              