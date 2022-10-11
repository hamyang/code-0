package 方法;

public class 获取两个数字中较大数 {
    public static void main(String[] args) {
        int result = getMax(10,20);
        System.out.println(result);
//直接打印 System.out.println(getMax(30,40));

    }

    public static int getMax(int a,int b) {
        if (a>b){
            return a;
        }else{
            return b;
        }

    }
}
