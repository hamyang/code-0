
--having�Ӿ�����÷ǳ���Ҫ�����ǶԾۺϺ�����ֵ���Խ��бȽϲ���

select * from sc
select * from student

select a.����,�ɼ�, count(ѧ��) 
from student a,sc b 
where a.����=b.���� group by a.����,�ɼ�
having count(ѧ��)>1001

