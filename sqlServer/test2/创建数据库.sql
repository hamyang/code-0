--�������ݿ�
create database �������ݿ�
--ָ�������ļ��洢���ļ��� on:�ڡ��������ϣ�primary�����ļ���
on primary
(
	--���ݿ���߼����ƣ��൱��ĳ�����
	name='�������ݿ�', --�߼�������Ҫ��Ψһ
	filename = 'D:\code\sqlServer\test2\�ڶ���Ԫ����_��������.mdf',--��������
	size = 5mb,--�ļ���ʼ��С����ʼ������>=5,��Ϊ�μ����ݿ��model ģ����Ϣ������5mb����
	filegrowth = 4mb,--ÿ����������
	--filegrowth = 20%,
	maxsize = 200mb--�ļ������ֵ
);
--�����������ļ�
alter database �������ݿ�
add file(
	name = '�������ݿ�_���ļ�ndf',
	FileName =  'D:\code\sqlServer\test2\�������ݿ�.ndf',--��������
	size = 8mb,
	filegrowth = 100mb,
	maxsize = 2000mb
)
--ƽʱ�������Ϸ��������������¼�д��ʽ

--��д��ʽ
create database ��д���ݿ�;--ʵ�ʿ���ʹ�����
create database �������ݿ�;

--ɾ�����ݿ⣨��ɾ�����ݿ��ǣ�һ��Ҫ�л���������ݿ⣬�����ǵ�ǰ����ʹ�õ����ݿ⣩
drop database ɾ�����ݿ�;
drop database �������ݿ�;
drop database ��д���ݿ�;
--�л����ݿ�
use �л����ݿ�
--�鿴���ݿ���Ϣ��execute����д��
exec sp_help '�鿴���ݿ���Ϣ';
exec sp_helpdb '��д���ݿ�';

--�޸����ݿ�����
exec sp_renamedb '�������ݿ�','�޸����ݿ�����';

--�������ݿ�
--backup database ���ݿ����� to disk=D:\\w�ļ���.bak
backup database ��д���ݿ� to disk='D:\\�����ݿ�.bak';

--��ԭ���ݿ⣬����ɾ����·����������ݿ����ֻ���滻
restore database ��д���ݿ� from disk='D:\\�������ݿ�.bak';
--�滻���ݿ�
restore database �滻���ݿ� from disk='D:\\�������ݿ�.bak'with replace;

--�������ݿ�

--�������ݿ⣺��ɾ�����ݿ��ļ������ǿ��԰����DBMS���Ƴ���
exec sp_detach_db '��д���ݿ�';

--�������ݿ�
exec sp_attach_db '��д���ݿ�' ,'D:\code\sqlServer\test2\�ڶ���Ԫ����_��������.mdf';