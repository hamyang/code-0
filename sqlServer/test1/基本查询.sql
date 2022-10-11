--select[列名名，列名2，...]| *from表名1，表名2，...    注意|和*是二选1

--[where条件]

--[group by 分组的列名]
                                          --后面会讲
--[having 聚合函数比较操作]

--[order by 排序的列名]


--（1）.select查询
select * from A_1

--(2).如果只想在查询中显示某一些列
select a_no from A_1
select a_name from A_1

--a.为列起别名,并不会更改原来表的名称
select a_no as 学号,a_name as 姓名 from A_1

select '学号'=a_no,'姓名'=a_name from A_1
--b.为表起别名


--(3).在查询中可以为表或者列定义别名

--(4).distinct去掉列中的重复值
select distinct a_no from A_1
--(5).order by排序

--a.desc:代表降序排列
--b.asc:代表升序排列

select * from A_1 order by a_no asc
