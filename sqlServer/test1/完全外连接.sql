--full outer join
--左外连接和右外连接查询结果的和

select * from R full outer join S
on R.c=S.c

insert into  S values('C5','D5')