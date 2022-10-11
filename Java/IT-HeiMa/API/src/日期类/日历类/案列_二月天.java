package 日期类.日历类;

import java.util.Calendar;
import java.util.Scanner;

//需求；获取任意一年的2月有多少天
public class 案列_二月天 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = Integer.parseInt(sc.next());
        //设置日历对象
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        //往前推一天
        c.add(Calendar.DATE,-1);
        //获取这一天
        int date = c.get(Calendar.DATE);
        System.out.println(year+"这一年的2月份有"+date+"天");
    }
}
