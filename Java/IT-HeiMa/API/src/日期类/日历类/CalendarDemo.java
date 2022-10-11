package 日期类.日历类;

import java.util.Calendar;
//public abstract void add(int field,int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
//public final void set (int year,int month,int date):设置当前日历年月日
public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();//多态的形式

        //给定的日历字段返回对应的值
        //int year =c.get(Calendar.YEAR);
        //int month = c.get(Calendar.MONTH)+1;
        //int date = c.get(Calendar.DATE);
        //System.out.println(year+"年"+month+"月"+date+"日");

//public abstract void add(int field,int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
        //c.add(Calendar.YEAR,10);//10年后
        //c.add(Calendar.MONTH,-5);//5天前
        //int year =c.get(Calendar.YEAR);
        //int month = c.get(Calendar.MONTH)+1;
        //int date = c.get(Calendar.DATE);
        //System.out.println(year+"年"+month+"月"+date+"日");l

//public final void set (int year,int month,int date):设置当前日历年月日
        c.set(2022,4,17);
        int year =c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
    }
}
