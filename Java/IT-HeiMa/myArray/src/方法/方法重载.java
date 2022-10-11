package 方法;
/*
*   方法重载：
*           多个方法在同一个类中
*           多个方法具有相同的方法名
*           多个方法的参数不相同，类型不同或者数量不同
 */
public class 方法重载 {
    public static void main(String[] args) {//类
    //调用方法
        int result=sun(10,20);
        System.out.println(result);
        double result2 = sun(10.0,20.0);
        System.out.println(result2);
        int result3 = sun(10,20,30);
        System.out.println(result3);

    }
    //需求1：求两个int类型数据和的方法
    public static int sun(int a,int b){//相同的方法名sun
        return a + b;
    }
    //需求2：求两个double类型数据和的方法
    public static double sun(double a,double b){//类型不同
        return a + b;
    }
    //需求3：求三个int类型数据和的方法
    public static int sun(int a,int b,int c){//数量不同
        return a+b+c;
    }
}
