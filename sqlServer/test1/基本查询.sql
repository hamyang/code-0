--select[������������2��...]| *from����1������2��...    ע��|��*�Ƕ�ѡ1

--[where����]

--[group by ���������]
                                          --����ὲ
--[having �ۺϺ����Ƚϲ���]

--[order by ���������]


--��1��.select��ѯ
select * from A_1

--(2).���ֻ���ڲ�ѯ����ʾĳһЩ��
select a_no from A_1
select a_name from A_1

--a.Ϊ�������,���������ԭ���������
select a_no as ѧ��,a_name as ���� from A_1

select 'ѧ��'=a_no,'����'=a_name from A_1
--b.Ϊ�������


--(3).�ڲ�ѯ�п���Ϊ������ж������

--(4).distinctȥ�����е��ظ�ֵ
select distinct a_no from A_1
--(5).order by����

--a.desc:����������
--b.asc:������������

select * from A_1 order by a_no asc
