create database ����Լ��;
go
use ����Լ��;
go

-- ��������Լ��
create table Student(
	--�ڱ��д�������
    --1.Id int primary key, -- ����Լ��(������Լ��)
    -- �����Զ����ɵ�����̫����������������Լ������,ͨ����pk_
	--2.Id int��
	-- primary key(Id,NickName) --����Լ��(������Լ��)   
	--3.
   Id int,
   constraint pk_�Զ����������� primary key(Id),--�Զ�������Լ������
   --
   NickName nvarchar(15), -- unicod ����
   StudentNo int identity,  -- ѧ�� identityΪ��������
   Sex nchar(2),    -- �Ա�
   Account varchar(20), -- �˺�
   [Password] varchar(50) -- ����
);
-- �޸ı��������,����Ҫ��ӷǿ�Լ��
alter table Student
alter column Id int not null;
go
alter table Student
add constraint pk_׷������ primary key (Id);
go
select*from student

-- truncate����������մ�0��ʼ
truncate table student

