package 查找算法;

public class 线性查找 {
    public static void main(String[] args) {
        int[] arr = {32,43,79,43,73,6,24};
        int i = seqSearch(arr, 43);
        if (i==-1){
            System.out.println("未找到该数");
        }else {
            System.out.println("该数的下标为:"+i);
        }
    }
    public static int seqSearch(int[] arr, int value){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}
