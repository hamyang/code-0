--where Ϊ��ѯ��ɸѡ�����һ�����̣��ǳ���Ҫ��

--1.�Ƚϲ���>,<,=,><,<=,>=
select * from student where ��ѧ>'80'
--2.�߼�����and��or��not
select * from student
select * from sc

select* from student where ����>'90' or Ӣ��>'90' and �Ա�='��' --where

select ѧ��, ��ѧ, ���� from student a,sc b where a.����=b.���� and (��ѧ>80 and ����>90) --and

select*from student where ���� not between 70 and 80   --not
select*from student where ��ѧ not in(98,90,87)






