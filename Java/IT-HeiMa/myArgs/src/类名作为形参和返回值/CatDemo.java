package 类名作为形参和返回值;
public class CatDemo {
    public static void main(String[] args) {
        CatOperator co=new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.getCat();//Cat c2 = new Cat()
//        Cat c3 = new Cat();为什么不这样？
        c2.cha();
    }
}
