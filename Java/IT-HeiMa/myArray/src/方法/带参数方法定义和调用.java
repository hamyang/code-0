package 方法;

public class 带参数方法定义和调用 {
    public static void main(String[] args) {
        //常量值调用
        isEvenNumber (9);
        //变量值调用
        int number = 10;
        isEvenNumber(number);
    }

    public static void isEvenNumber (int number){
        if (number % 2 ==0){
            System.out.println("是偶数");
        }else{
            System.out.println("是基数");
        }
    }
}
