package 成员访问特点;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a= new Cat();
        System.out.println(a.age);
        System.out.println(a.weight);//访问的是父类中的

        Cat c = new Cat();
        System.out.println(c.age);
        System.out.println(c.weight);
    }
}

//总结
//成员变量：编译看左边，执行看左边  int age
//成员方法:编译看左边，执行看右边   a.eat
//为什么？
//因为成员方法有重写，而变量没有