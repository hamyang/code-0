import java.io.*;
import java.util.Arrays;

public class 稀疏数组 {
    public static void main(String[] args) throws IOException {
        //统计有效个数
        int c = 0;
        //a的递增
        int d1 = 1;
        //定义棋盘
        int[][] num = new int[11][11];
        num[1][2] = 1;
        num[2][3] = 2;
        //遍历数组,统计字符个数
        for (int a = 0; a < num.length; a++) {
            for (int b = 0; b < num.length; b++) {
                if (num[a][b] != 0) {
                    c++;
                }
            }
        }
        //定义的稀疏数组
        int[][] sparseArry = new int[c + 1][3];
        sparseArry[0][0] = 11;
        sparseArry[0][1] = 11;
        sparseArry[0][2] = c;
        //装入稀疏数组中
        for (int a = 0; a < num.length; a++) {
            for (int b = 0; b < num.length; b++) {
                if (num[a][b] != 0) {
                    sparseArry[d1][0] = a;
                    sparseArry[d1][1] = b;
                    sparseArry[d1][2] = num[a][b];
                    d1++;
                }
            }
        }
        //输出稀疏数组
        for (int i = 0; i < c + 1; i++) {
            System.out.print(sparseArry[i][0] + "," + sparseArry[i][1] + "," + sparseArry[i][2]);
            System.out.println();
        }
        //写入文件
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\稀疏数组_文件存储"));
        osw.write(Arrays.deepToString(sparseArry));
        osw.close();
        //读取文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\code\\Java\\File\\稀疏数组_文件存储"));
        char[] chs = new char[1024];//1024及其整数倍
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }
        isr.close();
        //恢复为棋盘
    }
}

