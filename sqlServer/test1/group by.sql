

select �Ա�,count(ѧ��) from student group by �Ա�

--group by ���ִ��ԭ��
--��1���ȷ��� group by ssex
--��2������Ů�������� count��ѧ�ţ�---�ۺϺ���

select * from sc
select * from student

select a.����,b.�ɼ�, count(ѧ��) from student a,sc b where a.����=b.����
group by a.����,b.�ɼ�
having count(a.����)='�ν�'
--group by �Ӿ侭���;ۺϺ���һ��ʹ��
--��ʹ��group by ��ʱ�������ѯ����û�а����ھۺϺ����У���ô����һ��Ҫ������group by�Ӿ����