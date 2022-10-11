package 特殊操作流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//public static final InputStream in :标准输入流，手动输入
public class 标准输入流 {
    public static void main(String[] args) throws IOException {
//        fim1();
//        fim2();
        fim3();
//        fim4();
    }

    //字节输入流
    public static void fim1() throws IOException {
        InputStream is = System.in;
        int by;
        while ((by = is.read()) != -1) {
            System.out.println((char) by);
        }//输入中文输出有问题
    }

    //字符输入流
    public static void fim2() throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        int by;
        while ((by = isr.read()) != -1) {
            System.out.print((char) by);
        }
    }

    //字符缓冲输入流，可以一次读取一行数据
    public static void fim3() throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int by;
        while ((by = br.read()) != -1) {
            System.out.print((char) by);
        }
    }
    //JDK提供方法Scanner
   public static void fim4(){
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int br = sc.nextInt();
        System.out.println(br);
    }
}

