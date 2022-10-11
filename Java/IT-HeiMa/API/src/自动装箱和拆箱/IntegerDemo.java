package 自动装箱和拆箱;

//装箱：把基本数据类型转换为对应的包装类类型
//拆箱：把包装类类型转换为对应的基本数据类型
public class IntegerDemo {
    public static void main(String[] args) {
//装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);//手动装箱
        Integer ii = 100;//自动装箱

//拆箱：把包装类类型转换为对应的基本数据类型
        ii = ii.intValue() + 200;//手动拆箱
        ii = ii + 200;//自动拆箱
        System.out.println(ii);

        //不能为空值
    }
}

