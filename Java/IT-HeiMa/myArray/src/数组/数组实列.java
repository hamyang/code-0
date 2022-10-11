package 数组;

public class 数组实列 {
    public static void main(String[] args) {
        int[] arr = new int [3];
        //输出数组名
        System.out.println(arr);//[I@1b6d3586
        //输出数组中元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[1] = 100;
        arr[2] = 200;
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //定义第二个数组指向第一个数组
        int[] arr2 = arr;
        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr);
        System.out.println(arr2[0]);
        System.out.println("-----------------------------");

        int[] arr3 = {1,2,3};
        //输出数组名
        System.out.println(arr3);
        //输出数组中的元素
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("-----------------------------");

        /*
            索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题 .ArrayIndexOutOfBoundsException
            空指针异常：访问数据已经不再指向堆内存的数据，造成空指针异常 .NullPointerException
            null：空值，引用数据类型的默认值，表示不址向任何有效对象

        */

          int[] arr4 = new int[3];
//        System.out.println(arr4[3]);

        //把null赋值给数组
        arr4 = null;
        System.out.println(arr4[0]);

    }
}
