package 递归;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Queue8 {
    static int max = 8;
    static int[] array = new int[max];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.printf("一共有%d种解法", count);


    }

    // 放置第n个皇后
    private void check(int n) throws IOException {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n + 1);
            }
        }
    }

    /**
     * @param n 表示第n个皇后
     * @return
     */
    // 查看该皇后是否冲突
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    // 输出
    private void print() throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        count += 1;
        for (int j : array) {
            System.out.print(j + " ");
            arrayList.add(j);
        }
        System.out.println();
        // 以字符流存入文件
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\code\\Java\\File\\Queue8方法",true));
            osw.write(String.valueOf(arrayList));
            osw.write("\n");
            osw.close();
        }
    }

