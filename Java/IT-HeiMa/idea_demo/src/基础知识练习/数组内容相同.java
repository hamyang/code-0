package 基础知识练习;

public class 数组内容相同 {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44};
        int [] arr2 = {11,22,33,44};
        boolean flag = compare(arr,arr2);
        System.out.println(flag);
    }
    public  static  boolean  compare(int[] arr,int[] arr2){
        if (arr.length != arr2.length){
            return false;
        }
        for (int x = 0;x<arr.length;x++){
            if (arr[x] != arr2[x]){
                return false;
            }
        }
        return true;


    }
}
