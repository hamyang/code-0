--max : �����ֵ
--min : ����Сֵ
--count�����¼����Ҳ���Ƕ�����
  --a.count(*):���Լ������null�еļ�¼��
  --b.count(����)�������ܼ�¼������ȥ����null
--avg �� ��ƽ��ֵ
--sum : ���ܺ�

select * from teacher
select max(cno) from teacher
select min(cno) from teacher
select max(cno),min(cno) from teacher
select count(*)from teacher
select count(cno)from teacher
select avg(cno) from teacher--�������Ͳ��Խ�֧����������
select sum(cno)from teacher--ͬ��





create table sc(
���� int ,
���� varchar(10),
�ɼ� int
)
insert into sc (����,����,�ɼ�)
values(19,'�μ�',89)
insert into sc (����,����,�ɼ�)
values(23,'����',78)
insert into sc (����,����,�ɼ�)
values(21,'����',98)
