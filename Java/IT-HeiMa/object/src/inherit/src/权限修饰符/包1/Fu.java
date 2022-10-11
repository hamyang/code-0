package 权限修饰符.包1;

public class Fu {
    private void show1() {
        System.out.println("private");
    }//仅本类可用

    void show2() {
        System.out.println("默认");
    }    //本类and同一个包中子类无关类

    protected void show3() {
        System.out.println("protected");
    }//本类and同一个包中子类无关类and不同包的子类

    public void show4() {
        System.out.println("public");
    }//本类and同一个包中子类无关类and不同包的子类and不同包无关类

    //创建对象，测试那些方法能用
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
