use xkgl
select * from student
select * from teacher
select * from course
select * from Schedule
select * from major
select * from Grade
select * from Department
select * from Class

--1
Select StudentID,studentname,student.smajor,mname
from student join major on student.smajor=major.mid 
--2
Select student.StudentID,studentname,courseid,grade
from student join grade on student.studentid= grade.studentid
Where smajor = 'MO1'
--3
Select student.StudentID,studentName,grade.courseid,courseName,grade
From student join grade on student.studentID= grade.studentid
join course on grade.courseid = course.courseid
--4
 select student.studentid 学号,studentname 姓名,mname 专业名称,coursename 课程名称
from student join major on smajor=mid
join grade on student.studentid = grade.studentid
join course on grade.courseid = course.courseid
where mname='信息管理与信息系统' and coursename = '数据库原理与应用'
--5
