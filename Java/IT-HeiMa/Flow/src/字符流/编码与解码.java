package 字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//编码
//      byte[] getBytes() 使用平台的默认字符集将该String编码为一系列字节,将结果存储到新的字节数组中
//      byte[] getBytes(String charsetName) 使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中
//解码
//      String(byte[] bytes) 通过使用平台默认字符集解码指定的字节数组来构造新的String
//      String(byte[] bytes,String charsetName) 通过指定的字符集解码指定的字节数组来构造新的String
public class 编码与解码 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s= "中国";
//编码
//      byte[] getBytes() 使用平台的默认字符集将该String编码为一系列字节,将结果存储到新的字节数组中
        byte[] bys1 = s.getBytes();//[-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(bys1));
//      byte[] getBytes(String charsetName) 使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中
        byte[] bys2 =s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(bys2));
        byte[] bys3 = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys3));
//解码
//      String(byte[] bytes) 通过使用平台默认字符集解码指定的字节数组来构造新的String
        String ss1 = new String(bys1);
        System.out.println(ss1);
//      String(byte[] bytes,String charsetName) 通过指定的字符集解码指定的字节数组来构造新的String
        String ss2 = new String(bys1,"UTF-8");
        System.out.println(ss2);
        String ss3 = new String(bys1, "GBK");
        System.out.println(ss3);

    }
}
