package 字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//一个汉字存储
//      如果是GBK编码,占用2个字节
//      如果是UTF-8,占用3个字节
public class Hello {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s ="中国";
//        以指定编码转换
        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));
        byte[] abc = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(abc));
//     如何识别中文的?   汉字在存储的时候无论那种编码存储,第一个字节都是负数
    }
}
