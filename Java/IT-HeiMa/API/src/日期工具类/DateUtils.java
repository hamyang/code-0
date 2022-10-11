package 日期工具类;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
    //构造方法私有
    //成员方法静态
public class DateUtils {
    private DateUtils(){}
    //把日期转换为指定格式的字符串  返回值类型String
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat();
        return sdf.format(date);
    }
    //把字符串解析为指定格式的日期 返回类型:Data
    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat();
        return sdf.parse(s);
    }
}
