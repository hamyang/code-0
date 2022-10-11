package 方法;

public class 数组遍历 {
    public static void main(String[] args) {
    int[] arr= {11,22,33,44,55};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+",");
        }
        System.out.println("]");
    }

}
