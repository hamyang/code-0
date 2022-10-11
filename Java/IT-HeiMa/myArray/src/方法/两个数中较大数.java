package 方法;

public class 两个数中较大数 {
    public static void main(String[] args) {
        //常量
        getMax(4,6);
        //变量
        int a = 10;
        int b = 20;
        getMax(a,b);
    }
    public static void getMax(int a,int b){
        if (a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

}
