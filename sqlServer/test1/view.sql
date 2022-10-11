create view stuno_view
as
select studentid,studentname,
year(getdate())-year(birth)ÄêÁä,smajor
from student)

create view scoreavg_view as
studentid,avg(grade) pjcj
from grade group by
studentid

create viow scorelow viow
as select student = pjcj
where student.studentid = scoreavg_view.studentid
and pjcj<60
