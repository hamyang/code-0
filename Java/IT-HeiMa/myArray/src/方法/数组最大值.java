package 方法;

public class 数组最大值 {
    public static void main(String[] args) {
    int [] arr= {12,34,65,43,53,54};
    int number = getMax(arr);
        System.out.println(number);
    }
    public static int getMax(int[] arr) {
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
       return(Max);
    }

}
