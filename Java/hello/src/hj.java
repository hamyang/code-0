import java.io.BufferedReader;
import java.io.InputStreamReader;
interface name{
    public void HuangYang();
    public void ZoomingHoo();
        }
public class hj {
    public static void main(String[] args) throws Exception{
        System.out.println("Enter the code:");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(read.readLine());
        String string1 = read.readLine();
        System.out.println(num1 + " " + string1);
        System.out.println("胡祖铭");
        System.out.println("黄洋");
        System.out.println("王少奇");
        System.out.println("刘雍杰");
        System.out.println("车队滴滴带飞！");
        Huangyang h = new Huangyang();
        h.abc();
    }
}
class xiaohuangyang extends Huangyang{
    Huangyang h = new Huangyang();
}
class xiaoZooming extends ZoomingHoo{
    ZoomingHoo Z = new ZoomingHoo();
}
class Huangyang {
    public int num1 = 9;
    public String string = "wangshaoqi";
    public void abc(){
        System.out.println(string);
    }
}
class ZoomingHoo{
    public int age = 20;
    public String name = "HuZuMing";
    public void out(){
        System.out.println(age+" "+name);
    }
}
class XiaoJie{
    public String name = "LiuYongJie";
    public int age = 19;
    private int sex =0;
}


