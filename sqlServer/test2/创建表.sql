use �������ݿ�;
go--�����ָ��
create table Student 
(
	Id int,
	StudentNO char(11),
	Phone char(11),
	Sex nchar(4)
);
go

--�޸ı����������ֶΣ�vachar��20��
alter table Student 
add NickName varchar(20);
go

--�޸��ֶ����ͣ�NickName ����Ϊnvarchar(30)
alter table Student 
alter column NickName nvarchar(30);
go

--ɾ���ֶ�
alter table Student
drop column NickName;
go


