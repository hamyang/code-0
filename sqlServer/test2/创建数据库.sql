--创建数据库
create database 创建数据库
--指定数据文件存储的文件组 on:在。。。这上，primary：主文件组
on primary
(
	--数据库的逻辑名称：相当于某人外号
	name='创建数据库', --逻辑名称需要是唯一
	filename = 'D:\code\sqlServer\test2\第二单元测试_物理名称.mdf',--物理名称
	size = 5mb,--文件初始大小，初始化必须>=5,因为参加数据库的model 模板信息必须是5mb以上
	filegrowth = 4mb,--每次增长多少
	--filegrowth = 20%,
	maxsize = 200mb--文件的最大值
);
--创建次数据文件
alter database 创建数据库
add file(
	name = '创建数据库_次文件ndf',
	FileName =  'D:\code\sqlServer\test2\创建数据库.ndf',--物理名称
	size = 8mb,
	filegrowth = 100mb,
	maxsize = 2000mb
)
--平时不用以上方法创建，用以下简写方式

--简写方式
create database 简写数据库;--实际开发使用最多
create database 创建数据库;

--删除数据库（在删除数据库是，一定要切换到别的数据库，不能是当前正在使用的数据库）
drop database 删除数据库;
drop database 创建数据库;
drop database 简写数据库;
--切换数据库
use 切换数据库
--查看数据库信息，execute完整写法
exec sp_help '查看数据库信息';
exec sp_helpdb '简写数据库';

--修改数据库名称
exec sp_renamedb '创建数据库','修改数据库名称';

--备份数据库
--backup database 数据库名称 to disk=D:\\w文件名.bak
backup database 简写数据库 to disk='D:\\备数据库.bak';

--还原数据库，有人删库跑路，如如果数据库存在只能替换
restore database 简写数据库 from disk='D:\\备份数据库.bak';
--替换数据库
restore database 替换数据库 from disk='D:\\备份数据库.bak'with replace;

--附加数据库

--分离数据库：不删除数据库文件，但是可以把你从DBMS中移除掉
exec sp_detach_db '简写数据库';

--附加数据库
exec sp_attach_db '简写数据库' ,'D:\code\sqlServer\test2\第二单元测试_物理名称.mdf';