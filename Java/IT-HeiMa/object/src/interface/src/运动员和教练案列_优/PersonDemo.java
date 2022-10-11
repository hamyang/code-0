package 运动员和教练案列_优;
//测试类
public class PersonDemo {
    public static void main(String[] args) {
//       无参 创建对象——运动员
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("-----------------");
//        带参
//        无参创建对象--篮球运动员
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
        bp.study();
//        bp.Speak();篮球运动员不需要说英语
    }
}