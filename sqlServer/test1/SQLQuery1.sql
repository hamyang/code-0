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
 select student.studentid ѧ��,studentname ����,mname רҵ����,coursename �γ�����
from student join major on smajor=mid
join grade on student.studentid = grade.studentid
join course on grade.courseid = course.courseid
where mname='��Ϣ��������Ϣϵͳ' and coursename = '���ݿ�ԭ����Ӧ��'
--5
