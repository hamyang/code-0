public class 数组逆置 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array1 = new int[array.length];
        for (int i=array.length-1;i>=0;i--){
            array1[array.length-1-i]=array[i];
        }
        for (int b:array1){
            System.out.print(b);
        }
    }
}
