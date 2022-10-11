--右外连接
select * from R right outer join S on R.C=S.C
--left outer join除了满足查询条件的结果显示出来，还需要将left outer join右侧表中没有匹配的数据显示出来
