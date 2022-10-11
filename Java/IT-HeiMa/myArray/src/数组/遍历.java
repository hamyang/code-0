package 数组;

public class 遍历 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        for (int x=0;x<=5;x++){
            System.out.println(arr[x]);
        }
        System.out.println("------------");
        //改进
        //数组名.length
        //通用格式
        for (int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }
}
