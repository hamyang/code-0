use xkgl
select * from  student
select * from grade
--ͳ��Ů������
select count(HomeAddr) Ů������ from student where sex='Ů'
--��ѯѧ��ƽ����
select avg(grade) ƽ���� from grade 
--��ѯdp010001��ƽ����
select avg(grade) ƽ���� from grade where Courseid='dp010001'
--��ѯ��ͷ�
select min(Grade) from grade
--�����ܷ�
select sun(*) from grade
--distinctȥ�ز�ѯ�ж��ٸ�id
select count(distinct Courseid) from grade
--exists ������ڴ���2010�Ĳ�ѯ���
select SchoolYear from grade where exists
(select * from grade where SchoolYear>2010)
--��ѯÿ�ſγ̵�ƽ����
select CourseID, avg(grade) as ƽ���� from grade group by CourseID
                                                                                                                                                                                                                                                                                                                                                                                                              