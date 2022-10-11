use 创建数据库;
go--批量分割符
create table Student 
(
	Id int,
	StudentNO char(11),
	Phone char(11),
	Sex nchar(4)
);
go

--修改表格，添加姓名字段，vachar（20）
alter table Student 
add NickName varchar(20);
go

--修改字段类型，NickName 更改为nvarchar(30)
alter table Student 
alter column NickName nvarchar(30);
go

--删除字段
alter table Student
drop column NickName;
go


