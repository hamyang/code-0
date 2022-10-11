package 数组;

public class 获取最值 {
    public static void main(String[] args) {
        int[] arr = {21,44,65,87,97,24,4};
        int max = arr[0];
        int min = arr[0];
        for (int x=1;x<arr.length;x++){
            if (max<arr[x]){
                max = arr[x];
            }
        }
        for (int x=1;x<arr.length;x++){
            if (min>arr[x]){
                min = arr[x];
            }
        }

        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
