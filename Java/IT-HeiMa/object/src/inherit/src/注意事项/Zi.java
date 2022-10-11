package 注意事项;

public class Zi extends Fu {
    //    报错原因：父类中的私有内容子类不能访问到
/*       @Override
       private void show(){
           System.out.println("Zi中的show（）方法被调用");
       }*/
    @Override
    public void method() {
        System.out.println("Zi中的method方法被调用");
    }
}
//    子类方法访问权限不能更低
