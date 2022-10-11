package 方法;
//return 返回值
public class 带返回值的定义和调用 {
    public static void main(String[] args) {
        //isEvenNumber(10);无意义
        boolean flag = isEvenNumber(10);
        System.out.println(flag);
    }
    public static boolean isEvenNumber(int number){
        if (number % 2==0){
            return true;
        }else{
            return false;
        }
    }
}
