package 方法重写;
/*新手机*/
public class Newphone extends phone {
/*    public void call(String name) {
        System.out.println("开启视频");
        super.call(name);
    }*/
    @Override  //检查方法重写的正确性
    public void call(String name){
        System.out.println("开启视频功能");
        super.call(name);
    }
}
