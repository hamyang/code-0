package 日期类;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
    构造方法:
        public simpleDateFormat():构造一个simpleDateFormat，使用默认模式和日期格式
        public SimpleDateFormat(String pattern):构造一个simpleDateFormat使用给定的模式和默认的日期格式
     格式化:从Date到String
        public final String format(Date date):将日期格式成日期/时间字符串
     解析:从String到Date
        public Date parse(String source):从给定字符串的开始解析文本以生成日期
*/
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
//        格式化:从Date到String
        Date d = new Date();
//      SimpleDateFormat sdf= new SimpleDateFormat();//默认模式不是我想要的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("--------");
//        解析:从String到Date
        String ss = "2048-08-09 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }
}
