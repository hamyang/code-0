package 集合;

import java.util.ArrayList;

public class 储存字符串并遍历 {
    public static void main(String[] args) {
        ArrayList<String> array= new ArrayList<>();
        array.add("黄洋");
        array.add("李逍遥");
        array.add("安韩瑾");
/*        for (int i=0;i<3;i++){
            System.out.println(array.get(i));
        }*/
//        通用格式
        for (int i=0;i<array.size();i++){
            final String s = array.get(i);
        }
    }
}
