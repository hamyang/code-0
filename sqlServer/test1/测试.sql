use xkgl
select * from student
select * from teacher
select * from course
select * from Schedule
select * from major
select * from Grade
select * from Department
select * from Class

select Teachername,Sex from teacher where Profession='����' or Profession = '������' and  current_timestamp -year(Brith)>40;

select * from course where courseid<='dp020001'

select studentid,grade from grade where courseid='dp010001' 
select * from grade order by grade desc,courseid
select distinct t.Profession,(select count(TeacherID) from teacher where Profession=t.Profession and Sex='��') as �н�ʦ����,(select count(TeacherID) from teacher where Profession=t.Profession and Sex='Ů') as Ů��ʦ���� from teacher t;
select s.ClassID,(select count(student.StudentID) from student where student.ClassID=s.ClassID) as ���� from class s;
select distinct t.Profession,(select count(TeacherID) from teacher where Profession=t.Profession and Sex='��') as �н�ʦ����,(select count(TeacherID) from teacher where Profession=t.Profession and Sex='Ů') as Ů��ʦ���� from teacher t;
