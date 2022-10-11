create database 主键约束;
go
use 主键约束;
go

-- 创建主键约束
create table Student(
	--在表中创建主键
    --1.Id int primary key, -- 主键约束(行主键约束)
    -- 由于自动生成的主键太长我们来设置主键约束名称,通常是pk_
	--2.Id int，
	-- primary key(Id,NickName) --主键约束(表级主键约束)   
	--3.
   Id int,
   constraint pk_自定义主键名称 primary key(Id),--自定义主键约束名称
   --
   NickName nvarchar(15), -- unicod 姓名
   StudentNo int identity,  -- 学号 identity为主键自增
   Sex nchar(2),    -- 性别
   Account varchar(20), -- 账号
   [Password] varchar(50) -- 密码
);
-- 修改表添加主键,首先要添加非空约束
alter table Student
alter column Id int not null;
go
alter table Student
add constraint pk_追加主键 primary key (Id);
go
select*from student

-- truncate主键自增清空从0开始
truncate table student

