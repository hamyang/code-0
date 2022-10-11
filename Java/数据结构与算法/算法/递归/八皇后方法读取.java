package 递归;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 八皇后方法读取 {
    public static void main(String[] args) throws IOException {
        System.out.println(fos1());

        String str = String.valueOf(fos1());
        String[] split = str.split(",", 8);
        System.out.println(Arrays.toString(split));


    }

    public static ArrayList<Character> fos1() throws IOException {
//        int[] array = new int[8];
        ArrayList<Character> arrayList = new ArrayList<>();
        //一次一个字符数据
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\Java\\File\\Queue8方法"));
        int ch;
        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
            if ((char) ch >= '0' && (char) ch < '8') {

                arrayList.add((char) ch);
                System.out.println();
            }
        }
        isr.close();
        return arrayList;
    }
}
